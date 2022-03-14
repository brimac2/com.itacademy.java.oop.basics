package task2;

import com.itacademy.java.oop.basics.basics.Employee;

public enum Bike {
    MOUNTAIN, ROAD;

    public String getBikeType() {
        switch (this) {
            case ROAD:
                return "Road Bike";
            case MOUNTAIN:
                return "Mountain Bike";
            default:
                return null;
        }
    }
}


