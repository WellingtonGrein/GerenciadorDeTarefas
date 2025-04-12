package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 4)
    @Pattern(regexp = "^[a-z]+$", message = "O nome de usuário deve conter apenas letras minúsculas.")
    @Column(nullable = false, unique = true)
    private String username;


    @NotBlank
    @Size(min = 8)
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "A senha deve conter apenas letras e números.")
    @Column(nullable = false)
    private String pw;

    @NotBlank
    @Email
    @Column(nullable = false, unique = true)
    private String email;

    private String nomeCompleto;

    @OneToMany(mappedBy = "criador", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ListaDeTarefas> listas = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "perfil_id")
    private Perfil perfil;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CompartilhamentoLista> compartilhamentoLista;

}
