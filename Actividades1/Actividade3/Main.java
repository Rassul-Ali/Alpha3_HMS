
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MatrizSimples m1 = new MatrizSimples(1,3);
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i<1;i++){
            for(int j=0; j<3;j++){
                System.out.print("Insira Os Valores: ");
                m1.set(i, j, input.nextInt());
            }
        }

        m1.print();
        input.close();
    }
}
