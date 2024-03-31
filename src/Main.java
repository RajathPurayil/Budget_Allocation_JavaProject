import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("How much can you Spend");

        Scanner scan = new Scanner(System.in);
        double total= scan.nextDouble();
        double sum=0;
        int i=0;
        ArrayList<Double >proportion = new ArrayList<Double>();

        // prompting user input

        System.out.println("Enter you proportion of various Expenses");

        System.out.println("This system stops if cumulative proportion exceed 100%");

        do {

            System.out.println("Your proportion of expense"+(i+1)+";");

            double value= scan.nextDouble();
            proportion.add(value);
            sum+=proportion.get(i);
            i++;

        } while(sum<=100);
        scan.close();

        if (sum>100){

            double cumulativeSum=0.0;
            for (int j=0;j<proportion.size()-1;j++){

                cumulativeSum+=proportion.get(j);
            }
            proportion.set(proportion.size()-1,100.00-cumulativeSum);
        }
        for (double value:proportion){

            double expense = value*total/100.00;

            System.out.println("You"+value+"% equals $"+expense);
        }
    }
}