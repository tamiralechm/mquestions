import java.util.*;
public class PrimeCount{

    public static void main(String[]args){
     Scanner scan=new Scanner(System.in);
    System.out.print("eneter the first number: ");
    int start=scan.nextInt();
    System.out.print("eneter the last number: ");
    int end=scan.nextInt();
    int count=0;
    for (int i=start;i<=end;i++){
        if(isPrime(i)){
            count+=1;
         }
    }
    System.out.println(count); 


     }
   
public static boolean isPrime(int n) {  
    if (n <= 1) {  
        return false;  
    }  
    for (int i = 2; i <= Math.sqrt(n); i++) { 
        //composite numbers 
        if (n % i == 0) {  
            return false;  
        }  
    }  
    return true;  
}
 
}