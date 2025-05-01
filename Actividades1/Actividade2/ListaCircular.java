import java.util.Scanner;


public class ListaCircular {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Problema de Josefo\n");

        System.out.print("Insira o Numero de Pessoas: ");
        int numeroPessoas = input.nextInt();

        System.out.println();

        System.out.print("Insira o Passo de Contagem: ");
        int passoContagem = input.nextInt();

        System.out.println();

        System.out.print("Insira a Posicao inicial: ");
        int inicio = input.nextInt();

        System.out.println();

        if(inicio < 1 || inicio > numeroPessoas){
            System.out.println("Pisicao inicial Invalida");
            return;
        }

        Pessoa primPessoa = new Pessoa(1);
        Pessoa actual = primPessoa;

        for(int i = 2; i <= numeroPessoas; i++){
            actual.Proximo = new Pessoa(i);
            actual = actual.Proximo;
        }
        actual.Proximo = primPessoa;
        
        Pessoa current = primPessoa;
        for(int i=1; i<inicio; i++){
            current = current.Proximo;
        }

        System.out.println("Eliminacao\n");
        while(current.Proximo != current){
            for(int i =1; i< passoContagem - 1; i++){
                current = current.Proximo;
            }

            Pessoa elimPessoa = current.Proximo;
            System.out.println("Eliminada: ID = " + elimPessoa.ID + " Valor = " + elimPessoa.valor);
            Thread.sleep(1000);
            current.Proximo = elimPessoa.Proximo;
            current = current.Proximo;
        }
        System.out.println();
        System.out.println("Sobrevivente: ID = " + current.ID + " Valor = " + current.valor);

        input.close();
    }

    public void timer(){

    }
}
