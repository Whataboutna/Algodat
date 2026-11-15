public class Main {
    public static void main(String[] args) {
        LinkedList dataAwal = new LinkedList();
        int[] angka = {64, 34, 25, 12, 22, 11, 90};
        for (int n : angka) {
            dataAwal.add(n);
        }

        System.out.print("Data Awal     : ");
        dataAwal.print();
        System.out.println("--------------------------------------------------");

        // 1. Bubble Sort
        LinkedList listBubble = dataAwal.copy();
        BubbleSort.sort(listBubble);
        System.out.print("Bubble Sort   : ");
        listBubble.print();

        // 2. Selection Sort
        LinkedList listSelection = dataAwal.copy();
        SelectionSort.sort(listSelection);
        System.out.print("Selection Sort: ");
        listSelection.print();

        // 3. Insertion Sort
        LinkedList listInsertion = dataAwal.copy();
        InsertionSort.sort(listInsertion);
        System.out.print("Insertion Sort: ");
        listInsertion.print();

        // 4. Merge Sort
        LinkedList listMerge = dataAwal.copy();
        MergeSort.sort(listMerge);
        System.out.print("Merge Sort    : ");
        listMerge.print();

        // 5. Quick Sort
        LinkedList listQuick = dataAwal.copy();
        QuickSort.sort(listQuick);
        System.out.print("Quick Sort    : ");
        listQuick.print();
    }
}