/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Cake.Boss;

/**
 *
 * @author milen
 */
public class pedido {
    
    private static int contador = 1;
    
    private int numeroPedido;
    private String nombreCompleto;
    private String cedula;
    private String fechaPedido;
    private String fechaEntrega;
    private String descripcion;
    
    public pedido(String nombreCompleto, String cedula, String fechaPedido,
            String fechaEEntrega, String descripcion){
        this.numeroPedido = contador++;
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
    }
    public int getNueroPedido(){
      return numeroPedido;
    }
    public String getNombreCompleto(){
    return nombreCompleto;
    }
    public String getCedula(){
    return cedula;
    }
    public String getFechaPedido(){
    return fechaPedido;
    }
    public String getFechaEntrega(){
    return fechaEntrega;
    }
    public String getDescripcion(){
    return descripcion;
    }
}
