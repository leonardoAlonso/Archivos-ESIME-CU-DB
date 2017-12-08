/* int id;
    String nombre;
    String formato;
    double costo;
    double calificacion;
    int num_Descargas;
    int puntos;
    int alumno_id;
    int clase_id;
    String ruta;
    String descripcion;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.db.model;

/**
 *
 * @author Leonardo
 */
public class Archivo {
    int id;
    String nombre;
    String formato;
    double costo;
    double calificacion;
    int num_Descargas;
    int puntos;
    int alumno_id;
    int clase_id;
    String ruta;
    String descripcion;

    public Archivo(int id, String nombre, String formato, double costo, double calificacion, int num_Descargas, int puntos, int alumno_id, int clase_id, String ruta, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.formato = formato;
        this.costo = costo;
        this.calificacion = calificacion;
        this.num_Descargas = num_Descargas;
        this.puntos = puntos;
        this.alumno_id = alumno_id;
        this.clase_id = clase_id;
        this.ruta = ruta;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFormato() {
        return formato;
    }

    public double getCosto() {
        return costo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public int getNum_Descargas() {
        return num_Descargas;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getAlumno_id() {
        return alumno_id;
    }

    public int getClase_id() {
        return clase_id;
    }

    public String getRuta() {
        return ruta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void setNum_Descargas(int num_Descargas) {
        this.num_Descargas = num_Descargas;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setAlumno_id(int alumno_id) {
        this.alumno_id = alumno_id;
    }

    public void setClase_id(int clase_id) {
        this.clase_id = clase_id;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
