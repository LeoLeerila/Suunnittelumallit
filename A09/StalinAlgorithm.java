package A09;

import java.util.ArrayList;

public class StalinAlgorithm implements AlgorithmStrategy{
    private int loops = 0;

    

    @Override
    public int[] sort(int[] arr) {
        loops = 0;
        ArrayList<Integer> toSort = new ArrayList<Integer>();
        int last = arr[0];
        int[] sortedarr = null;
        for (int i = 0; i < arr.length; i++){
            if (last <= arr[i]) {
                toSort.add(arr[i]);
                last = arr[i];
            }
        }
        loops++;
        sortedarr = new int[toSort.size()];
        for (int i = 0; i < toSort.size(); i++) {
            sortedarr[i] = toSort.get(i);
        }
        
        return sortedarr;
    }

    @Override
    public int getLoops() {
        return loops;
    }

    @Override
    public String getName() {
        return "Stalin sort";
    }
}
