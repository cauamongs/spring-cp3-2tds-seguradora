package br.com.fiap.seguradora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Year;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "TB_VEICULO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_VEICULO_CHASSIS", columnNames = "CHASSIS")
})
public class Veiculo extends Asseguravel {

    @Column(name = "PLACA_VEICULO")
    private String placa;

    @Column(name = "MODELO_VEICULO")
    private String modelo;

    @Column(name = "COR_VEICULO")
    private String cor;

    @Column(name = "MARCA_VEICULO")
    private String marca;

    @Column(name = "CHASSIS")
    private String chassis;

    @Column(name = "DATA_ANO")
    private Year ano;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_VEICULO", nullable = false)
    private TipoSeguro tipo;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "TB_VEICULO_FOTO",
            joinColumns = {
                    @JoinColumn(
                            name = "VEICULO",
                            referencedColumnName = "ID_ASSEGURAVEL",
                            foreignKey = @ForeignKey(
                                    name = "FK_VEICULO_FOTO"
                            )
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "FOTO",
                            referencedColumnName = "ID_FOTO",
                            foreignKey = @ForeignKey(
                                    name = "FK_FOTO_VEICULO"
                            )
                    )
            }
    )
    private Set<Foto> fotos = new LinkedHashSet<>();
}