public class Lista_SE {
    Nodo inicio;
    // Metodo constructor
    public Lista_SE(){
        this.inicio=null;
    }
    //vacia
    public boolean estaVacia(){
        return inicio==null;
    }
   //tamaño de la lista
    public int tamaño(){
        int contador = 0;
        Nodo aux=inicio;
        while (aux.getSiguiente()!=null){
            contador++;
            aux=aux.getSiguiente();
        }
        if (contador !=0) contador++; {
            return contador;
        }
    }
    //valor del ultimo nodo
    public Object ultimoDato(){
         Nodo aux=inicio;
         while (aux.getSiguiente()!=null){
             aux=aux.getSiguiente();
         }
         return aux.getDato();
    }
}
