import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        String numero=sc.nextLine();
        sc.close();

        quantN(numero);

    }

    static void quantN(String numero){
        System.out.println("\nQuantidade de dígitos: "+numero.length());
    }
}
