/*
Padilla, Renzo Ymanuel L.
September 12, 2024
CC1 - 1B: Radix Converter
 */

import java.util.Scanner;

public class CC1RadixConverterPadilla {
    public static void main(String[] args) {

        //Initialization of the scanner
        Scanner myInput = new Scanner(System.in);
        String outputDec;
        String outputBi;
        String outputOct;
        String outputHex;

        //This is where the user will choose what type of number system they will use to convert their numbers
        System.out.println("Choose a number system to convert. Type STOP to terminate program.");
        System.out.println("1. Binary Number System\n2. Decimal Number System\n3. Octal Number System\n4. Hexadecimal Number System");
        label:

        //Added a loop to let the program ask the user to choose and convert numbers.
        while (true) {
            String myChoice = myInput.nextLine();

            //This is the command to stop the loop and the program itself
            //I used the switch command instead of the "if...else if" to make cleaner as it uses 4 choices.
            switch (myChoice) {
                case "STOP":
                    System.out.println("Program Terminated");
                    break label;

                    //When binary is chosen, the program will ask for any binary number to convert.
                case "1":
                    try {
                        System.out.println("You have chosen Binary Number System");
                        System.out.println("Enter a binary number to convert");

                        String myNumber = myInput.nextLine();

                        /*This is how the binary number is decoded into the other 3 number bases
                        I have added additional commands so that it would not convert the number given literally.
                         */
                        outputDec = Integer.toString(Integer.parseInt(myNumber, 2));

                        int oNum = Integer.parseInt(myNumber, 2);
                        outputOct = Integer.toOctalString(oNum);

                        int hNum = Integer.parseInt(myNumber, 2);
                        outputHex = Integer.toHexString(hNum);

                        //This is the output of the converted numbers. The user will be asked to choose another number system to convert to.
                        System.out.println("Your binary number " + myNumber + ", is converted to:");
                        System.out.println("Decimal: " + outputDec + "\nOctal: " + outputOct + "\nHexadecimal: " + outputHex.toUpperCase());
                        System.out.println("\nChoose a number system to start converting again. \nType STOP to terminate the process.");
                        //Added a catch command to prevent the program from crashing should it accept an inconvertible number
                    } catch (NumberFormatException nfe) {
                        System.out.println("Error! Not a convertible value! \nChoose another number system to start converting again, or \ntype STOP to terminate the program");
                    }

                    break;
                //When decimal is chosen, the program will ask for any decimal number to convert.
                case "2":
                    try {

                        System.out.println("You have chosen Decimal Number System");
                        System.out.println("Enter a decimal number to convert");

                        String myNumber = myInput.nextLine();

                         /*This is how the decimal number is decoded into the other 3 number bases
                        Since this is a decimal converter, it doesn't need the other extra commands to prevent it from converting the numbers given literally
                         */
                        outputBi = Integer.toBinaryString(Integer.parseInt(myNumber));
                        outputOct = Integer.toOctalString(Integer.parseInt(myNumber));
                        outputHex = Integer.toHexString(Integer.parseInt(myNumber));

                        //This is the output of the converted numbers. The user will be asked to choose another number system to convert to.
                        System.out.println("Your decimal number " + myNumber + ", is converted to:");
                        System.out.println("Binary: " + outputBi + "\nOctal: " + outputOct + "\nHexadecimal: " + outputHex.toUpperCase());
                        System.out.println("\nChoose a number system to start converting again. \nType STOP to terminate the program.");
                        //Added a catch command to prevent the program from crashing should it accept an inconvertible number
                    } catch (NumberFormatException nfe) {
                        System.out.println("Error! Not a convertible value! \nChoose another number system to start converting again, or \ntype STOP to terminate the program");
                    }

                    break;
                //When octal is chosen, the program will ask for any octal number to convert.
                case "3":
                    try {
                        System.out.println("You have chosen Octal Number System");
                        System.out.println("Enter a octal number to convert");

                        String myNumber = myInput.nextLine();

                        /*This is how the octal number is decoded into the other 3 number bases
                        I have added additional commands so that it would not convert the number given literally.
                         */
                        outputDec = Integer.toString(Integer.parseInt(myNumber, 8));

                        int bNum = Integer.parseInt(myNumber, 8);
                        outputBi = Integer.toBinaryString(bNum);

                        int hNum = Integer.parseInt(myNumber, 8);
                        outputHex = Integer.toHexString(hNum);

                        //This is the output of the converted numbers. The user will be asked to choose another number system to convert to.
                        System.out.println("Your octal number " + myNumber + ", is converted to:");
                        System.out.println("Decimal: " + outputDec + "\nBinary: " + outputBi + "\nHexadecimal: " + outputHex.toUpperCase());
                        System.out.println("\nChoose a number system to start converting again. \nType STOP to terminate the program.");
                        //Added a catch command to prevent the program from crashing should it accept an inconvertible number
                    } catch (NumberFormatException nfe) {
                        System.out.println("Error! Not a convertible value! \nChoose another number system to start converting again, or \ntype STOP to terminate the program");
                    }

                    break;
                //When hexadecimal is chosen, the program will ask for any hexadecimal number to convert.
                case "4":
                    try {
                        System.out.println("You have chosen Hexadecimal Number System");
                        System.out.println("Enter a hexadecimal number to convert");

                        String myNumber = myInput.nextLine();

                        /*This is how the hexadecimal number is decoded into the other 3 number bases
                        I have added additional commands so that it would not convert the number given literally.
                         */
                        outputDec = Integer.toString(Integer.parseInt(myNumber, 16));

                        int bNum = Integer.parseInt(myNumber, 16);
                        outputBi = Integer.toBinaryString(bNum);

                        int oNum = Integer.parseInt(myNumber, 16);
                        outputOct = Integer.toOctalString(oNum);

                        //This is the output of the converted numbers. The user will be asked to choose another number system to convert to.
                        System.out.println("Your hexadecimal number " + myNumber + ", is converted to:");
                        System.out.println("Decimal: " + outputDec + "\nBinary: " + outputBi + "\nOctal: " + outputOct);
                        System.out.println("\nChoose a number system to start converting again. \nType STOP to terminate the program.");
                        //Added a catch command to prevent the program from crashing should it accept an inconvertible number
                    } catch (NumberFormatException nfe) {
                        System.out.println("Error! Not a convertible value! \nChoose another number system to start converting again, or \ntype STOP to terminate the program");
                    }

                    break;
                    //If an answer is given that is not in the choices, an error would occur before reminding the user to choose an existing choice.
                default:
                    System.out.println("Error! Choice is not in the list! \n Choose an existing choice to proceed!");
                    break;
            }
        }
    }
}
