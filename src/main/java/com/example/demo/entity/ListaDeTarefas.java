package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.ui.context.support.UiApplicationContextUtils;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListaDeTarefas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String corHex;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario criador;

    @OneToMany(mappedBy = "listaDeTarefas", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CompartilhamentoLista> compartilhamentos;
}
