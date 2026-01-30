package com.example.usuario.web;


import com.example.usuario.dto.request.RequestDto;
import com.example.usuario.dto.response.ResponseServiceDto;
import com.example.usuario.dto.response.ResposeDto;
import com.example.usuario.service.Implementacion;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Servicio Usuario", description = "este servicio es de prueba y te permite crear y consultar un usario de H2")
@RequestMapping(value = "/option")
@CrossOrigin(origins = "${server.config.cors}")
@AllArgsConstructor
public class controller {

    private final Implementacion implementacion;

    @Operation(summary = "crear el usuario en la base de datos h2")
    @PostMapping(value = "/crear", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseServiceDto> crearUsuario( @Valid @RequestBody RequestDto request) {
        return implementacion.crear(request);
    }

    @Operation(summary = "consulta el usuario en la base de datos h2")
    @GetMapping(value = "/consultar", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseServiceDto> consultatUsuario(@Parameter Long id) {
        return implementacion.consultar(id);
    }


}
