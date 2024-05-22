package br.com.fiap.seguradora.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TYPE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Table(name = "TB_ASSEGURAVEL")
public class Asseguravel {

    @Id
    @SequenceGenerator(name = "SQ_ASSEGURAVEL", sequenceName = "SQ_ASSEGURAVEL", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ASSEGURAVEL")

    @Column(name = "ID_ASSEGURAVEL")
    private Long id;

    @Column(name = "VALOR_ASSEGURAVEL")
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_ASSEGURAVEL")
    private TipoSeguro tipo;
}
