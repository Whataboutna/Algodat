public class SelectionSort {
    public static void sort(LinkedList list) {
        Node curr = list.getHead();

        while (curr != null) {
            Node minNode = curr;
            Node nextNode = curr.getNext();

            while (nextNode != null) {
                if (nextNode.getValue() < minNode.getValue()) {
                    minNode = nextNode;
                }
                nextNode = nextNode.getNext();
            }

            // Tukar nilai
            int temp = curr.getValue();
            curr.setValue(minNode.getValue());
            minNode.setValue(temp);

            curr = curr.getNext();
        }
    }
}