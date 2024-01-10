import java.util.Scanner;

public class java {
    /**
     * @param args
     */
    public static void main(String[] args) {
      
      Scanner scanner =new Scanner(System.in);
      int persons=scanner.nextInt();
      int wall= scanner.nextInt();
      int result=0;


      while (persons !=0) {
        int sum =scanner.nextInt();
        result++;

        if(sum>wall){
          result++;

        }
        persons--;
        
        
       
      }  
      System.out.println(result);
    }
  }