public class InsertionSort {
    public static void sort(LinkedList list) {
        Node sorted = null;
        Node curr = list.getHead();

        while (curr != null) {
            Node next = curr.getNext();
            sorted = insertSorted(sorted, curr);
            curr = next;
        }
        list.setHead(sorted);
    }

    private static Node insertSorted(Node sortedHead, Node newNode) {
        if (sortedHead == null || newNode.getValue() <= sortedHead.getValue()) {
            newNode.setNext(sortedHead);
            return newNode;
        }

        Node curr = sortedHead;
        while (curr.getNext() != null && curr.getNext().getValue() < newNode.getValue()) {
            curr = curr.getNext();
        }
        newNode.setNext(curr.getNext());
        curr.setNext(newNode);
        return sortedHead;
    }
}