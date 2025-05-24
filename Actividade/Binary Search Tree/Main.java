public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(50, 1000);
        tree.insert(25, 10);
        tree.insert(75, 510);
        tree.insert(12, 20);
        tree.insert(37, 520);
        tree.insert(43, 530);
        tree.insert(30, 540);
        tree.insert(120, 550);
        tree.insert(87, 560);
        tree.insert(93, 570);
        tree.insert(97, 590);

        //tree.delete(97);
        //tree.deletePostorder(97);
        tree.find(37).displayNode();
        //tree.maximo().displayNode();
        //tree.traverse(1);
        System.out.println();
    }
}
