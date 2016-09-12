package bellamy.armard.JavaLabCD10;
import java.util.Scanner;

/**
 * Created by armardbellamy on 9/9/16.
 */
public class Number {

    static Scanner scan = new Scanner(System.in);
    static int userInput = scan.nextInt();
    static int sum = 0;

    static void addUpNumbersInRange(){
        for (int i = 1; i <= userInput; i++) {
            sum += i;
        }
        System.out.println(sum);
    }


    public static void main(String[] args){
        Number num = new Number();
        num.addUpNumbersInRange();
    }
}
