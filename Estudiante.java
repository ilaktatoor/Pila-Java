package LinkedList_tutorial;

import java.io.ObjectStreamException;

public class Estudiante {
    //atributos
    private Object id;
    private String nombre;
    private String apellido;
    private String carrera;

    // constructor
    public Estudiante(Object id, String nombre, String apellido, String carrera){
        setId(id);
        setNombre(nombre);
        setApellido(apellido);
        setCarrera(carrera);
    }
    //setters getters

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", carrera='" + carrera + '\'';
    }
}
