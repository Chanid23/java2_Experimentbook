
import java.util.Vector;
import java.util.Random;
public class GetRandomNumber {
    public static int [] getRandomNumber(int max,int amount){
        Vector<Integer> vector = new Vector<Integer>();
        for(int i=1;i<=max;i++){
            vector.add(i);
        }
        int result[] = new int[amount];
        while(amount>0){
           int index = new Random().nextInt(vector.size());
           int m= vector.elementAt(index);
           vector.removeElementAt(index);
           result[amount-1] = m;
           amount--;
        }
        return result;
    }
}

