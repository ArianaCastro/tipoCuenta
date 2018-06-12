/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipodeCuenta;

/**
 *
 * @author arist
 */
public abstract class tipoCuenta {
    private int id;
    private String nombre;
    private String apellido;
    private int Edad;

    public tipoCuenta() {
    }

    public tipoCuenta(int id) {
        this.id = id;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
    public void Mostrar(){
       
       System.out.println(String.format("Mi nombre es: %s,%s", nombre,apellido));
       System.out.println(String.format("Su edad es: %s", Edad));
   } 
}
