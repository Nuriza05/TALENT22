import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random =new Random();
        ArrayList <Integer> numbers = new ArrayList <> ();
        for (int i = 0; i < 50; i++)
           numbers.add(random.nextInt(1,100));

          oddAndEvenNumbers(numbers);

    }
    public static void oddAndEvenNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        for (Integer number : numbers) {
            if(number%2!=0)
                odds.add(number);
            else
                evens.add(number);
        }
        System.out.println("Odd numbers: "+odds);
        System.out.println("Even numbers: "+evens);

    }

}