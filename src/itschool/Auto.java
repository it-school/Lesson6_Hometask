package itschool;

import java.util.Objects;
import java.util.Random;

/**
 * Class for automobile
 */
class Auto {
   private long vin;
   private String model;
   private String color;
   private String owner;

   public Auto(long vin, String model) {
      this.setVin(vin);
      this.model = model;
   }

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

   /**
    * @param model
    */
   public void setModel(final String model) {
      this.model = model;
   }

   public long getVin() {
      return vin;
   }

   /**
    * Setter
    *
    * @param vin VIN number of auto
    */
   public void setVin(final long vin) {

      this.vin = vin;

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

   @Override
   public String toString() {
      return "Auto{" +
              "VIN=" + vin +
              ", model='" + model + '\'' +
              (!(this.color == null) ? ", color='" + color + '\'' : "") +
              (this.owner != null ? ", owner='" + owner + '\'' : "") +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Auto auto = (Auto) o;
      return getVin() == auto.getVin() && Objects.equals(getModel(), auto.getModel()) && Objects.equals(getColor(), auto.getColor()) && Objects.equals(getOwner(), auto.getOwner());
   }

   @Override
   public int hashCode() {
      return Objects.hash(getVin(), getModel(), getColor(), getOwner());
   }
}
