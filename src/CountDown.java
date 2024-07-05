public class CountDown {
    public static void main(String[] args) {
       // countDownFrom(10);
        countUpTo(0,10);

    }

    public static void countDownFrom(int num){
        if(num >= 0){
            System.out.println(num);
            countDownFrom(num - 1);
        }

    }

    public static void countUpTo(int num0, int num1){
       if(num0 >= 0 && num0 <= num1){
           System.out.println(num0);
           countUpTo(num0 + 1,num1);
       }
    }
}
