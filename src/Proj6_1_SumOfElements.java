import java.util.ArrayList;
import java.util.Scanner;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
       int sum = sumOfElement(myList);
        System.out.println("Sum is :" + sum);
    }

    public static int sumOfElement(ArrayList<Integer> num ){
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        int total = 0;

        System.out.println("Please enter an integer >>");
        number = keyboard.nextInt();
        while(number != -1){
            num.add(number);
            System.out.println("Please enter an integer >>");
            number = keyboard.nextInt();
        }
        for(int i = 0; i < num.size(); i++){
           total = total + num.get(i);
            System.out.print(total + "\t");
        }
        System.out.println(" ");
       // System.out.println(total);
        return total;
    }
}
