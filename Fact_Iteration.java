
public class Fact_Iteration {
    
    //Function for finding factorial
    public int factorial(int num){
        System.out.println("Factorial of number " +num+ " is :" );
        
        int fact = 1;
        
        for (int i = 1; i <= num ; i++) {
           fact = fact * i;           
        }
        return fact;        
    }    
    //Main method
    public static void main(String[] args) {
        Fact_Iteration obj = new Fact_Iteration();
             
        System.out.println(obj.factorial(5));
    }
}
