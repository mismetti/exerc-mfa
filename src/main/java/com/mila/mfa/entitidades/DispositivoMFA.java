package com.mila.mfa.entitidades;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "dispositivo_mfa")
public class DispositivoMFA {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "ativo")
    private boolean ativo;

    @Column(name = "data_insercao")
    private LocalDateTime dataInsercao;

    @Column(name = "data_inativacao")
    private LocalDateTime dataInativacao;

}
