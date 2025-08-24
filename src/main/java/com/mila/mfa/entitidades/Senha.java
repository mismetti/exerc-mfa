package com.mila.mfa.entitidades;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "senha")
public class Senha {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Column(name = "indice")
    private Long indice;

    @Column(name = "senha")
    private String senha;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Column(name = "ativa")
    private boolean ativa;

}
