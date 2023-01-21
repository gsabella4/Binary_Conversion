import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class File_IO_DecimalToBinary {
    public static void main(String[] args){

        //input file object
        File binaryInput = new File("binaryInput.txt");

        //for loop printing numbers to the binaryInput.txt file
        try (PrintWriter writerA = new PrintWriter(binaryInput)){
            int n = 1;
            for (int i = 0; i < 256; i++) {
                writerA.println(n);
                n++;
            }
        } catch (FileNotFoundException e){
            System.out.println("Error! File not found");
        }

        //reading binaryInput.txt, logic converts each number to binary, and prints to binaryOutput.txt
        File output = new File("binaryOutput.txt");
        try(Scanner reader = new Scanner(binaryInput);
            PrintWriter writerB = new PrintWriter(output)){
            while(reader.hasNext()){
                int num = Integer.parseInt(reader.nextLine());
                String binaryResult = "";
                int eachInteger = num;
                while (eachInteger > 0){
                    int eachModulus = eachInteger%2;
                    binaryResult = eachModulus + binaryResult;
                    eachInteger /= 2;
                }
                writerB.println(num + " Converted to Binary is: " + binaryResult);
            }
        } catch (FileNotFoundException e){
            System.out.println("Error! File not found");
        }
    }
}
