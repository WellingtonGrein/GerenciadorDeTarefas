package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Perfil implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;
    private String foto;

    @Enumerated(EnumType.STRING)
    private Idioma idioma;

    @Enumerated(EnumType.STRING)
    private Tema tema;

    @OneToOne(mappedBy = "perfil")
    private Usuario usuario;

    public enum Idioma{
        PORTUGUES, INGLES, ESPANHOL
    }

    public enum Tema{
       AUTOMATICO, CLARO, ESCURO
    }
}
