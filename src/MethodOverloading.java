public class MethodOverloading {
    public static void main(String[] args) {
        double result = getResult(5);
        System.out.println(result);

        result = getResult(5,4);
        System.out.println(result);

        result = getResult(5,"12");
        System.out.println(result);

        String result2 = getResult("Hello","Kgwale");
        System.out.println(result2);

    }
    public static double getResult(int num){
        return  num * 2;
    }

    public static int getResult(int num1, int num2){
        return  num1 * num2;
    }

   public static int getResult(int num1, String value){
        return num1 * Integer.parseInt(value);
   }

   public static String getResult(String text1, String text2){
        return text1 + " " + text2;
   }

}
