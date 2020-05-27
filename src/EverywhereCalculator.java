import java.util.Scanner;

public class EverywhereCalculator {
    public static void main(String[] args) {
        System.out.println("\"EverywhereCalculator Started\", input your numbers and operation in next format - | operant1 action operant2, like 2 + 2 |: ");
        float rez = 0;
        boolean done = false;
        int p = 1;

        do {
            Scanner console = new Scanner(System.in);
            String ss = console.nextLine().trim();
            String aMas[] = ss.split("\\s+");
            String[] proba = new String[5];

            for (int i = 0; i < aMas.length; i++) {
                proba[i] = aMas[i];
            }

            String a = proba[0];
            String action = proba[1];
            String b = proba[2];
            String upper = a.toUpperCase();
            //System.out.println(upper);
            //System.out.println("-123".matches("-?\\d+"));

            if ("Q".equals(upper) || "EXIT".equals(upper)) {
                System.out.println("Thank you for using \"EverywhereCalculator\".\n" +
                        "Developed by $developerName.\n" + "Send your suggestions to $GitHubLink.\n");
                break;
            }

            if ((a == null) || (b == null)) {
                System.out.println("Error!!! Input data in next format: operand1 action operand2, like 2 + 2");
                //break;
            } else {


                if (!a.matches("^\\D*$") && !b.matches("^\\D*$")) {
                    if (!a.matches("^\\d*$") || !b.matches("^\\d*$")) {

                        System.out.println("Error!!! Input data in next format: operand1 action operand2, like 2 + 2");

                    } else {
                        //if (a.matches("-?") || b.matches("-?")) {
                        //float operand1 = Integer.parseInt(a.replaceAll("[\\D]", ""));
                        // p = -1;
                        // }
                        float operand1 = Integer.parseInt(a.replaceAll("[\\D]", ""));
                        operand1 = operand1 * p;
                        float operand2 = Integer.parseInt(b.replaceAll("[\\D]", ""));
                        //System.out.println(operand1);
                        //System.out.println(operand2);
                        //System.out.println(action);

                        switch (action) {
                            case "+":
                                rez = operand1 + operand2;
                                System.out.println("RESULT IS: " + rez);
                                System.out.println("\nNext calculation: ");
                                break;
                            case "-":
                                rez = operand1 - operand2;
                                System.out.println("RESULT IS: " + rez);
                                System.out.println("\nNext calculation: ");
                                break;
                            case "*":
                                rez = operand1 * operand2;
                                System.out.println("RESULT IS: " + rez);
                                System.out.println("\nNext calculation: ");
                               break;
                            case "%":
                                rez = operand1 % operand2;
                                System.out.println("RESULT IS: " + rez);
                                System.out.println("\nNext calculation: ");
                                break;
                            case "/":
                                if (operand2 == 0) {
                                    System.out.println("Division by zero is impossible!");
                                    break;
                                }
                                rez = operand1 / operand2;
                                break;
                            default:
                                System.out.println("You entered a character other than the specified (+, -, *, /, %)\n" +
                                        "Error!!! Input data in next format: operand1 action operand2, like 2 + 2");
                                break;

                        }
                        //System.out.println("RESULT IS: " + rez);
                        //System.out.println("\nNext calculation: ");
                    }
                } else {
                    System.out.println("Error!!! Input data in next format: operand1 action operand2, like 2 + 2");
                }

            }


        } while (done == false);

    }
}