package chapter05;

import java.util.Arrays;
import java.util.Random;

public class lotto {

	 public static void main(String[] args) 
    {
        Random random = new Random();
        int[] lotto = new int[6];

        for(int i=0; i<lotto.length;i++) 
        {
            lotto[i] = random.nextInt(45)+1;
            System.out.println(Arrays.toString(lotto));
            for(int j=0;j<i;j++) {
                System.out.println(i+","+j);
                if(lotto[i] == lotto[j]) 
                {
                    System.out.println("값이 같은값이 있습니다. 되돌립니다");
                    i-=1;
                }
            }
        }
        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));
    }


}
