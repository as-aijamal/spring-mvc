package web.model;

public class Car {
    private int id;
    private String model;
    private String producedCountry;


    public Car() {
    }

    public Car(int id, String model, String producedCountry) {
        this.id = id;
        this.model = model;
        this.producedCountry = producedCountry;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducedCountry() {
        return producedCountry;
    }

    public void setProducedCountry(String producedCountry) {
        this.producedCountry = producedCountry;
    }
}
