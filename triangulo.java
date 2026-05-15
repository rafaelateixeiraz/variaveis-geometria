import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x, y;
        System.out.println("Digite o valor da base: ");
        x = ler.nextDouble();
        System.out.println("Digite o altura: ");
        y = ler.nextDouble();
        double area = (x * y)/2;
        System.out.printf("A area do triangulo e: %.2f", area);
                

    }
}