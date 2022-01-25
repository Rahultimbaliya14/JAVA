import java.util.*;

public class Frequency {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      int i,reminder;
      int arr[]=new int[10];
      for(i=0;i<10;i++){
          arr[i]=0;
      }

      while(number>0){
          reminder=number%10;
          number=number/10;
          arr[reminder]++;
      }
      for(i=0;i<10;i++){
          if(arr[i] != 0){
              System.out.println(i + " --> " + arr[i]);
          }
      }        
   }
}