package newApp;

import java.util.Scanner;

public class Sep03 {

public static void main(String [] args){
    // question number 1

    System.out.println("************");
    System.out.println("*          *");
    System.out.println("*          *");
    System.out.println("*          *");
    System.out.println("*          *");
    System.out.println("*          *");
    System.out.println("*          *");
    System.out.println("*          *");
    System.out.println("************");
    System.out.println();
    System.out.println("     ***   ");
    System.out.println("  *       *");
    System.out.println(" *         * ");
    System.out.println("*           * ");
    System.out.println("*           * ");
    System.out.println("*           *" );
    System.out.println(" *         *"  );
    System.out.println("  *       *"   );
    System.out.println("   *     *");
    System.out.println("     ***");
    System.out.println();
    System.out.println("   *   ");
    System.out.println("  ***  ");
    System.out.println(" ***** ");
    System.out.println("   *   ");
    System.out.println("   *   ");
    System.out.println("   *   ");
    System.out.println("   *   ");
    System.out.println("   *   ");
    System.out.println("   *   ");
    System.out.println();
    System.out.println("       *      ");
    System.out.println("      * *     ");
    System.out.println("    *     *   ");
    System.out.println("  *         * ");
    System.out.println("*             *");
    System.out.println("  *         * ");
    System.out.println("    *     *   ");
    System.out.println("      * *     ");
    System.out.println("       *      ");
    System.out.println();

    // question number 2

    System.out.println("Enter an Integer:");
    int b = 4;
    int c = 3;
    int a = b * c;
    System.out.println(a);
    System.out.println();
    // A program performs a sample payroll calculation

    // question number 3
    System.out.println("Simple Calculator");
    Scanner input = new Scanner(System.in);
    float fNum;
    float sNum;
    float answer;
    float answerSub;
    float answerMult;
    float answerDivide;
    System.out.println("Enter first number: ");
    fNum = input.nextFloat();
    System.out.println("Enter second number: ");
    sNum = input.nextFloat();

    answer = fNum + sNum;
    answerSub = fNum - sNum;
    answerMult = fNum * sNum;
    answerDivide = fNum / sNum;

    System.out.println("Addition operator: " +answer);
    System.out.println("Subtraction operator: " +answerSub);
    System.out.println("Multiplication operator: " +answerMult);
    System.out.println("Division operator: " +answerDivide);


    }
}
