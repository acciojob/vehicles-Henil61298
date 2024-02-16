package com.driver;
class Boat implements WaterVehicle {
    private String name;
    private int capacity;

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
