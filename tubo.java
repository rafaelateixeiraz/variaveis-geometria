import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x, y, z;
        System.out.println("Digite a altura do tubo:");
        x = ler.nextDouble();
        System.out.println("Digite o raio do tubo:");
        y = ler.nextDouble();
        double area = (2 * 3.14 * y  * (y + x));
        System.out.printf("A area do tubo e: %.2f\n", area);
                

    }
}