package com.proyectofinal.dao;


import com.proyectofinal.Controller.ProductoController;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao 
        extends JpaRepository <ProductoController, Long>{
    
}
