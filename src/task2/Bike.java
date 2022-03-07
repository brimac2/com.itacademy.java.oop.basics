package task2;

public enum Bike {
    MOUNTAIN("Mountain Bike"),
    ROAD("Road Bike");
    private final String desc;

    Bike(String description) {
        desc = description;
    }

    public String getDesc() {
        return desc;
    }
}
