package com.example.usuario.persistencia.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class UsuarioEntidad {

    private String nombre;
    @Id
    private Long identificacion;
    private Integer edad;

}
