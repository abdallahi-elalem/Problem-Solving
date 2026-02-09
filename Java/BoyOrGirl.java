import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {
     public static  void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        String value = scanner.nextLine();
        
    
Set <Character> l = new HashSet<Character>();

for (Character c :value.toCharArray()){
    l.add(c);
}

    

    if(l.size() % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    
    
    }
}
