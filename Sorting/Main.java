import java.util.Arrays;

public class Main {
    public static void printArray(String label, int[] arr) {
        System.out.println(label + ": " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] dataAwal = {64, 34, 25, 12, 22, 11, 90};
        printArray("Data Awal     ", dataAwal);
        System.out.println("------------------------------------------");

        // 1. Bubble Sort
        int[] arrBubble = dataAwal.clone();
        BubbleSort.sort(arrBubble);
        printArray("Bubble Sort   ", arrBubble);

        // 2. Selection Sort
        int[] arrSelection = dataAwal.clone();
        SelectionSort.sort(arrSelection);
        printArray("Selection Sort", arrSelection);

        // 3. Insertion Sort
        int[] arrInsertion = dataAwal.clone();
        InsertionSort.sort(arrInsertion);
        printArray("Insertion Sort", arrInsertion);

        // 4. Merge Sort
        int[] arrMerge = dataAwal.clone();
        MergeSort.sort(arrMerge, 0, arrMerge.length - 1);
        printArray("Merge Sort    ", arrMerge);

        // 5. Quick Sort
        int[] arrQuick = dataAwal.clone();
        QuickSort.sort(arrQuick, 0, arrQuick.length - 1);
        printArray("Quick Sort    ", arrQuick);
    }
}