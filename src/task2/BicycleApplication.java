package task2;

public class BicycleApplication {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(0, 50);
        mountainBike.speedUp(10);
        mountainBike.speedUp(20);
        mountainBike.speedUp(30);
        mountainBike.speedUp(50);
        mountainBike.speedUp(20);
        mountainBike.applyBreaks(30);
        mountainBike.applyBreaks(100);
        mountainBike.applyBreaks(80);
        mountainBike.speedUp(60);
        mountainBike.speedUp(-10);
        mountainBike.applyBreaks(-10);
    }
}
