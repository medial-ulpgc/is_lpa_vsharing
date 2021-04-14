package model;


public class Vehicle {
    private Integer id;
    private String description;

    public Vehicle() {
    }
    
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
}
