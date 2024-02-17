package com.driver;
class Boat implements WaterVehicle {
    String name;
    int capacity;
    Boat(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return this.name;
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
