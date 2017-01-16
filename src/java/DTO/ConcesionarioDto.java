/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Jessica
 */
public class ConcesionarioDto {
    private int nit;
    private String nombre;
    private String telefono;
    private String direccion;

    public ConcesionarioDto(int nit, String nombre, String telefono, String direccion) {
        this.nit = nit;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    

    @Override
    public String toString() {
        return "Concesionario: " + "NIT del concesionario: " + nit + ", Nombre del concesionario: " + nombre + ", Teléfono del concesionario: " + telefono + ", Dirección del concesionario: " + direccion + '}';
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
