package A09;

public class BubbleAlgorithm implements AlgorithmStrategy{
    private int loops = 0;
    private boolean isSorted(int[] arr){
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                sorted = false;
            }
        }
        return sorted;
    }

    @Override
    public int[] sort(int[] arr) { //https://www.geeksforgeeks.org/dsa/bubble-sort-algorithm/
        loops = 0;
        boolean sorted = isSorted(arr);
        while (!sorted) {
            for (int i = 0; i < arr.length - 1; i++){
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            sorted = isSorted(arr);
            loops++;
        }
        return arr;
    }

    @Override
    public int getLoops() {
        return loops;
    }

    @Override
    public String getName() {
        return "Bubble sort";
    }
}
