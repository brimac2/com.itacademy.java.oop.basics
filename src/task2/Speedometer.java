package task2;

public class Speedometer {

    public static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        if (mountainBike.getSpeed() > roadBike.getSpeed()) {
            return Bike.MOUNTAIN;
        }
        if (mountainBike.getSpeed() < roadBike.getSpeed()) {
            return Bike.ROAD;
        }
        return null;
    }


    public static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {
        if (mountainBikeSpeed > roadBikeSpeed) {
            return Bike.MOUNTAIN;
        }
        if (mountainBikeSpeed < roadBikeSpeed) {
            return Bike.ROAD;
        }
        return null;
    }
}
