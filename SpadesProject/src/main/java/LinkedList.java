public class LinkedList {
    protected Node head; // head (first) node of a linked list
    protected Node tail; // tail (last) node of a linked list

    public LinkedList() { // Constructor
        head = null;
        tail = null;
    }

    /**
     * inserts a node at the beginning of a linked list
     * @param newNode node to be inserted
     */
    public void insertFirst(Node newNode) {
        if (tail == null) {
            tail = newNode;
        }
        newNode.setNext(head);
        head = newNode;
    }

    /**
     * inserts a node at the end of a linked list
     * @param newNode node to be inserted
     */
    public void insertLast(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    /**
     * inserts a node to middle of a linked list
     * @param newNode node to be inserted
     * @param previous previous node of the newNode
     */
    public void insertMiddle(Node newNode, Node previous) {
        newNode.setNext(previous.getNext());
        previous.setNext(newNode);
    }

    /**
     * @param value The value to be searched.
     * @return The node that has the data value. If no node exists, returns null.
     */
    public Node search(int value) { // searches and afterwards finds the desired node in a linked list
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == value) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    /**
     *
     * @return the number of elements in a linked list
     */
    public int numberOfElements() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    /**
     * returns the ith node in a linked list
     * @param i index of the node
     * @return the ith node in a linked list
     */
    public Node getNodeI(int i) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (index == i) {
                return temp;
            }
            temp = temp.getNext();
            index++;
        }
        return null;
    }

   /**
     * transforms the linkedlist structure into string
     * @return string version of the linkedlist
    */
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
        Node temp = head;
        Node previous = null;
        while (temp != node) {
            previous = temp;
            temp = temp.getNext();
        }
        return previous;
    }

    /**
     * deletes the first element of a linked list
     */
    public void deleteFirst() {
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
    }

    /**
     * deletes the last element of a linked list
     */
    public void deleteLast() {
        tail = getPrevious(tail);
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
    }

    /**
     * deletes an element which is neither first element nor last element of a linked list
     * @param node node to be deleted
     */
    public void deleteMiddle(Node node) {
        Node previous = getPrevious(node);
        previous.setNext(node.getNext());
    }

    /**
     * deletes a particular node
     * @param node node to be deleted if the node is in the middle of a linked list
     */
    public void deleteNode(Node node) {
        if (node == head) {
            deleteFirst();
        } else if (node == tail) {
            deleteLast();
        } else {
            deleteMiddle(node);
        }
    }

    /**
     * sorts the linked-list
     */
    public void sortList() {
        Node current = head
        Node index = null;
        int temp;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
}
