package com.proyectofinal.dao;

import com.proyectofinal.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDao 
        extends JpaRepository <Venta, Long>{
    
}
