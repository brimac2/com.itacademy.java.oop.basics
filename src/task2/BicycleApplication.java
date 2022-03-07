package task2;

public class BicycleApplication {
    public static void main(String[] args) {
       MountainBike mountainBike = new MountainBike(1, 20);
//        mountainBike.speedUp(10);
//        mountainBike.speedUp(20);
//        mountainBike.speedUp(30);
//        mountainBike.speedUp(50);
//        mountainBike.speedUp(20);
//        mountainBike.applyBreaks(30);
//        mountainBike.applyBreaks(100);
//        mountainBike.applyBreaks(80);
//        mountainBike.speedUp(60);
//        mountainBike.speedUp(-10);
//        mountainBike.applyBreaks(-10);
//        mountainBike.changeGear(-3);
//        mountainBike.changeGear(21);
//        mountainBike.changeGear(0);
       RoadBike roadBike = new RoadBike(2, 20);
//       roadBike.applyBreaks(2);
//        roadBike.applyBreaks(-2);
//        roadBike.speedUp(60);
//        roadBike.speedUp(5);
//        roadBike.speedUp(-2);
        roadBike.changeGear(2);
Speedometer.chooseWinner(50, 30);
Speedometer.chooseWinner(50, 60);




    }
}
