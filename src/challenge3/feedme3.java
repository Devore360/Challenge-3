package challenge3;

// Java programs for ArrayList, getting Random Elements, and scanner
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class feedme3 {
    public static void main(String[] args) {
        //Creating ArrayList
        ArrayList<String> Dinner = new ArrayList<String>();

        //Making new Scanner class object, stored in the variable input
        Scanner sc = new Scanner(System.in);

        //Prompt user for input while i is less than 3.
        int i = 0;
        do {
            System.out.println("Please enter dinner option #" + (i + 1));
            String answer = sc.nextLine();
            Dinner.add(answer);
            i++;

            if (Dinner.contains("end")) ;
                break;

            //Randomizing the arraylist to print output
            Random r = new Random();
            {
                int randomitem = r.nextInt(Dinner.size());
                String randomElement = Dinner.get(randomitem);
                System.out.println("Dinner tonight = " + randomElement);
            }
    }
}