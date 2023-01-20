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
        System.out.println("\n" + input + " converted to binary is " + binaryResult);
    }

    public static void main(String[] args) {

        System.out.println("\n\n\t Welecome to the Decimal to Binary Converter!");
        System.out.println("\n\t ...and a ASCII Art Gameboy. Why not?");
        System.out.println("\n_n_________________");
        System.out.println("|_|_______________|_|");
        System.out.println("|  ,-------------.  |");
        System.out.println("| |  .---------.  | |");
        System.out.println("| |  |         |  | |");
        System.out.println("| |  |         |  | |");
        System.out.println("| |  |         |  | |");
        System.out.println("| |  |         |  | |");
        System.out.println("| |  `---------'  | |");
        System.out.println("| `---------------' |");
        System.out.println("|   _ GAME BOY      |");
        System.out.println("| _| |_         ,-. |");
        System.out.println("||_ O _|   ,-. \"._,\"|");
        System.out.println("|  |_|    \"._,\"   A |");
        System.out.println("|    _  _    B      |");
        System.out.println("|   // //           |");
        System.out.println("|  // //    \\\\\\\\\\\\  |");
        System.out.println("|  `  `      \\\\\\\\\\\\ ,");
        System.out.println("|________...______,\"");

        Scanner scanner = new Scanner(System.in);
        int status = 1;
        while(status == 1){
        System.out.print("\nEnter a number to be converted into Binary: ");
        int input = Integer.parseInt(scanner.nextLine());
        decimalToBinary(input);

            System.out.print("\nWould you like to run another conversion? Y/N   ");
        if(scanner.nextLine().equalsIgnoreCase("Y")){
            continue;
        } else {
            System.out.println("\n----------------- Goodbye! -----------------");
            status++;
            }
        }
    }
}
