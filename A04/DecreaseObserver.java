package A04;

public class DecreaseObserver implements Observer {
    private int lastTemperature = 0;

    @Override
    public void update(int temperature){
        System.out.println("DecreaseObserver report");
        if (lastTemperature > temperature) {
            System.out.println("Temperature decreased by " + (lastTemperature - temperature));
        } else {
            System.out.println("No temperature decrease");
        }
        lastTemperature = temperature;
        System.out.println("Current temperature " + temperature);
    }
}
