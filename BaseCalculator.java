import java.util.Scanner;

public class BaseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice1, choice2, op;
        int cBin1, cBin2, cDec1, cDec2, cOct1, cOct2, cHex1, cHex2; 
        String input1, input2;
        int add, sub, mul, div;
        String oBin, oDec, oOct, oHex;
        
        
        System.out.println("Choose what is the number base of the first number");
        System.out.println("1. Binary\n2. Decimal\n3. Octal\n4. Hexadecimal");
        choice1 = input.nextLine();
        
        switch (choice1) {
            case "1": {
                System.out.print("Enter binary number: ");
                input1 = input.nextLine();
                
                cBin1 = Integer.parseInt(input1,2);
                
                
                System.out.println("Choose what is the number base of the second number");
                System.out.println("1. Binary\n2. Decimal\n3. Octal\n4. Hexadecimal");
                choice2 = input.nextLine();
                
                switch(choice2) {
                    case "1": {
                        System.out.print("Enter binary number: ");
                        input2 = input.nextLine();
                        
                        cBin2 = Integer.parseInt(input2,2);
                        
                        System.out.println("Enter what mathematical operation will be used");
                        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
                        op = input.nextLine();
                        
                        switch (op) {
                            case "1": {
                                add = cBin1 + cBin2;
                                
                                oBin = Integer.toBinaryString(add);
                                oDec = Integer.toString(add);
                                oOct = Integer.toOctalString(add);
                                oHex = Integer.toHexString(add);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Sum: " + add);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "2": {
                                sub = cBin1 - cBin2;
                                
                                oBin = Integer.toBinaryString(sub);
                                oDec = Integer.toString(sub);
                                oOct = Integer.toOctalString(sub);
                                oHex = Integer.toHexString(sub);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Difference: " + sub);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "3": {
                                mul = cBin1 * cBin2;
                                
                                oBin = Integer.toBinaryString(mul);
                                oDec = Integer.toString(mul);
                                oOct = Integer.toOctalString(mul);
                                oHex = Integer.toHexString(mul);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Product: " + mul);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "4": {
                                div = cBin1 / cBin2;
                                
                                oBin = Integer.toBinaryString(div);
                                oDec = Integer.toString(div);
                                oOct = Integer.toOctalString(div);
                                oHex = Integer.toHexString(div);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Quotient: " + div);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                        }
                    }
                    case "2": {
                        System.out.print("Enter decimal number: ");
                        input2 = input.nextLine();
                        
                        cDec2 = Integer.parseInt(input2);
                        
                        System.out.println("Enter what mathematical operation will be used");
                        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
                        op = input.nextLine();
                        
                        switch (op) {
                            case "1": {
                                add = cBin1 + cDec2;
                                
                                oBin = Integer.toBinaryString(add);
                                oDec = Integer.toString(add);
                                oOct = Integer.toOctalString(add);
                                oHex = Integer.toHexString(add);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Sum: " + add);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "2": {
                                sub = cBin1 - cDec2;
                                
                                oBin = Integer.toBinaryString(sub);
                                oDec = Integer.toString(sub);
                                oOct = Integer.toOctalString(sub);
                                oHex = Integer.toHexString(sub);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Difference: " + sub);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "3": {
                                mul = cBin1 * cDec2;
                                
                                oBin = Integer.toBinaryString(mul);
                                oDec = Integer.toString(mul);
                                oOct = Integer.toOctalString(mul);
                                oHex = Integer.toHexString(mul);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Product: " + mul);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "4": {
                                div = cBin1 / cDec2;
                                
                                oBin = Integer.toBinaryString(div);
                                oDec = Integer.toString(div);
                                oOct = Integer.toOctalString(div);
                                oHex = Integer.toHexString(div);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Quotient: " + div);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                    }
                }
            }
                    case "3": {
                        System.out.print("Enter octal number: ");
                        input2 = input.nextLine();
                        
                        cOct2 = Integer.parseInt(input2,8);
                        
                        System.out.println("Enter what mathematical operation will be used");
                        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
                        op = input.nextLine();
                        
                        switch (op) {
                            case "1": {
                                add = cBin1 + cOct2;
                                
                                oBin = Integer.toBinaryString(add);
                                oDec = Integer.toString(add);
                                oOct = Integer.toOctalString(add);
                                oHex = Integer.toHexString(add);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Sum: " + add);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "2": {
                                sub = cBin1 - cOct2;
                                
                                oBin = Integer.toBinaryString(sub);
                                oDec = Integer.toString(sub);
                                oOct = Integer.toOctalString(sub);
                                oHex = Integer.toHexString(sub);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Difference: " + sub);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "3": {
                                mul = cBin1 * cOct2;
                                
                                oBin = Integer.toBinaryString(mul);
                                oDec = Integer.toString(mul);
                                oOct = Integer.toOctalString(mul);
                                oHex = Integer.toHexString(mul);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Product: " + mul);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "4": {
                                div = cBin1 / cOct2;
                                
                                oBin = Integer.toBinaryString(div);
                                oDec = Integer.toString(div);
                                oOct = Integer.toOctalString(div);
                                oHex = Integer.toHexString(div);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Quotient: " + div);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                        }
                    }
                    case "4": {
                        System.out.print("Enter hexadecimal number: ");
                        input2 = input.nextLine();
                        
                        cHex2 = Integer.parseInt(input2,16);
                        
                        System.out.println("Enter what mathematical operation will be used");
                        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
                        op = input.nextLine();
                        
                        switch (op) {
                            case "1": {
                                add = cBin1 + cHex2;
                                
                                oBin = Integer.toBinaryString(add);
                                oDec = Integer.toString(add);
                                oOct = Integer.toOctalString(add);
                                oHex = Integer.toHexString(add);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Sum: " + add);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "2": {
                                sub = cBin1 - cHex2;
                                
                                oBin = Integer.toBinaryString(sub);
                                oDec = Integer.toString(sub);
                                oOct = Integer.toOctalString(sub);
                                oHex = Integer.toHexString(sub);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Difference: " + sub);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "3": {
                                mul = cBin1 * cHex2;
                                
                                oBin = Integer.toBinaryString(mul);
                                oDec = Integer.toString(mul);
                                oOct = Integer.toOctalString(mul);
                                oHex = Integer.toHexString(mul);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Product: " + mul);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "4": {
                                div = cBin1 / cHex2;
                                
                                oBin = Integer.toBinaryString(div);
                                oDec = Integer.toString(div);
                                oOct = Integer.toOctalString(div);
                                oHex = Integer.toHexString(div);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Quotient: " + div);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                        }
                    }
                }
            }
            case "2": {
                System.out.print("Enter decimal number: ");
                input1 = input.nextLine();
                
                cDec1 = Integer.parseInt(input1);
                
                System.out.println("Choose what is the number base of the second number");
                System.out.println("1. Binary\n2. Decimal\n3. Octal\n4. Hexadecimal");
                choice2 = input.nextLine();
                
                switch(choice2) {
                    case "1": {
                        System.out.print("Enter binary number: ");
                        input2 = input.nextLine();
                        
                        cBin2 = Integer.parseInt(input2,2);
                        
                        System.out.println("Enter what mathematical operation will be used");
                        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
                        op = input.nextLine();
                        
                        switch (op) {
                            case "1": {
                                add = cDec1 + cBin2;
                                
                                oBin = Integer.toBinaryString(add);
                                oDec = Integer.toString(add);
                                oOct = Integer.toOctalString(add);
                                oHex = Integer.toHexString(add);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Sum: " + add);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "2": {
                                sub = cDec1 - cBin2;
                                
                                oBin = Integer.toBinaryString(sub);
                                oDec = Integer.toString(sub);
                                oOct = Integer.toOctalString(sub);
                                oHex = Integer.toHexString(sub);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Difference: " + sub);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "3": {
                                mul = cDec1 * cBin2;
                                
                                oBin = Integer.toBinaryString(mul);
                                oDec = Integer.toString(mul);
                                oOct = Integer.toOctalString(mul);
                                oHex = Integer.toHexString(mul);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Product: " + mul);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "4": {
                                div = cDec1 / cBin2;
                                
                                oBin = Integer.toBinaryString(div);
                                oDec = Integer.toString(div);
                                oOct = Integer.toOctalString(div);
                                oHex = Integer.toHexString(div);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Quotient: " + div);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                        }
                    }
                }
            }
            break;
            case "3": {
                System.out.print("Enter octal number: ");
                input1 = input.nextLine();
                
                cOct1 = Integer.parseInt(input1,8);
                
                System.out.println("Choose what is the number base of the second number");
                System.out.println("1. Binary\n2. Decimal\n3. Octal\n4. Hexadecimal");
                choice2 = input.nextLine();
                
                switch(choice2) {
                    case "1": {
                        System.out.print("Enter binary number: ");
                        input2 = input.nextLine();
                        
                        cBin2 = Integer.parseInt(input2,2);
                        
                        System.out.println("Enter what mathematical operation will be used");
                        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
                        op = input.nextLine();
                        
                        switch (op) {
                            case "1": {
                                add = cOct1 + cBin2;
                                
                                oBin = Integer.toBinaryString(add);
                                oDec = Integer.toString(add);
                                oOct = Integer.toOctalString(add);
                                oHex = Integer.toHexString(add);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Sum: " + add);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "2": {
                                sub = cOct1 - cBin2;
                                
                                oBin = Integer.toBinaryString(sub);
                                oDec = Integer.toString(sub);
                                oOct = Integer.toOctalString(sub);
                                oHex = Integer.toHexString(sub);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Difference: " + sub);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "3": {
                                mul = cOct1 * cBin2;
                                
                                oBin = Integer.toBinaryString(mul);
                                oDec = Integer.toString(mul);
                                oOct = Integer.toOctalString(mul);
                                oHex = Integer.toHexString(mul);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Product: " + mul);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "4": {
                                div = cOct1 / cBin2;
                                
                                oBin = Integer.toBinaryString(div);
                                oDec = Integer.toString(div);
                                oOct = Integer.toOctalString(div);
                                oHex = Integer.toHexString(div);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Quotient: " + div);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                        }
                    }
                }
            }
            break;
            case "4": {
                System.out.print("Enter hexadecimal number: ");
                input1 = input.nextLine();
                
                cHex1 = Integer.parseInt(input1,16);
                
                System.out.println("Choose what is the number base of the second number");
                System.out.println("1. Binary\n2. Decimal\n3. Octal\n4. Hexadecimal");
                choice2 = input.nextLine();
                
                switch(choice2) {
                    case "1": {
                        System.out.print("Enter binary number: ");
                        input2 = input.nextLine();
                        
                        cBin2 = Integer.parseInt(input2,2);
                        
                        System.out.println("Enter what mathematical operation will be used");
                        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
                        op = input.nextLine();
                        
                        switch (op) {
                            case "1": {
                                add = cHex1 + cBin2;
                                
                                oBin = Integer.toBinaryString(add);
                                oDec = Integer.toString(add);
                                oOct = Integer.toOctalString(add);
                                oHex = Integer.toHexString(add);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Sum: " + add);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "2": {
                                sub = cHex1 - cBin2;
                                
                                oBin = Integer.toBinaryString(sub);
                                oDec = Integer.toString(sub);
                                oOct = Integer.toOctalString(sub);
                                oHex = Integer.toHexString(sub);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Difference: " + sub);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "3": {
                                mul = cHex1 * cBin2;
                                
                                oBin = Integer.toBinaryString(mul);
                                oDec = Integer.toString(mul);
                                oOct = Integer.toOctalString(mul);
                                oHex = Integer.toHexString(mul);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Product: " + mul);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                            case "4": {
                                div = cHex1 / cBin2;
                                
                                oBin = Integer.toBinaryString(div);
                                oDec = Integer.toString(div);
                                oOct = Integer.toOctalString(div);
                                oHex = Integer.toHexString(div);
                                
                                System.out.println("The output of the operation is:");
                                System.out.println("Quotient: " + div);
                                System.out.println("Binary: " + oBin);
                                System.out.println("Decimal: " + oDec);
                                System.out.println("Octal: " + oOct);
                                System.out.println("Hexadecimal: " + oHex.toUpperCase());
                                break;
                            }
                        }
                    }
                }
            }
            break;
        }
    }
}