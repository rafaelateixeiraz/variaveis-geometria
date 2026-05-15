import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x, y;
        System.out.println("Digite a altura: ");
        x = ler.nextDouble();
        System.out.println("Digite o comprimento: ");
        y = ler.nextDouble();
        double area = (x * y);
        System.out.printf("A area do retangulo e: %.2f", area);
                

    }
}