import L_CDE.L_CDE;

public class Main {
    public static void main(String[] args) {
        L_CDE l_cde=new L_CDE();
        System.out.println(l_cde.estaVacia());
        for(int i=1;i<=5;i++){
            l_cde.insertarFinal(i);
        }
        l_cde.mostrar();
        l_cde.eliminarFinal();
        l_cde.eliminarFinal();
        l_cde.mostrar();
        l_cde.mostrarAdelante(4);
        l_cde.mostrarAdelante(4);
    }
}

