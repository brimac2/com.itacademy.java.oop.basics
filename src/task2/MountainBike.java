package task2;

public class MountainBike implements Bicycle {

    private static final int MIN_SPEED = -10;
    private static final int MAX_SPEED = 100;
    private int gear;
    private int speed;


    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear != 1 || newGear != -1) {
            System.out.println("Your number is not allowed, please use -1 or 1");
        } else if (gear + newGear < 0 || gear + newGear > 20) {
            System.out.println("Gear should be maximum 20 or below 0");
        } else {
            gear += newGear;
            System.out.println("It is new gear " + gear);
        }
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            System.out.println("Your number is negative, please use positive numbers");
        } else if (speed + increment > MAX_SPEED) {
            int allowanceIncrement = MAX_SPEED - speed;
            System.out.println("Speed is too high, it can be increased " + allowanceIncrement);
        } else {
            speed += increment;
            System.out.println("It is a new speed Mountain Bike speed " + speed);
        }

    }

    @Override
    public void applyBreaks(int decreasement) {
        if (decreasement < 0) {
            System.out.println("Your number is negative, please use positive numbers");
        } else if (speed - decreasement < MIN_SPEED) {
            int allowance = speed - MIN_SPEED;
            System.out.println("Value is too high you can break at " + allowance);
        } else {
            speed -= decreasement;
            System.out.println("Your speed is " + speed);
        }
    }


    public int getSpeed() {
        return speed;
    }

}