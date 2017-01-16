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
public class VehiculoDto {
    private int codigoVehiculo;
    private String marca;
    private String modelo;
    private double precio;
    private int codigoConcesionario;

    public VehiculoDto(int codigoVehiculo, String marca, String modelo, double precio, int codigoConcesionario) {
        this.codigoVehiculo = codigoVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.codigoConcesionario = codigoConcesionario;
    }

    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoConcesionario() {
        return codigoConcesionario;
    }

    public void setCodigoConcesionario(int codigoConcesionario) {
        this.codigoConcesionario = codigoConcesionario;
    }

    @Override
    public String toString() {
        return "Vehiculo: " + "Código del vehículo: " + codigoVehiculo + ", Marca del vehículo: " + marca + ", Modelo del vehículo: " + modelo + ", Precio del vehículo: " + precio + ", Código del concesionario: " + codigoConcesionario + '}';
    }
    
    
}
