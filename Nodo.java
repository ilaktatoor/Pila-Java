package LinkedList_tutorial;

public class Nodo<T> {
    //atrinutos
    private T valor;
    private Nodo<T> siguente;

    //constructor
    public Nodo(T valor, Nodo<T> siguente){
        setValor(valor);
        setSiguente(siguente);
    }

    //getters setters

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo<T> getSiguente() {
        return siguente;
    }

    public void setSiguente(Nodo<T> siguente) {
        this.siguente = siguente;
    }

    @Override
    public String toString() {
        return valor +"\n";
    }
}
