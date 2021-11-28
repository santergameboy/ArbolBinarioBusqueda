import abb.ArbolBinario;

public class Main {
    public static void main(String[] args) {
        ArbolBinario abb=new ArbolBinario();

        //insertar elementos
        abb.insertar(3);
        abb.insertar(2);
        abb.insertar(4);
        abb.insertar(1);
        abb.insertar(3);
        abb.insertar(5);
        abb.insertar(7);
        abb.insertar(6);

        //recorremos/mostramos los elementos del arbol inOrden
        abb.mostrarInOrden();
        //insertar elementos
        abb.insertar(1);
        abb.insertar(11);
        abb.insertar(12);

        abb.mostrarInOrden();

    }
}
