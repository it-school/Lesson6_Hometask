package itschool;

public class Auto {
    private int VIN;
    private String model;
    private String color;
    private String owner;

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Auto(int VIN, String model) {
        this.VIN = VIN;
        this.model = model;
    }

    public Auto(int VIN, String model, String color, String owner) {
        this.VIN = VIN;
        this.model = model;
        this.color = color;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "VIN=" + VIN +
                ", model='" + model + '\'' +
                (this.color != null ? ", color='" + color + '\'' : "") +
                (this.owner != null ? ", owner='" + owner + '\'' : "") +
                '}';
    }
}
