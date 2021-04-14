
package model;
public class Vehicle {
    private Integer id;
    private final String description;

    public Vehicle(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void updateId (Vehicle vehicle){
        this.id = vehicle.getId();
        
    }
}
