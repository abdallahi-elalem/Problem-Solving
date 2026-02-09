import java.util.Scanner;

public class PetyaandStrings {
     public static  void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

      
       String value = scanner.nextLine().toLowerCase();
        String value2 = scanner.nextLine().toLowerCase();
        

        for (int i=0;i<value.length();i++){
                char a =value.charAt(i);
                char b=value2.charAt(i);
               

                if (a<b) {
                        System.out.println(-1);
                        return;
                }else if (a>b) {
                        System.out.println(1);
                        return;
                }
                        
        

        }System.out.println(0);
        

   
}
}