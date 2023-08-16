package com.proyectofinal.dao;

import com.proyectofinal.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDao 
        extends JpaRepository <Factura, Long>{
    
}
