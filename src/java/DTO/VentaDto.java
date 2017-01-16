/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Jessica
 */
public class VentaDto {
    private int idVenta;
    private int idCliente;
    private int idVehiculo;
    private Date fecha;

    public VentaDto(int idVenta, int idCliente, int idVehiculo, Date fecha) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.idVehiculo = idVehiculo;
        this.fecha = fecha;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Ventas del Concesionario: " + "Código de la venta: " + idVenta + ", Código del cliente: " + idCliente + ", Código del vehículo: " + idVehiculo + ", Fecha de la venta: " + fecha + '}';
    }
    
}
