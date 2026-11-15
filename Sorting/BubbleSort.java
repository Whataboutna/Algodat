public class BubbleSort {
    public static void sort(LinkedList list) {
        Node head = list.getHead();
        if (head == null || head.getNext() == null) return;

        boolean swapped;
        Node end = null;

        do {
            swapped = false;
            Node curr = head;

            while (curr.getNext() != end) {
                Node nextNode = curr.getNext();
                if (curr.getValue() > nextNode.getValue()) {
                    int temp = curr.getValue();
                    curr.setValue(nextNode.getValue());
                    nextNode.setValue(temp);
                    swapped = true;
                }
                curr = curr.getNext();
            }
            end = curr;
        } while (swapped);
    }
}