package task2;

public class MountainBike implements Bicycle {

   private int gear;
   private int speed;

    @Override
    public void changeGear(int newGear) {

    }

    @Override
    public void speedUp(int increment) {

    }

    @Override
    public void applyBreaks() {

    }

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
    
}