package LinkedList_tutorial;

public class mainClass {
    public static void main(String[] args) {
        Pila<Estudiante> pilaEstu = new Pila<>();
        Estudiante estudiante = new Estudiante(0001,"emmanuel","Arias","sistemas");


        pilaEstu.push(estudiante);
        estudiante = new Estudiante(0002,"Ximena","Rosales","Sistemas");
        pilaEstu.push(estudiante);

        System.out.println(pilaEstu.size());
        System.out.println(pilaEstu.toString());
    }
}
