package task2;

public class MountainBike implements Bicycle {

    private int MinSpeed = -10;
    private int MaxSpeed = 100;
    private int gear;
    private int speed;

    @Override
    public void changeGear(int newGear) {

    }

    @Override
    public void speedUp(int increment) {
        if ( increment < 0) {
            System.out.println("Your number is negative, please use positive numbers");
        } else if (speed + increment > MaxSpeed) {
            int allowanceIncrement = MaxSpeed - speed;
            System.out.println("Speed is too high, it can be increased " + allowanceIncrement );
        } else {
            speed +=increment;
            System.out.println("It is a new speed " + speed);
        }

    }

    @Override
    public void applyBreaks(int decreasement) {
        if (decreasement < 0){
            System.out.println("Your number is negative, please use positive numbers");
        } else if (speed - decreasement < MinSpeed) {
            int allowance = speed - MinSpeed;
            System.out.println("Value is too high you can break at " + allowance);
        } else {
            speed -= decreasement;
            System.out.println("Your speed is " + speed);
        }
    }

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

}