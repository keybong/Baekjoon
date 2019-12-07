import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);
        
        int poketmonCnt = sc.nextInt();
        int guessNum = sc.nextInt();

        HashMap<String,String> poketmonGroup1 = new HashMap<>();
        HashMap<String,String> poketmonGroup2 = new HashMap<>();
        for(int i=0;i<poketmonCnt;i++) {
            String poketmonName = sc.next();
            poketmonGroup1.put(String.valueOf(i+1), poketmonName);
            poketmonGroup2.put(poketmonName,String.valueOf(i+1));
        }
        
        String[] result = new String[guessNum];
        for(int i=0;i<guessNum;i++) {
            String questionStr = sc.next();
            String ans = poketmonGroup1.get(questionStr);
            if(ans!=null) {
                result[i]=ans;
                continue;
            }
            else ans = poketmonGroup2.get(questionStr);

            if(ans!=null) result[i]=ans;
        }

        for(int i=0;i<guessNum;i++){
            System.out.println(result[i]);
        }
    
        sc.close();
        System.exit(0);
    }
}