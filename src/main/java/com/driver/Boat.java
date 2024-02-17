package com.driver;
class Boat implements WaterVehicle {
    private String name;
    private int capacity;
//    Boat(String name, int capacity){
//        this.name = name;
//        this.capacity = capacity;
//    }

    @Override
    public String getVehicleName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getCapacity() {
        return 0;
    }
}
