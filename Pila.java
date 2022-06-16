package LinkedList_tutorial;

public class Pila<T>{
    //atributos
    private Nodo<T> top;
    private int tamanio;

    //constructor
    public Pila(){
        top = null;
        this.tamanio = 0;
    }

    //metodos

    public boolean isEmpty(){   return top==null;   }

    public int size(){  return this.tamanio;    }

    public Nodo<T> getTop() {   return top;    }

    public T top(){
        if (isEmpty()){
            return null;
        }else{
            return top.getValor();
        }
    }

    public void push(T elemento){
        Nodo<T> aux = new Nodo<>(elemento,top);
        top = aux;
        this.tamanio++;
    }
    public T pop(){
        if (isEmpty()){
            return null;
        }else {
            T elemento = top.getValor();// guardar el valor del elemento
            Nodo<T> aux = top.getSiguente(); // creamos nodo auxiliar con el valor del puntero del anteiror top
            top = null; // deslindamos el top
            top = aux;  //asignamos top
            this.tamanio--;
            return elemento;
        }
    }

    public String toString(){
        if (isEmpty()){
            return "la pila esta vacia";
        }else{
            String resultado="";
            Nodo<T> aux = top;
            while (aux!=null){
                resultado += aux.toString();
                aux= aux.getSiguente();
            }
            return resultado;
        }
    }
}
