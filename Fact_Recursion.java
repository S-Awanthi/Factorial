
public class Fact_Recursion {
    
    int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return(num*factorial(num-1));        
        }
    }
    
    public static void main(String[] args) {
        Fact_Recursion obj = new Fact_Recursion();
        
        System.out.println(obj.factorial(5));
    }
}
