package com.proyectofinal.dao;


import com.proyectofinal.Controller.CategoriaController;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao 
        extends JpaRepository <CategoriaController, Long>{
    
}
