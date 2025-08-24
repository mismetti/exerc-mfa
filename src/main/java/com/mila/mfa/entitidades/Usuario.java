package com.mila.mfa.entitidades;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @ManyToOne
    private Senha senhaAtual;

    @OneToMany
    private List<DispositivoMFA> dispositivosMFA;

    @Column(name = "ativo")
    private boolean ativo;

    @Column(name = "ultima_tentativa_login")
    private LocalDateTime ultimaTentativaLogin;

    @Column(name = "ultima_data_login")
    private LocalDateTime ultimaDataLogin;

}
