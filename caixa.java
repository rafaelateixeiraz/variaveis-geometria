import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x, y, z;
        System.out.println("Digite o comprimento:");
        x = ler.nextDouble();
        System.out.println("Digite a largura:");
        y = ler.nextDouble();
        System.out.println("Digite a altura:");
        z = ler.nextDouble();
        double area = (2 * ((x * y) + (x * z ) + (y * z)));
        System.out.printf("A area da caixa o e: %.2f", area);
                

    }
}