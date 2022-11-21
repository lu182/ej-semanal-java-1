package tarea1;

import java.util.Arrays;

public class Alumno {
    
    private int id;
    private long dni;
    private String nombre, apellido;    
    private boolean casado;
    private char comision;
    private String[] materias = {"Programación I","Programación II","Base de datos","Inglés"};;
    private double costoCurso;
    private static int count = 0; 
    
    
    private static int createId(){
        return ++count;
    }
    
    public String casadoToString(){
        if(casado == true){
            return "Si";
        }else{
            return "No";
        }
    }

    public Alumno(long dni, String nombre, String apellido, boolean casado, char comision, double costoCurso) {
        this.id = createId();
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.casado = casado;
        this.comision = comision;
        //this.materias = materias;
        this.costoCurso = costoCurso;
    }

    public Alumno() {
    }    
    
    //GETTERS & SETTERS:
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
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

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public char getComision() {
        return comision;
    }

    public void setComision(char comision) {
        this.comision = comision;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public double getCostoCurso() {
        return costoCurso;
    }

    public void setCostoCurso(double costoCurso) {
        this.costoCurso = costoCurso;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Alumno.count = count;
    }

    @Override
    public String toString() {
        return "Alumno/a{" + "\n id = " + id + ",\n dni = " + dni + ",\n nombre = " + nombre + ",\n apellido = " + apellido 
                + ",\n casado/a = " + casadoToString() + ",\n comision = " + comision 
                + ",\n materias = " + Arrays.toString(materias) + ",\n costoCurso = " + costoCurso + "\n" + '}';
    }
    
    
    
    
    
}