package by.it.a_khmelev.calc_v4_with_multioperation_and_tests;

import java.util.Scanner;

public class ConsoleRunner {

    public static void main(String[] args) {
        String expression;
        Scanner scanner = new Scanner(System.in);
        Parcer parcer = new Parcer();
        Printer printer = new Printer();

        Var.loadVarFromFile();
        while (!(expression = scanner.nextLine()).equalsIgnoreCase("END")) {
            String result;
            try {
                result = parcer.calc(expression);
                printer.print(result);
            } catch (CalcException e) {
                printer.showError(e);
            }
        }
        Var.saveVarToFile();
    }
}