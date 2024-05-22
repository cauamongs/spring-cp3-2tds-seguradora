package br.com.fiap.seguradora.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.Name;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TB_ENDERECO")
public class Endereco {

    @Id
    @SequenceGenerator(name = "SQ_ENDERECO",sequenceName = "SQ_ENDERECO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ENDERECO")
    @Column(name = "ID_ENDERECO")
    private Long id;

    @Column(name = "LOGRADOURO_ENDERECO")
    private String logradouro;

    @Column(name = "NUMERO_ENDERECO")
    private String numero;

    @Column(name = "COMPLEMENTO_ENDERECO")
    private String complemento;

    @Column(name = "CEP_ENDERECO")
    private String cep;

}
