public class InertialArray{

public static int isInertial(int[ ] a){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of array");
     int size=sc.nextInt();
     int [] arr=new int[size];
     System.out.println("enter elements of the array");
     for(int i=0;i<size;i++) {
         arr[i]=sc.nextInt();
      }
     // check if it contains at least one odd value
     int index=0;
     for(int x:arr){
         if(x%2==0){
             return false;
             x+=1;
             // check if the maximum value in the array is even
            if(Math.max(x,x+1)%2!=0){
                return false;
                x+=1;
            }

              }
             int swap=max;
         }
     }

}

    public static vois main(String[] args){

    }
}