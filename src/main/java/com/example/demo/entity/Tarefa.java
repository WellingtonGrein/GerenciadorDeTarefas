package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;

    public enum Prioridade{
        BAIXA, MEDIA, ALTA;
    }

    public enum Status {
        PENDENTE, EM_PROGRESSO, CONCLUIDO, CANCELADO
    }

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "lista_id", nullable = false)
    private ListaDeTarefas lista;



}
