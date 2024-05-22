package br.com.fiap.seguradora.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public record SeguroRequest(

        @NotNull(message = "Premio é um campo obrigatório")
        @Positive
        Double premio,

        @NotNull(message = "Valor é um campo obrigatório")
        @Positive
        Double valor,

        @PastOrPresent
        LocalDate inicio,

        LocalDate fim,

        @Valid
        AbstractRequest contratante,

        @Valid
        AbstractRequest objeto

) {
}