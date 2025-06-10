import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double costPerHour = 120.25;
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the Student's Id: ");
        String studentId = myScanner.nextLine();

        System.out.print("Enter the Student's full name: ");
        String studentName = myScanner.nextLine();

        System.out.println();

        System.out.print("Enter crn/credit hours for the first class(like 5665/3): ");
        String classInfo1 = myScanner.nextLine();

        System.out.print("Enter crn/credit hours for the second class(like 5665/3): ");
        String classInfo2 = myScanner.nextLine();

        int crn1 = splitString(classInfo1)[0];
        int hours1 = splitString(classInfo1)[1];
        double cost1 = hours1 * costPerHour;

        int crn2 = splitString(classInfo2)[0];
        int hours2 = splitString(classInfo2)[1];
        double cost2 = hours2 * costPerHour;

        System.out.println();
        System.out.println("Thank you!");
        System.out.println("Fee invoice prepared for: " + studentName);
        System.out.println("\n");

        System.out.println("\t\tSIMPLE COLLEGE");
        System.out.println("\t\tORLANDO FL 10101");
        System.out.println("\t\t*************************");

        System.out.println();

        System.out.println("\t\tFee Invoice Prepared for:");
        System.out.println("\t\t [" + studentName + "] " + studentId + "]");

        System.out.println();

        System.out.println("\t\t1 Credit Hour = " + costPerHour);

        System.out.println();

        System.out.println("\t\tCRN       CREDIT HOURS");
        System.out.println("\t\t" + crn1 + "      " + hours1 + "                   " + "$" + cost1);
        System.out.println("\t\t" + crn2 + "      " + hours2 + "                   " + "$" + cost2);

        System.out.println();

        System.out.println("\t\t          " + "Health & id fees" + "    " + "$35.00");

        System.out.println();

        System.out.println("\t\t----------------------------------------");

        System.out.println("\t\t          " + "Total Payments" + "      " + "$" + (cost1 + cost2 + 35) + "   ");
    }

    public static int[] splitString(String classInfo) {
        String[] stringArray;
        int[] intArray = new int[2];

        stringArray = classInfo.split("/");
        intArray[0] = Integer.parseInt(stringArray[0]);
        intArray[1] = Integer.parseInt(stringArray[1]);
        return intArray;
    }
}

