package interfacepractice;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        System.out.println("Enter the operation:");
        char operation = sc.nextLine().charAt(0);
        
        int res = 0;
        switch(operation) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*': 
                res = a * b;
                break;
            case '/': 
                res = b / a;
                break;
            case '%':
                res = a % b;
            default: 
                System.out.println("You putted invalid operator.");
        }
        System.out.println("The result of the operation is "+res);
    }
}
