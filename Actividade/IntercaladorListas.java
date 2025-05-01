public class IntercaladorListas {
    public static void intercalar(Lista lista1, Lista lista2) {
        Lista.Nodo atual1 = lista1.inicio;
        Lista.Nodo atual2 = lista2.inicio;
        Lista.Nodo temp1, temp2;
        
        while (atual1 != null && atual2 != null) {
            temp1 = atual1.proximo;
            temp2 = atual2.proximo;
            
            atual1.proximo = atual2;
            if (temp1 != null) {
                atual2.proximo = temp1;
            }
            
            atual1 = temp1;
            atual2 = temp2;
        }
        
        lista2.inicio = lista1.inicio.proximo;
    }
    
}