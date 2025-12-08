package model;

import exception.BrokenCarException;

import java.time.Duration;
import java.util.Random;

public class Car implements Runnable{
    private String name;
    private double speed;
    private boolean isWrong;

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < 30; i++) {

            try {
                int luck = random.nextInt(100);
                if(luck<1) throw new BrokenCarException("Xe "+this.name +" bi no lop");
                Thread.sleep(100 + random.nextInt((int)this.speed-100+1));
                System.out.println("Xe "+this.name+" da chay duoc " + (i+1) + " km");
            } catch (Exception e) {
                return;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }
    public Car(){

    }

}
