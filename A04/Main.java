package A04;

public class Main {
    public static void main(String[] args) {
        Observable weatherStation = new WeatherStation();
        Observer decreaseObserver = new DecreaseObserver();
        Observer increaseObserver = new IncreaseObserver();
        Observer majorChangeObserver = new MajorChangeObserver();

        weatherStation.start();
        weatherStation.addObserver(decreaseObserver);
        weatherStation.addObserver(increaseObserver);
        weatherStation.addObserver(majorChangeObserver);
        System.out.println("add observers");

        boolean go = true;
        int wttime = weatherStation.getTime();
        System.out.println(wttime);
        while (go) {
            //wttime = weatherStation.getTime();
            //System.out.println(wttime);
            if (weatherStation.getTime() > 3){
                go = false;
            }
        }

        weatherStation.removeObserver(decreaseObserver);
        System.out.println("remove observer");
        

        while (true) {}
    }
}
