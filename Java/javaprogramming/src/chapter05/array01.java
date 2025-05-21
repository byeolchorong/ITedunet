package chapter05;

public class array01 {

	public static void main(String[] args) 
    {
        int[][] test = new int[3][4];

        for(int i=0; i< test.length; i++) {
            for(int j=0; j < test[i].length; j++ ) {
                test[i][j] = i+j;
                System.out.println("test["+i+"]["+j+"]의 값은 : "+test[i][j]);
            }


            System.out.println(i);
        }
    }
}
