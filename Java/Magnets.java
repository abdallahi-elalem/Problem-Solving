import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
       int pt=size;
       int counter=1;
       String temp=null;

        while (size !=0) {
            
            String value =s.next();

            if(pt==size){
                temp=value;
                size--;
                continue;
            }
            if (temp.charAt(1)==value.charAt(0)) {
               
                counter++;    
            }

            temp=value;
            size--;
            
        }
        System.out.println(counter);
    }
}
 