public class QuickSort {
    public static void sort(LinkedList list) {
        Node head = list.getHead();
        if (head == null || head.getNext() == null) return;

        Node tail = getTail(head);
        quickSort(head, tail);
    }

    private static void quickSort(Node start, Node end) {
        if (start == null || start == end || start == end.getNext()) {
            return;
        }

        Node pivotPrev = partition(start, end);
        quickSort(start, pivotPrev);

        if (pivotPrev != null && pivotPrev == start) {
            quickSort(pivotPrev.getNext(), end);
        } else if (pivotPrev != null && pivotPrev.getNext() != null) {
            quickSort(pivotPrev.getNext().getNext(), end);
        }
    }

    private static Node partition(Node start, Node end) {
        if (start == end || start == null || end == null) {
            return start;
        }

        Node pivotPrev = start;
        Node curr = start;
        int pivot = end.getValue();

        while (start != end) {
            if (start.getValue() < pivot) {
                pivotPrev = curr;
                int temp = curr.getValue();
                curr.setValue(start.getValue());
                start.setValue(temp);
                curr = curr.getNext();
            }
            start = start.getNext();
        }

        int temp = curr.getValue();
        curr.setValue(pivot);
        end.setValue(temp);

        return pivotPrev;
    }

    private static Node getTail(Node curr) {
        while (curr != null && curr.getNext() != null) {
            curr = curr.getNext();
        }
        return curr;
    }
}