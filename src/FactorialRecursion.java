import java.util.Scanner;

public class FactorialRecursion{

    static int factorial(int num){

        if(num - 1 == 0){
            return 1;
        }else if(num == 0 || num < 0){
            System.out.println("Consider numbers greater than 1!");
            return 0;
        }
        
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        System.out.println("****************FACTORIAL RECURSION****************");

        System.out.print("Enter a number to get it's factorial: ");

        String input = scanner.nextLine();

        int number = Integer.parseInt(input);

        if(number > 0) System.out.printf("The factorial of %d is %d ",number,factorial(number));
        else{
            System.out.println(factorial(number));
        }
    }
}