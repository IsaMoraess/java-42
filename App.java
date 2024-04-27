import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //Peça ao usuário uma base e um expoente, e calcule a potência
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor da base: ");
    Double base = sc.nextDouble();

    System.out.println("Digita o valor do expoente: ");
    Double exponte = sc.nextDouble();

    double potencia = Math.pow(base, exponte);
    System.out.println("O valor da potencia é: " + potencia);
    }
}
