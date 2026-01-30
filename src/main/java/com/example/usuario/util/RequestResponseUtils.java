package com.example.usuario.util;

import com.example.usuario.dto.response.ResponseServiceDto;
import com.example.usuario.dto.response.Status;
import org.springframework.stereotype.Component;

@Component
public class RequestResponseUtils {


    public ResponseServiceDto construirRespuesta(Integer codigoRespuesta, String descripcionRespuesta,
                                                 Object datosRespuesta) {

        return ResponseServiceDto.builder()
                .status(Status.builder()
                        .statusCode(codigoRespuesta)
                        .statusDesc(descripcionRespuesta)
                        .build())
                .datosRespuesta(datosRespuesta)
                .build();

    }
}