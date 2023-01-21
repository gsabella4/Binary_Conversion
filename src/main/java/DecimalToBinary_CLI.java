import java.util.Scanner;

public class DecimalToBinary_CLI {

    public static void decimalToBinary(int input) {
        String binaryResult = "";
        int binaryInteger = input;

        while (binaryInteger > 0){
            int eachModulus = binaryInteger%2;
            binaryResult = String.valueOf(eachModulus) + binaryResult;
            binaryInteger /= 2;
        }
        int bitCount = Integer.bitCount(input);
        System.out.println("\n" + input + " converted to binary is " + binaryResult);
        System.out.println("The bitcount is " + bitCount);
    }

    public static void binaryToDecimal(String binaryInput){
        int decimal = Integer.parseInt(binaryInput, 2);
        System.out.println("\n" + binaryInput + " converted to decimal is " + decimal);
    }

    public static void main(String[] args) {

        // To-do:
        // - exception handling
        // - input, output classes
        // - classes to hold methods
        // - tweak formatting

        System.out.println("\n\n\t Welcome to the Binary Converter!");
        System.out.println("\n☆彡･:*:･★彡･:*:･☆彡･:*:･★彡･:*:･☆彡･:*:･★彡");

        Scanner scanner = new Scanner(System.in);
        int status = 1;
        while(status == 1){
        System.out.println("\n");
        System.out.println("****************************************");
        System.out.println("*                                      *");
        System.out.println("*          --- Main Menu ---           *");
        System.out.println("*                                      *");
        System.out.println("****************************************");
        System.out.println("\n");
        System.out.println("   Decimal to Binary? ---> Press 1");
        System.out.println("   Binary to Decimal? ---> Press 2");
        System.out.print("\n   Selection: ");
        String mainSelection = scanner.nextLine();
        if(mainSelection.equals("1")) {
            System.out.print("\nWhat would you like to convert to Binary? Enter here ---> ");
            int input = Integer.parseInt(scanner.nextLine());
            decimalToBinary(input);
        } else if (mainSelection.equals("2")){
            System.out.print("\nWhat Binary value would you like to convert? Enter here --->  ");
            String binaryInput = scanner.nextLine();
            binaryToDecimal(binaryInput);
        } else {
            System.out.println("\nDidn't recognize that input! Back to main");
            continue;
        }

        System.out.print("\nWould you like to run another conversion? Y/N   ");
        String anotherRound = scanner.nextLine();
            if(anotherRound.equalsIgnoreCase("Y")){
                continue;
            } else if (anotherRound.equalsIgnoreCase("N")){
                System.out.println("\n----------------- Goodbye! -----------------");
                status++;
            } else {
                System.out.println("\nDidn't recognize that input! Back to main");
                continue;
            }
        }
    }
}
