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

        //Prompt user for input.
        int i = 0;

        System.out.println("Type \"End\" when done.");

        while (!Dinner.contains("end") && (!Dinner.contains("End"))) {
            if (!Dinner.contains("end") && (!Dinner.contains("End")))
                System.out.println("Please enter dinner option #" + (i + 1));
            String answer = sc.nextLine();
            Dinner.add(answer);
            i++;
        }

        //Remove "End" from the arraylist so it doesn't output with food options.
        Random r = new Random();
        Dinner.remove("end");
        Dinner.remove("End");

        String answer;
        do
        {
            int randomitem = r.nextInt(Dinner.size());
            String randomElement = Dinner.get(randomitem);
            System.out.println("Dinner tonight = " + randomElement);
            System.out.println("Would you like to roll again? y/n");
            answer = sc.next();
        }
        while (answer.equalsIgnoreCase("y"));
    }
}