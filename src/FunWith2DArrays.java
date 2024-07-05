import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
        int[][] my2DArray = new int[2][3];
        fill2DArray(my2DArray);
        print2DArray(my2DArray);
        twice2DArray(my2DArray);
        print2DArray(my2DArray);

    }

    public static void fill2DArray(int[][] twoDArray){
        Random random = new Random();

        for(int i = 0; i < twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
             //randamize 0 through 99(inclusive)
              twoDArray[i][j] = random.nextInt(100 );
            }
        }


    }

    public static void twice2DArray(int[][] two2DArr){
        for(int i = 0; i < two2DArr.length; i++){
            for(int j = 0; j < two2DArr[i].length; j++ ){
               two2DArr[i][j] *= 2;
            }
        }
    }

    public static void print2DArray(int[][] twoDArray){
        for(int[] arr : twoDArray){
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


}
