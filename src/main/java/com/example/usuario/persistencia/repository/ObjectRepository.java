package com.example.usuario.persistencia.repository;

import com.example.usuario.persistencia.entidad.UsuarioEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectRepository extends JpaRepository<UsuarioEntidad,Long> {
}
