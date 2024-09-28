/*
Padilla, Renzo Ymanuel L.
September 10, 2024
CC1 - 1B: Decimal to Binary Calculator
 */

import java.util.Scanner;

public class CC1BinaryPadilla {
    public static void main(String[] args) {

        //Declaration of the scanner
        Scanner myInput = new Scanner(System.in);

        //Added a loop to ask the user for more numbers
        while (true) {
            System.out.println("Enter a decimal number (Type STOP to quit the program).");

            //Stops the program
            String myAnswer = myInput.nextLine();
            if (myAnswer.equals("STOP")) {
                System.out.println("Program Stopped");
                break;
            }
            else {
                try {
                    //this is the method used to convert numbers to binary
                    int myDecimal = Integer.parseInt(myAnswer);
                    String binaryString = Integer.toBinaryString(myDecimal);

                    //program outputs the converted number
                    System.out.println("Binary of " + myDecimal + " is: " + binaryString);

                    //catches wrong inputs to avoid crashing the program
                } catch (NumberFormatException nfe) {
                    System.out.println("Error! Not a decimal number!");
                }
            }
        }
    }
}
