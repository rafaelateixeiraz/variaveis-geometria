import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double r;
        System.out.println("Digite o raio da bola:");
        r = ler.nextDouble();
        double area = (4 * 3.14 * (r * r));
        System.out.printf("A area da bola e: %.2f\n", area);
                

    }
}