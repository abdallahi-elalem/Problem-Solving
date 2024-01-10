import java.util.Scanner;

public class BearBigBrother {
    public static void main(String[] args) {
      
      Scanner scanner =new Scanner(System.in);
      int A=scanner.nextInt();
      int B=0;
     while ( A!=0) {
        int p1=scanner.nextInt();
        int p2=scanner.nextInt();
        int p3=scanner.nextInt();
        if ((p1+p2+p3) >=2){
            B++;
        }
        A--;
      }  
      System.out.println(B); 
    }   
}
