import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        double ladoB, h, areaB, areaL, areaT;
        System.out.print("Digite o lado da base quadrada: ");
        ladoB = ler.nextDouble();
        System.out.print("Digite a altura lateral da piramide: ");
        h = ler.nextDouble();
        areaB = ladoB * ladoB;
        areaL = 2 * ladoB * h;
        areaT = areaB + areaL;
        System.out.println("A area da piramide e: " + areaT);

        ler.close();
    }
}