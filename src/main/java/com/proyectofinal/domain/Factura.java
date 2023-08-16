package com.proyectofinal.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
@Entity
@Table(name="factura")
public class Factura implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private long idFactura;
    private long idUsuario;
    private Date fecha;
    private double total;
    private int estado;
    
    public Factura(){
        
    }

    public Factura(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Factura(long idUsuario, Date fecha, double total, int estado) {
        this.idUsuario = idUsuario;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }
        
}
