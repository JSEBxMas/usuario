package com.example.usuario.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Estructura respuesta de servicio
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonPropertyOrder({
        "status",
        "data"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseServiceDto {


    @JsonProperty("status")
    private Status status;

    @JsonProperty("data")
    private Object datosRespuesta;
}
