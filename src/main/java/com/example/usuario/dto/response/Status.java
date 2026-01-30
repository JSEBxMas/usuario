package com.example.usuario.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
        "statusCode",
        "statusDescription"
})
public class Status {


    @JsonProperty("statusCode")
    private Integer statusCode;
    @JsonProperty("statusDescription")
    private String statusDesc;
}
