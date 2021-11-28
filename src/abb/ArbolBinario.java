package abb;

public class ArbolBinario {
    private Nodo raiz;
     public ArbolBinario (){
         raiz = null;
     }
     // metodo arbol esta vacio o no
    public boolean estaVacio(){
         return raiz == null;
    }
    //metodo  recursivo insertar

    public void  insertar(Nodo padre, Nodo hijo , int dato){
        if (hijo == null){//caso base
            Nodo nuevo = new Nodo(null,dato,null);
            if (dato >= padre.getDato()){
            padre.setDerecho(nuevo);}else {padre.setIzquierdo(nuevo);}
        }else
        {//llama recursivo
            if (dato>= padre.getDato()){
                insertar(hijo,hijo.getDerecho(),dato);
            }else{
                insertar(hijo,hijo.getIzquierdo(),dato);
            }
        }

     }
    //metodo auxiliar para insertar un nuevo nodo al abb
    public void insertar(int dato){
         if (estaVacio()){
             Nodo nuevo = new Nodo(null,dato,null);
             raiz=nuevo;
         }else {
            if (dato >= raiz.getDato()){
                insertar(raiz,raiz.getDerecho(),dato);
            }else{
                insertar(raiz,raiz.getIzquierdo(),dato);
            }
         }
    }

    //metodo recursivo para recorrer/mostrar el arbol en inOrden
    private void mostrarInOrden(Nodo nodo){
         if (nodo == null){//caso base

         }else{//llamada recursiva
            mostrarInOrden(nodo.getIzquierdo());
             System.out.print(nodo.getDato()+"  ");
             mostrarInOrden(nodo.getDerecho());

         }
    }
    //metodo auxiliar para recorrer/mostrar el arbol inOrden
    public  void mostrarInOrden(){
         Nodo temporal = raiz;
         mostrarInOrden(raiz);
         System.out.println();
    }
}


