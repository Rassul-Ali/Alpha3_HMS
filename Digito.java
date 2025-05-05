import java.util.Scanner;

public class Digito {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o numero para Mostrar os DIgitos: ");
        System.out.println((int)Math.log10(input.nextInt()) + 1);
    }
}
