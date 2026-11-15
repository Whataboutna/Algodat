public class MergeSort {
    public static void sort(LinkedList list) {
        list.setHead(mergeSort(list.getHead()));
    }

    private static Node mergeSort(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.getNext();
        middle.setNext(null);

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return merge(left, right);
    }

    private static Node merge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        Node result;
        if (left.getValue() <= right.getValue()) {
            result = left;
            result.setNext(merge(left.getNext(), right));
        } else {
            result = right;
            result.setNext(merge(left, right.getNext()));
        }
        return result;
    }

    private static Node getMiddle(Node head) {
        if (head == null) return head;
        Node slow = head, fast = head;

        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }
}