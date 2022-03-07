package task2;


public class RoadBike implements Bicycle {

    @Override
    public void changeGear(int newGear) {

    }

    @Override
    public void speedUp(int increment) {

    }

    @Override
    public void applyBreaks(int decreasement) {

    }


    private int gear;
    private int speed;

    public RoadBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}