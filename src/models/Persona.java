package models;

public class Persona implements Comparable<Persona>{

    private String nombre;
    private int edad;
    private int cedula;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, int cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

        @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }

    @Override
    public int compareTo(Persona o) {
        int com = o.getNombre().compareToIgnoreCase(this.getNombre());
        if (com == 0) {
            return Integer.compare(o.getEdad(), this.getEdad());
        }                
        return com;
    }
}