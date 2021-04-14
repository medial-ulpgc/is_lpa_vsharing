package controller;


import java.util.function.Supplier;
import model.Vehicle;
import view.VehicleCreator;
import view.VehicleViewer;

public class CreateVehicleCommand implements Command {

    private final VehicleCreator vehicleCreator;
    private final VehicleViewer vehicleViewer;
    private final Supplier<Vehicle> vehicleSupplier;
    

    public CreateVehicleCommand(VehicleCreator vehicleCreator ,VehicleViewer vehicleViewer, Supplier<Vehicle> vehicleSupplier) {
        this.vehicleCreator = vehicleCreator;
        this.vehicleViewer = vehicleViewer;
        this.vehicleSupplier = vehicleSupplier;
        
        
    }

    @Override
    public void process() {
        vehicleViewer.viewVehicle(vehicleCreator.createVehicle(vehicleSupplier.get()));
    }

}
