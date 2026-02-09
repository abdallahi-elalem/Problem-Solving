import java.util.Scanner;

public class Word {
    public static  void main(String[] args) {


        Scanner scanner =new Scanner(System.in);

        String value = scanner.nextLine();
        int num =0;
        int num1 =0;
        for (char c :value.toCharArray()){
            if (Character.isLowerCase(c)) {

                num++;
            }else{
                num1++;
            }
        }
        if (num>=num1) {
            System.out.println(value.toLowerCase());
            
        }else{
            System.out.println(value.toUpperCase());
        }
    
    
    
    
    
    
    
    }
    
}
