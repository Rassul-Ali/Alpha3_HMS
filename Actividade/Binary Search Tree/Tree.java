
public class Tree {

    private Node root;

    public Tree() {
        root = null;
    }

    public Node find(int ID) {
        Node atual = root;
        while (atual.ID != ID) {
            if (ID < atual.ID) {
                atual = atual.leftChild;
            } else {
                atual = atual.rightChild;
            }
            if (atual == null) {
                return null;
            }
        }
        return atual;
    }

    public void insert(int ID, double valor) {
        Node novo = new Node();
        novo.ID = ID;
        novo.valor = valor;
        if (root == null) {
            root = novo;
        } else {
            Node atual = root;
            Node pai;
            while (true) {
                pai = atual;
                if (ID < atual.ID) {
                    atual = atual.leftChild;
                    if (atual == null) {
                        pai.leftChild = novo;
                        return;
                    }
                } else if (ID > atual.ID) {
                    atual = atual.rightChild;
                    if (atual == null) {
                        pai.rightChild = novo;
                        return;
                    }
                } else {

                    return;
                }
            }
        }
    }

    public boolean delete(int ID) {
        Node atual = root;
        Node pai = root;
        boolean isLeftChild = true;

        // Procurando o nó a ser deletado
        while (atual != null && atual.ID != ID) {
            pai = atual;
            if (ID < atual.ID) {
                isLeftChild = true;
                atual = atual.leftChild;
            } else {
                isLeftChild = false;
                atual = atual.rightChild;
            }
        }

        // Nó não encontrado
        if (atual == null) {
            return false;
        }

        // Caso 1: Nó é folha (sem filhos)
        if (atual.leftChild == null && atual.rightChild == null) {
            if (atual == root) {
                root = null;
            } else if (isLeftChild) {
                pai.leftChild = null;
            } else {
                pai.rightChild = null;
            }
        } // Caso 2: Nó tem apenas um filho (esquerdo)
        else if (atual.rightChild == null) {
            if (atual == root) {
                root = atual.leftChild;
            } else if (isLeftChild) {
                pai.leftChild = atual.leftChild;
            } else {
                pai.rightChild = atual.leftChild;
            }
        } // Caso 2: Nó tem apenas um filho (direito)
        else if (atual.leftChild == null) {
            if (atual == root) {
                root = atual.rightChild;
            } else if (isLeftChild) {
                pai.leftChild = atual.rightChild;
            } else {
                pai.rightChild = atual.rightChild;
            }
        } // Caso 3: Nó tem dois filhos
        else {
            Node successor = getSuccessor(atual);

            // Conectando o sucessor ao pai do nó atual
            if (atual == root) {
                root = successor;
            } else if (isLeftChild) {
                pai.leftChild = successor;
            } else {
                pai.rightChild = successor;
            }

            // Conectando a subárvore esquerda do nó atual ao sucessor
            successor.leftChild = atual.leftChild;
        }

        return true;
    }

    private Node getSuccessor(Node nodeToDelete) {
        Node successorParent = nodeToDelete;
        Node successor = nodeToDelete;
        Node current = nodeToDelete.rightChild;

        // Encontrando o menor nó na subárvore direita (sucessor)
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }

        // Se o sucessor não for o filho direito do nó a ser deletado,
        // precisamos ajustar as conexões
        if (successor != nodeToDelete.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = nodeToDelete.rightChild;
        }

        return successor;
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.leftChild);
            System.out.println("O valor e: " + root.valor);
            inOrder(root.rightChild);
        }
    }

    private void preOrder(Node root) {
        if (root != null) {
            System.out.println("O valor e: " + root.valor);
            inOrder(root.leftChild);
            inOrder(root.rightChild);
        }
    }

    private void postOrder(Node root) {
        if (root != null) {
            inOrder(root.leftChild);
            inOrder(root.rightChild);
            System.out.println("O valor e: " + root.valor);
        }
    }

    public boolean search(int ID) {
        return search(root, ID);
    }

    private boolean search(Node node, int ID) {
        if (node == null) {
            return false;
        }

        if (ID == node.ID) {
            return true;
        }

        return ID < node.ID ? search(node.leftChild, ID) : search(node.rightChild, ID);
    }

    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1 -> {
                System.out.print("\nPreorder traversal: \n");
                preOrder(root);
            }
            case 2 -> {
                System.out.print("\nInorder traversal: ");
                inOrder(root);
            }
            case 3 -> {
                System.out.print("\nPostorder traversal: ");
                postOrder(root);
            }
        }
        System.out.println();
    }

    public Node minimo() {
        Node minimo = root;
        Node atual = root;
        while (atual != null) {
            minimo = atual;
            atual = atual.leftChild;
        }
        return minimo;
    }

    public Node maximo() {
        Node maximo = root;
        Node atual = root;
        while (atual != null) {
            maximo = atual;
            atual = atual.rightChild;
        }
        return maximo;
    }
}
