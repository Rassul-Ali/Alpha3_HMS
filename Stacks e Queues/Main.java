public class Main {
    public static void main(String[] args) {
        /*Pilha stack = new Pilha(5);
        

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());*/

        FilasPropriedade filas = new FilasPropriedade(10);

        filas.insert(80);
        filas.insert(50);
        filas.insert(10);
        filas.insert(350);
        filas.insert(100);

        
        System.out.println(filas.front());
        filas.remove();
        System.out.println(filas.front());
        filas.remove();
        System.out.println(filas.front());
        filas.remove();
        System.out.println(filas.front());
        filas.remove();
        System.out.println(filas.front());

        String info = "Informatica";

        PilhaInversora pilha = new PilhaInversora(info.length());

        for(int i = 0; i< info.length(); i++){
            pilha.push(info.charAt(i));
        }
        System.out.println();
        System.out.print("A String Normal: " + info);
        
        System.out.println();
        System.out.print("A String Invertida: ");
        for(int i = 0; i< info.length(); i++){
            System.out.print(pilha.pop());
        }
        System.out.println();

    }
}
