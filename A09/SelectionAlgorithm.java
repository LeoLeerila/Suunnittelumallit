package A09;

public class SelectionAlgorithm implements AlgorithmStrategy{
    private int loops = 0;

    @Override
    public int[] sort(int[] arr) { //https://www.geeksforgeeks.org/dsa/selection-sort-algorithm-2/
        loops = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int o = i+1; o < arr.length; o++) {
                if (arr[o] < arr[min]) {
                    min = o;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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
        return "Selection sort";
    }
}
