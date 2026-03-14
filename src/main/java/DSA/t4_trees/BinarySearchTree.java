package DSA.t4_trees;

public class BinarySearchTree {
    public Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value){
        Node node = new Node(value);
        if(root == null){
            root = node;
            return true;
        }
        Node temp = root;
        while (true){
            if(temp.value> node.value){

                if(temp.left == null){
                    temp.left = node;
                    return true;
                }
                temp = temp.left;
            } else if (temp.value < node.value) {
                if(temp.right == null){
                    temp.right = node;
                    return true;
                }
                temp = temp.right;
            }else {
                return false;
            }
        }
    }

    public boolean contains(int value){
        if(root == null) return false;
        Node temp = root;
        while (temp!=null){
            if(temp.value == value) return true;
            if(temp.value>value){
                temp = temp.left;
            }else {
                temp = temp.right;
            }

        }
        return false;
    }

    public boolean recursiveContains(Node node,int value){
        if(node == null) return false;
        if(node.value == value){
            return true;
        }else if(node.value>value){
            return recursiveContains(node.left, value);
        }
        else {
            return recursiveContains(node.right, value);
        }
    }

    public boolean recursiveContains(int value){
        return recursiveContains(root,value);
    }

    private boolean recursiveInsert(Node node,int value){
        if(node == null){
            root =  new Node(value);
            return true;
        }
        if(node.value == value) {
            return false;
        }else if(node.value>value){
            if(node.left == null){
                node.left = new Node(value);
                return true;
            }else{
                return recursiveInsert(node.left, value);
            }
        }else{
            if(node.right == null){
                node.right = new Node(value);
                return true;
            }else{
                return recursiveInsert(node.right, value);
            }
        }

    }

    public boolean recursiveInsert(int value){
        return recursiveInsert(root,value);
    }
    // this is the solution from the course. This is way cleaner lmao
    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);

        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rInsert(currentNode.right, value);
        }

        return currentNode;
    }

    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }

    private Node deleteNode(Node currentNode, int value){
        if(currentNode == null){
            return null;
        }
        if(currentNode.value>value){
           currentNode.left =  deleteNode(currentNode.left,value);
        }
        if(currentNode.value<value){
            currentNode.right = deleteNode(currentNode.right,value);
        }

        // after a very long think I came up with the sol I think
        // basically, you attach the node.r instead of deleted node
        // and attach the node.l to the left of the right node.
        // it turns out my soluiton is valid but htere is a cleaner way
        // to make all of these.
        if(currentNode.value == value){
            Node leftNode = currentNode.left;
            Node rightNode = currentNode.right;
            Node nodeToReturn;
            if(leftNode!=null && rightNode!=null)
            {
                nodeToReturn = rightNode;
                (findMin(nodeToReturn)).left = currentNode.left;
            } else if (rightNode!=null) {
                nodeToReturn = rightNode;
            }else {
                nodeToReturn = leftNode;
            }
            currentNode.left =null;
            currentNode.right = null;
            return nodeToReturn;
        }
        return currentNode;
    }

    private Node findMin(Node node){
        if(node.left==null)
        {
            return node;
        }
        return findMin(node.left);
    }

    public Node deleteNode(int value){
        return deleteNode(root, value);
    }

    // Now the textbook delete algo

    private Node textBookDelete(Node node, int value) {
        if (node == null) return null;

        if (value < node.value)
            node.left = textBookDelete(node.left, value);
        else if (value > node.value)
            node.right = textBookDelete(node.right, value);
        else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            Node min = textBookFindMin(node.right);
            node.value = min.value;
            node.right = textBookDelete(node.right, min.value);
        }
        

        return node;
    }

    private Node textBookFindMin(Node node) {
        while (node.left != null)
            node = node.left;
        return node;
    }





 //
}

