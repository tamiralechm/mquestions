import java.util.Scanner;

public class Madhave {
    public static int isMadhave(int[] n) {
 
        if(n.length==n.length*(n.length+1)/2) {
             for(int index:n) {
                index+=index;
                if(n[0]==n[index+1]+n[index+n.length]) {
                    
                }
                return 1;

              }
        }
        return 0;
         
    }
    public static void main(Scanner sc) {
        //Scanner sc=
        new Scanner(System.in);
        System.out.println("enter size of array");
         int size=sc.nextInt();
         int [] arr=new int[size];
         System.out.println("enter elements of the array");
         for(int i=0;i<size;i++) {
             arr[i]=sc.nextInt();
         }

         isMadhave(arr);
          
     }

}
