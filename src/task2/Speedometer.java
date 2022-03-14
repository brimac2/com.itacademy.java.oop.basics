package task2;

public class Speedometer {

    public static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {
        if (mountainBikeSpeed > roadBikeSpeed) {
            System.out.println("Faster bike by speed is " + Bike.MOUNTAIN.getBikeType());
        }
        if (mountainBikeSpeed < roadBikeSpeed) {
            System.out.println("Faster bike by speed is " + Bike.ROAD.getBikeType());
        }
        return null;
    }

    public static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        if (mountainBike.getSpeed() > roadBike.getSpeed()) {
            System.out.println("Faster bike by speed is " + Bike.MOUNTAIN.getBikeType());
        }
        if (mountainBike.getSpeed() < roadBike.getSpeed()) {
            System.out.println("Faster bike by speed is " + Bike.ROAD.getBikeType());
        }
        return null;
    }
}

