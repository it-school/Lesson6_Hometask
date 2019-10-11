package itschool;

import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int p = 123;
        System.out.println(String.format("%06d", p));
        Object object = new Object();
        object = 1;
        System.out.println(object.getClass());
        object = "thysjtd";
        System.out.println(object.getClass());


        Random random = new Random();
        final Auto auto1 = new Auto(random.nextInt(1000000000), "BYD");
        object = auto1;
        System.out.println(object.getClass());

        Auto auto2 = new Auto(-2345678, "BMW", "silver", "asgdthsfydjukfig");
        //auto2.setVin(-231425365);
        Scanner scanner = new Scanner(System.in);
        String vin = "";
        do {
            System.out.println("Input correct VIN (11 digits):");
            vin = scanner.nextLine();
        } while (!Auto.isCorrectVIN(vin));
        Auto auto3 = new Auto(Long.parseLong(vin), Auto.getRandomMAKER());

        long VIN = 0;
        do {
            System.out.println("Input correct VIN (11 digits):");
            VIN = Auto.getVINIfCorrect(scanner.nextLine());
        } while (VIN == -1);

        Auto auto4 = new Auto(VIN, Auto.getRandomMAKER());
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println(auto4);
    }
}
