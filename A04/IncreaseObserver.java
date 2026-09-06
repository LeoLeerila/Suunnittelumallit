package A04;

public class IncreaseObserver implements Observer {
    private int lastTemperature = 0;

    @Override
    public void update(int temperature){
        System.out.println("IncreaseObserver report");
        if (lastTemperature < temperature) {
            System.out.println("Temperature increased by " + (temperature - lastTemperature));
        } else {
            System.out.println("No temperature increase");
        }
        lastTemperature = temperature;
        System.out.println("Current temperature " + temperature);
    }
}
