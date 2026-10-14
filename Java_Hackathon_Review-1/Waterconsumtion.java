import java.util.*;

public class WaterConsumption {

    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int morningUsage = sc.nextInt();
        int eveningUsage = sc.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);

        System.out.println("Total Water Consumption: " + total + " litres");
    }
}