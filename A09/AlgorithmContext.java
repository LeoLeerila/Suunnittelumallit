package A09;

public class AlgorithmContext {
    private AlgorithmStrategy algorithmStrategy;

    public AlgorithmContext(AlgorithmStrategy algorithmStrategy) {
        this.algorithmStrategy = algorithmStrategy;
    }

    public void setStrategy(AlgorithmStrategy algorithmStrategy) {
        this.algorithmStrategy = algorithmStrategy;
    }

    public int[] handleSort(int[] arr) {
        return algorithmStrategy.sort(arr);
    }

    public int getLoops(){
        return algorithmStrategy.getLoops();
    }

    public String getName(){
        return algorithmStrategy.getName();
    }
}
