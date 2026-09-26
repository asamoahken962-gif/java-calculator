import java.util.Scanner;

public class MyCalculator {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String repeat = "Y";

        while (repeat.equalsIgnoreCase("Y")) {

            String mode;
            String operator;

            System.out.println("Enter calculator mode: Standard/Scientific?");
            mode = scnr.nextLine();
            System.out.println("You entered: " + mode);

            if (mode.equalsIgnoreCase("Standard")) {

                System.out.println("The calculator will operate in standard mode.");
                System.out.println("Enter '+' for addition, '-' for subtraction, '*' for multiplication, '/' for division");
                operator = scnr.nextLine();

                while (
                    !operator.equals("+") &&
                    !operator.equals("-") &&
                    !operator.equals("*") &&
                    !operator.equals("/")
                ) {
                    System.out.println("Invalid operator");
                    System.out.println("Enter '+' for addition, '-' for subtraction, '*' for multiplication, '/' for division");
                    operator = scnr.nextLine();
                }

                int numCount;
                double num;

                System.out.println("How many numbers do you want to use?");
                numCount = scnr.nextInt();

                double result = 0;

                for (int i = 0; i < numCount; i++) {
                    System.out.println("Enter number:");
                    num = scnr.nextDouble();

                    if (operator.equals("+")) {
                        result = result + num;
                    } else if (operator.equals("-")) {
                        if (i == 0) {
                            result = num;
                        } else {
                            result = result - num;
                        }
                    } else if (operator.equals("*")) {
                        if (i == 0) {
                            result = num;
                        } else {
                            result = result * num;
                        }
                    } else if (operator.equals("/")) {
                        if (i == 0) {
                            result = num;
                        } else {
                            result = result / num;
                        }
                    }
                }

                System.out.println("Result: " + result);
                scnr.nextLine();

            } else if (mode.equalsIgnoreCase("Scientific")) {

                System.out.println("The calculator will operate in Scientific mode.");
                System.out.println("Enter '+' for addition, '-' for subtraction, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
                operator = scnr.nextLine();

                while (
                    !operator.equals("+") &&
                    !operator.equals("-") &&
                    !operator.equals("*") &&
                    !operator.equals("/") &&
                    !operator.equalsIgnoreCase("sin") &&
                    !operator.equalsIgnoreCase("cos") &&
                    !operator.equalsIgnoreCase("tan")
                ) {
                    System.out.println("Invalid operator");
                    System.out.println("Enter '+', '-', '*', '/', 'sin', 'cos', or 'tan':");
                    operator = scnr.nextLine();
                }

                if (
                    operator.equals("+") ||
                    operator.equals("-") ||
                    operator.equals("*") ||
                    operator.equals("/")
                ) {
                    int numCount;
                    double num;
                    double result = 0;

                    System.out.println("How many numbers do you want to use?");
                    numCount = scnr.nextInt();

                    for (int i = 0; i < numCount; i++) {
                        System.out.println("Enter number:");
                        num = scnr.nextDouble();

                        if (operator.equals("+")) {
                            result = result + num;
                        } else if (operator.equals("-")) {
                            if (i == 0) {
                                result = num;
                            } else {
                                result = result - num;
                            }
                        } else if (operator.equals("*")) {
                            if (i == 0) {
                                result = num;
                            } else {
                                result = result * num;
                            }
                        } else if (operator.equals("/")) {
                            if (i == 0) {
                                result = num;
                            } else {
                                result = result / num;
                            }
                        }
                    }

                    System.out.println("Result: " + result);
                    scnr.nextLine();

                } else {
                    double num;
                    double result = 0;

                    System.out.println("Enter a number in radians:");
                    num = scnr.nextDouble();

                    if (operator.equalsIgnoreCase("sin")) {
                        result = Math.sin(num);
                    } else if (operator.equalsIgnoreCase("cos")) {
                        result = Math.cos(num);
                    } else if (operator.equalsIgnoreCase("tan")) {
                        result = Math.tan(num);
                    }

                    System.out.println("Result: " + result);
                    scnr.nextLine();
                }

            } else {
                System.out.println("Invalid calculator mode.");
            }

            System.out.println("Do you want to start over? (Y/N)");
            repeat = scnr.nextLine();
        }

        System.out.println("Goodbye");
        scnr.close();
    }
}
