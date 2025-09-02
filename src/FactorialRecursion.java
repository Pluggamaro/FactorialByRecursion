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

        System.out.println("****************FACTORIAL RECURSION****************");

        System.out.println(factorial(5));

    }
}