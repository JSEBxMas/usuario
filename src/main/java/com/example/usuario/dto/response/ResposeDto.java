package com.example.usuario.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResposeDto {
    private String nombre;
    private Long identificacion;
    private Integer edad;
}
