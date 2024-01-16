import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;

        while (input != 7){
            System.out.println("""
                    Choose one of the options:
                    1 - Positive and Negative number evaluator
                    2 - Number Comparison
                    3 - Area calculator
                    4 - Multiplication table
                    5 - Odd or Even checker
                    6 - Factorial Calculator
                    7 - Exit
                    """);

            input = scan.nextInt();

            switch (input){
                case 1:
                    PosNegEvaluator();
                    break;
                case 2:
                    NumComp();
                    break;
                case 3:
                    AreaCalc();
                    break;
                case 4:
                    MultTable();
                    break;
                case 5:
                    OddEven();
                    break;
                case 6:
                    FacCalc();
                    break;
            }
        }
    }

    public static void PosNegEvaluator(){
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert a number");
        num = scan.nextInt();

        if (num > 0){
            System.out.printf("""
                    It is a positive number
                    """);
        } else{
            System.out.printf("""
                    It is a negative number.
                    """);
        }
    }

    public static void NumComp(){
        Scanner scan = new Scanner(System.in);
        double n1;
        double n2;

        System.out.printf("""
                Insert 2 numbers to be compared:
                """);
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();


        if (n1 == n2){
            System.out.printf("""
                    They are the same number
                    """);
        } else if (n1 > n2) {
            System.out.printf("""
                    %.1f is bigger than %.1f
                    """, n1, n2);
        } else {
            System.out.printf("""
                    %.1f is bigger than %.1f
                    """, n2, n1);
        }
    }

    public static void AreaCalc(){
        Scanner scan = new Scanner(System.in);
        double square;
        double ray;
        double area;
        int choice;

        System.out.printf("""
                Do you want to calculate de area of:
                1 - a Square?
                2 - a Circle?
                """);
        choice = scan.nextInt();

        switch (choice){
            case 1:
                System.out.printf("""
                        Insert the size:
                        """);
                square = scan.nextDouble();
                area = square*square;
                System.out.printf("""
                        The area of the square is: %.2f
                        """, area);

                break;

            case 2:
                System.out.println("""
                        Insert the ray:
                        """);
                ray = scan.nextDouble();
                area = (ray*ray)*3.14;
                System.out.printf("""
                        The area of the circle is: %.2f
                        """, area);
                break;
        }
    }

    public static void MultTable(){
        Scanner scan = new Scanner(System.in);
        double mult;

        System.out.println("Insert the number which you would like to discober the multiplication table from 1 to 10:");
        mult = scan.nextDouble();
        for (int i = 1; i <= 10; i++){
            System.out.printf("""
                               %d x %.1f = %.1f
                               """, i, mult, (i*mult));
        }
    }

    public static void OddEven(){
        Scanner scan = new Scanner(System.in);
        int oddOrEven;

        System.out.println("Insert a number to discover if it is and odd or even:");
        oddOrEven = scan.nextInt();

        if (oddOrEven == 0){
            System.out.println("Not Odd or Even");
        } else if (oddOrEven % 2 == 0){
            System.out.println(("Odd number"));
        } else {
            System.out.println("Even number");
        }
    }

    public static void FacCalc(){
        Scanner scan = new Scanner(System.in);
        double fat;
        double acu = 1;

        System.out.println("Insert the number which you wish to know the factorial: ");
        fat = scan.nextDouble();

        for (int i = 1; i < fat; i++){
            acu += acu*i;
        }

        System.out.printf("The factorial is: %.1f\n", acu);
    }
}