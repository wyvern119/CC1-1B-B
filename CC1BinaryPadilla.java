import java.util.Scanner;

public class CC1BinaryPadilla {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a decimal number (Type STOP to quit the program).");

            String myAnswer = myInput.nextLine();
            if (myAnswer.equals("STOP")) {
                System.out.println("Program Stopped");
                break;
            }
            else {
                int myDecimal = Integer.parseInt(myAnswer);
                String binaryString = Integer.toBinaryString(myDecimal);
                System.out.println("Binary of " + myDecimal + " is: " + binaryString);
                }
            }
        }
    }
