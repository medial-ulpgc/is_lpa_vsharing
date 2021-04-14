/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import app.StaticVehicle;
import controller.CreateVehicleCommand;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Vehicle;
import view.VehicleViewer;

/**
 *
 * @author Lab-DIS
 */
@WebService(serviceName = "VehicleSuperService")
public class VehicleService {

    StaticVehicle staticVehicle = new StaticVehicle();
    StaticVehicleViewer staticVehicleViewer = new StaticVehicleViewer();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "createVehicle")
    public Vehicle createVehicle(@WebParam(name = "id") int id, @WebParam(name = "description") String description) {
        Vehicle vehicle = new Vehicle(id, description);
        CreateVehicleCommand createVehicleCommand = new CreateVehicleCommand(staticVehicle, staticVehicleViewer, () -> vehicle);
        createVehicleCommand.process();
        return staticVehicleViewer.response;
    }

    class StaticVehicleViewer implements VehicleViewer{
        Vehicle response;
        @Override
        public void viewVehicle(Vehicle vehicle) {
            response = vehicle;
        }
        
    }
    
}
