import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int number = new Random().nextInt(100);
        int insert;
        Scanner scan = new Scanner(System.in);
        boolean sucesso = false;

        System.out.printf("""
                    In this game you have to try to discover the secret number.
                    The number is contained in the intervail between 1 and 100.
                    You have 5 tries.
                    Good luck!
                    """);

        for (int i = 1; i < 6; i++){
            System.out.printf("Insert the %dº number: ", i);
            insert = scan.nextInt();

            if (insert == number){
                sucesso = true;
                break;
            } else if (insert > number){
                System.out.printf("""
                        The number inserted is bigger than the secret number, try again = )
                        """);
            } else {
                System.out.printf("""
                        The number inserted is smaller than the secret number, try again = ).
                        """);
            }
        }

        if (sucesso){
            System.out.printf("""
                    Horray! You discovered the number!
                    """);
        } else {
            System.out.printf("""
                    Sadly you didn't discover the secret number = (
                    It was %d
                    """, number);
        }
    }
}