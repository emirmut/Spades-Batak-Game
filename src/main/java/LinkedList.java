public class LinkedList {
    protected Node head; // head (first) node of a linked list
    protected Node tail; // tail (last) node of a linked list

    public LinkedList() { // Constructor

    }

    /**
     * inserts a node at the beginning of a linked list
     * @param newNode node to be inserted
     */
    public void insertFirst(Node newNode) {

    }

    /**
     * inserts a node at the end of a linked list
     * @param newNode node to be inserted
     */
    public void insertLast(Node newNode) {

    }

    /**
     * inserts a node to middle of a linked list
     * @param newNode node to be inserted
     * @param previous previous node of the newNode
     */
    public void insertMiddle(Node newNode, Node previous) {

    }

    /**
     *
     * @return the number of elements in a linked list
     */
    public int numberOfElements() {

    }

    /**
     * returns the ith node in a linked list
     * @param i index of the node
     * @return the ith node in a linked list
     */
    public Node getNodeI(int i) {

    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node tmp = head;
        while (tmp != null) {
            result.append(tmp).append(" ");
            tmp = tmp.getNext();
        }
        return result.toString();
    }

    /**
     *
     * @param node node who is next to previous
     * @return the previous node of the parameter node
     */
    public Node getPrevious(Node node) {

    }

    /**
     * deletes the first element of a linked list
     */
    public void deleteFirst() {

    }

    /**
     * deletes the last element of a linked list
     */
    public void deleteLast() {

    }

    /**
     * deletes an element which is neither first element nor last element of a linked list
     * @param node node to be deleted
     */
    public void deleteMiddle(Node node) {

    }
}
