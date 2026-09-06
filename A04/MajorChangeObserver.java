package A04;

public class MajorChangeObserver implements Observer {
    private int lastTemperature = 0;

    @Override
    public void update(int temperature){
        System.out.println("MajorChangeObserver report");
        if (((lastTemperature - temperature) > 5) || ((lastTemperature - temperature) < -5)) {
            System.out.println("Major temperature change by " + (lastTemperature - temperature));
            lastTemperature = temperature;
        } else {
            System.out.println("No major temperature change");
        }
        System.out.println("Current temperature " + temperature);
    }
}
