/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Cake.Boss;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author milen
 */
public class PedidoServicio {
    private static List<pedido> listaPedidos = new ArrayList<>();
    
    public static void agregarPedido(pedido pedido){
    listaPedidos.add(pedido);
    }
    public static List<pedido> obtenerPedidos(){
    return listaPedidos;
    }
}
