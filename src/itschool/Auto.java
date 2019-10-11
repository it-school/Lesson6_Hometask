package itschool;

import java.util.Random;

/**
 * Class  for automobile
 */
class Auto {
    private long vin;

    public Auto(long vin, String model) {
        this.setVin(vin);
        this.model = model;
    }
    private String model;
    private String color;
    private String owner;

    public Auto(long vin, String model, String color, String owner) {
        this.setVin(vin);
        this.model = model;
        this.color = color;
        this.owner = owner;
    }

    /**
     * Gets random name of mark
     *
     * @return String
     */
    public static String getRandomMAKER() {
        final String[] MAKERS = {"BMW", "VAZ", "ZAZ", "GAZ", "LUAZ"};
        Random random = new Random();
        return MAKERS[random.nextInt(MAKERS.length)];
    }

    public static boolean isCorrectVIN(String vin) {
        try {
            long tempVIN = Long.parseLong(vin);
            if (tempVIN > 9999999999l && tempVIN < 100000000000l) {
                return true;
            }
        } catch (Exception exc) {
            return false;
        }
        return false;
    }

    public static long getVINIfCorrect(String vin) {
        return isCorrectVIN(vin) ? Long.parseLong(vin) : -1;
    }

    public String getModel() {
        return model;
    }

    public long getVin() {
        return vin;
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

    /**
     * Setter
     *
     * @param vin VIN number of auto
     */
    public void setVin(final long vin) {

        this.vin = vin;

    }

    public void setModel(final String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "VIN=" + vin +
                ", model='" + model + '\'' +
                (!(this.color == null) ? ", color='" + color + '\'' : "") +
                (this.owner != null ? ", owner='" + owner + '\'' : "") +
                '}';
    }
}
