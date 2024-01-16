public class Main {
    public static void main(String[] args) {
        //média
        double n1 = 9.2;
        double n2 = 4.2;
        double media = (n1 + n2) / 2;
        java.lang.String text1 = "A média é: " + media;

        //parse double int
        double num = 9.56;
        int numInt = (int) (num);
        java.lang.String text2 = "A o número em int é " + numInt;

        //goods price
        int qtd = 20;
        double preco = 2.60;
        java.lang.String text3 = "O preço total é: " + (qtd * preco);

        //conversion to R$
        double dolar = 70.0;
        double cota = 4.94;
        java.lang.String text4 = dolar + "$ equivale a " + (dolar * cota) + "R$";

        //discount calculator
        double price = 25.0;
        double discount = 10;
        double realDisc = 1 - (discount/100);
        java.lang.String text5 = "The price with discount is " + (realDisc * price);

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);
        System.out.println(text5);
    }
}