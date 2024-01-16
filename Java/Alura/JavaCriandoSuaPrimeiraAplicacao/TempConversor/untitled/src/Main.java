import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float temp;
        int input = 0;

        while (input != 3){
            System.out.println("""
                    This is a Temperature conversor.
                    Chose which conversion you wish to do:
                    1 - Celsius to Fahrenheit
                    2 - Fahrenheit to Celsius
                    3 - Quit
                    """);

            input = scan.nextInt();

            switch (input){
                case 1:
                    System.out.println("Insert the Celsius temperature: ");
                    temp = scan.nextFloat();
                    System.out.printf("%.2fºC is equal to %.2fºF\n",temp, ((temp*1.8)+32));
                    break;

                case 2:
                    System.out.println("Insert the Fahrenheit temperature: ");
                    temp = scan.nextFloat();
                    System.out.printf("%.2fºF is equal to %.2fºC\n", temp, ((temp - 32)/1.8));
                    break;
            }
        }
    }
}