package view;

import model.Status;
import model.Vehicle;

public interface VehicleReader {
    Status getStatus();
    Vehicle getVehicle();
}
