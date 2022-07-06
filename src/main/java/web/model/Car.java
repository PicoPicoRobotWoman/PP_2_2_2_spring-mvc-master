package web.model;

public class Car {

    private int id;
    private String model;
    private int service;

    public Car() {

    }

    public Car(int id, String model, int service) {
        this.id = id;
        this.model = model;
        this.service = service;
    }

    public int getId() { return id; }
    public String getModel() { return model; }
    public int getService() { return service; }

}
