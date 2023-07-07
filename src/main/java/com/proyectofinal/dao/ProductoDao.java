package com.proyectofinal.dao;


import com.proyectofinal.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao 
        extends JpaRepository <Producto, Long>{
    
}
