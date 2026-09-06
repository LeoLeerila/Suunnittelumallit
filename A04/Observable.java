package A04;

import java.util.ArrayList;
import java.util.Random;

public abstract class Observable extends Thread {
    protected ArrayList<Observer> observers = new ArrayList<Observer>();
    protected int temperature;
    protected volatile int time = 0;

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public int getTime(){
        return time;
    }

    public void run(){
        Random random = new Random();
        int newTemp;
        //set min and max temperatures
        int maxTemp = 70, minTemp = -20;
        //set inital temperature
        temperature = random.nextInt(maxTemp - minTemp + 1) + minTemp;

        //eternal loop
        while (true) {
            //sleep for 1 sec
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            newTemp = random.nextInt(2);
            //System.out.println(newTemp);
            if (newTemp == 0 && (temperature + 1) < maxTemp){
                temperature++;
            } else if (newTemp == 1 && (temperature - 1) > minTemp){
                temperature--;
            }

            notifyObservers();
            System.out.println("Current time " + getTime());
            time++;
        }
    }
}
