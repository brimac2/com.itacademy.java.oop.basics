package task2;


public class RoadBike implements Bicycle {

    private int MinSpeedRoadBike = 0;
    private int MaxSpeedRoadBike = 50;




    @Override
    public void changeGear(int newGear) {
        if (newGear < 2) {
            System.out.println("Your number is not allowed, please use 2");
        } else if (newGear <1) {
            System.out.println("Your number is not allowed, please use 1");
        } else if (newGear <-1) {
            System.out.println("Your number is not allowed, please use -1");
        } else if (newGear <-2) {
            System.out.println("Your number is not allowed, please use -2");
        }else if (gear +newGear > 0) {
            System.out.println("It is new Road Bike gear " + (gear + newGear));
        }
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0){
            System.out.println("It is negative number, please use positive numbers");
        } else if(speed + increment > MaxSpeedRoadBike) {
            int maxIncrementofRoadBike = MaxSpeedRoadBike - speed;
            System.out.println("Speed is too high, the highest possible increment can be " + maxIncrementofRoadBike );
        } else {
            System.out.println("It is a new Road Bike speed " + (speed+increment));
        }

    }

    @Override
    public void applyBreaks(int decreasement) {
        if (decreasement >= 0) {
            System.out.println("Your number is positive, please use negative numbers");
        }else if (speed < 0);

    }

    private int roadBikeSpeed;
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