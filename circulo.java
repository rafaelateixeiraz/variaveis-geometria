import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double y;
        System.out.println("Digite o raio: ");
        y = ler.nextDouble();
        double area = 3.14 *(y * y);
        System.out.printf("A area do circulo e: %.2f", area);
                

    }
}