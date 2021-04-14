package app;

import model.Vehicle;
import view.VehicleCreator;


public class StaticVehicle implements VehicleCreator{

    private static Vehicle vehicle;

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        StaticVehicle.vehicle = vehicle;
        return StaticVehicle.vehicle;
    }
}
