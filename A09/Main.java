package A09;

import java.util.Random;

public class Main {
    private static int loops = 0;
    private static int runs = 0;
    private static int failed = 0;
    private static boolean[] failedRuns;
    private static String currentAlgorithm;

    public static void main(String[] args) {
        //small datasets
        runAlgorithm(new BubbleAlgorithm(), 10, 1000);
        runAlgorithm(new SelectionAlgorithm(), 10, 1000);
        runAlgorithm(new StalinAlgorithm(), 10, 1000);

        //large datasets
        runAlgorithm(new BubbleAlgorithm(), 10, 10000);
        runAlgorithm(new SelectionAlgorithm(), 10, 10000);
        runAlgorithm(new StalinAlgorithm(), 1000, 100000);
        
    }

    private static int[] makeArray(int arrayLength){
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arr.length; i++){
            Random r = new Random();
            arr[i] = r.nextInt(1001);
        }
        return arr;
    }

    private static void runAlgorithm(AlgorithmStrategy algorithm, int times, int arrayLength){
        AlgorithmContext algorithmHandler = new AlgorithmContext(algorithm);
        currentAlgorithm = algorithmHandler.getName();
        loops = 0;
        runs = times;
        failed = 0;
        failedRuns = new boolean[times];
        while (times > 0) {
            //System.out.println("run: " + (runs - times));
            int[] arr;
            arr = algorithmHandler.handleSort(makeArray(arrayLength));
            loops += algorithmHandler.getLoops();
            failedRuns[runs - times] = isSorted(arr);
            if (!isSorted(arr)) {
                failed++;
            }
            times--;
            //System.out.println("runs left: " + times);
        }

        printResults();
        
    }

    private static void printResults(){
        System.out.println("\n" + currentAlgorithm);
        System.out.println("total times run: " + runs);
        System.out.println("total loops: " + loops);
        System.out.println("average loops per run: " + (double) ((double)loops / (double)runs));
        System.out.println("failed runs: " + failed);
        for (int i = 0; i < failedRuns.length; i++) {
            if (!failedRuns[i]) {
                System.out.println(failedRuns[i]);
                System.out.println("run " + i + " failed, array is not in ascending order");
            }
        }
    }

    private static boolean isSorted(int[] arr){
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                sorted = false;
            }
        }
        return sorted;
    }
}
