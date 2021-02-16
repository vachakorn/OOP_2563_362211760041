package LAB7;

public class Car {

    //attributes
    private String id;
    private String color;
    private String Brand;

    public Car() {
    }

    public Car(String id, String color, String brand) {
        this.id = id;
        this.color = color;
        Brand = brand;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                ", Brand='" + Brand + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }
}
