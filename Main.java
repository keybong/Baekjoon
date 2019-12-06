import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);
        
        int poketmonCnt = sc.nextInt();
        int guessNum = sc.nextInt();

        String[] poketmon = new String[poketmonCnt];
        for(int i=0;i<poketmonCnt;i++) {
            poketmon[i] = sc.next();
        }
        
        String[] result = new String[guessNum];
        for(int i=0;i<guessNum;i++) {
            String question = sc.next();
            System.out.printf(question);
            if(question.matches("^[0-9]*$")) result[i] = poketmon[Integer.parseInt(question)];
            else result[i] = String.valueOf(Arrays.binarySearch(poketmon, question));
        }

        for(int i=0;i<guessNum;i++) {
            System.out.println(result[guessNum]);
        }

        sc.close();
        System.exit(0);
    }
}