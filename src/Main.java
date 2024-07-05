public class Main {
    public static void main(String[] args) {
        printHello();
        printNumber(10);

        int result = giveMe10();
        System.out.println(result);

        result = addThese(15,10);
        System.out.println(result);

        double squareResult = square(5.5);
        System.out.println(squareResult);


    }

    //void, parameterless
    public static void printHello(){
        System.out.println("Hello there");
    }

    //void, parameterized
    public static void printNumber(int a){
        System.out.println("The number is " + a);
    }

    //value-returning, parameterless
    public static int giveMe10(){
        return 10;
    }

    //value-returning, parameterized
    public static int addThese(int num1, int num2){
        return num1 + num2;
    }

    public static double square(double num1){
        return num1 * num1;
    }
}