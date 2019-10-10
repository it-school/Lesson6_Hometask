package itschool;

import java.util.Random;

public class Main {

    static String [] mark = {"BMW", "VAZ", "ZAZ", "GAZ", "LUAZ"};

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        Auto auto1 = new Auto(1234567890, "BYD");
        Auto auto2 = new Auto(2345678, "BMW", "silver", "asgdthsfydjukfig");
        Auto auto3 = new Auto(random.nextInt(1000000000), mark[random.nextInt(mark.length)]);
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);


    }
}
