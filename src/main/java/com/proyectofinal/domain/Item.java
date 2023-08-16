package com.proyectofinal.domain;

import lombok.Data;

@Data
public class Item extends Producto{
    
    private int cantidad;

    public Item() {
    }
    
    public Item(Producto producto){
        super.setIdProducto(Long.MIN_VALUE);
        super.setCategoria(producto.getCategoria());
        super.setMarca(producto.getMarca());
        super.setModelo(producto.getModelo());
        super.setAño(producto.getAño());
        super.setCombustible(producto.getCombustible());
        super.setTransmision(producto.getTransmision());
        super.setCilindrada(producto.getCilindrada());
        super.setPrecio(producto.getPrecio());
        super.setActivo(producto.isActivo());
        super.setExistencias(producto.getExistencias());
        super.setRutaImagen(producto.getRutaImagen());
        this.cantidad = 0;
        
    }
}
