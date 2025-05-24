public class Node{
    int ID;
    double valor;
    Node leftChild;
    Node rightChild;


    public void displayNode(){
        System.out.print("{" + ID + ", " + valor + "}");
    }
}