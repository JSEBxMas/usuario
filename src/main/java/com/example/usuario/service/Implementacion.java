package com.example.usuario.service;

import com.example.usuario.dto.request.RequestDto;
import com.example.usuario.dto.response.ResponseServiceDto;
import com.example.usuario.dto.response.ResposeDto;
import com.example.usuario.persistencia.entidad.UsuarioEntidad;
import com.example.usuario.persistencia.repository.ObjectRepository;
import com.example.usuario.util.RequestResponseUtils;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Log4j2
@AllArgsConstructor
@Service
public class Implementacion {


    private final ObjectRepository objectRepository;
    private final RequestResponseUtils requestResponseUtils;

    public ResponseEntity<ResponseServiceDto> consultar(Long id) {
        ModelMapper mapper = new ModelMapper();
        log.info("Incia el proceso clase:{} metodo:{}", this.getClass().getName(), "consultarUsuario");
        UsuarioEntidad usuarioEntidad = objectRepository.findById(id).orElseThrow(() -> new RuntimeException("datos entocontrados"));
        ResposeDto response = mapper.map(usuarioEntidad, ResposeDto.class);
        log.info("fin del proceso clase:{} metodo:{}", this.getClass().getName(), "consultarUsuario");
        return ResponseEntity.status(HttpStatus.OK).body(requestResponseUtils
                .construirRespuesta(HttpStatus.OK.value(),
                        HttpStatus.OK.getReasonPhrase(),
                        response));
    }


    public ResponseEntity<ResponseServiceDto> crear(RequestDto requestDto) {
        ModelMapper mapper = new ModelMapper();
        log.info("Incia el proceso clase:{} metodo:{}", this.getClass().getName(), "crearUsuario");
        UsuarioEntidad usuarioEntidad = mapper.map(requestDto, UsuarioEntidad.class);
        objectRepository.save(usuarioEntidad);
        log.info("fin del proceso clase:{} metodo:{}", this.getClass().getName(), "crearUsuario");
        return ResponseEntity.status(HttpStatus.CREATED).body(requestResponseUtils
                .construirRespuesta(HttpStatus.CREATED.value(),
                        HttpStatus.CREATED.getReasonPhrase(),
                        requestDto));
    }


}
