import java.util.Scanner;

public class StonesontheTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String value =s.next();
        int sum=0;

        char [] values=value.toCharArray();

        for (int i=0 ;i<num;i++){
            
                
            
            if(i!=num-1 && values[i]==values[i+1]){
                sum++;
            }
            

            
        
        }
        System.out.println(sum);
    }
    
}
