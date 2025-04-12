package com.example.demo.entity;

import com.example.demo.util.NivelDeAcesso;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CompartilhamentoLista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private ListaDeTarefas listaDeTarefas;

    @Enumerated(EnumType.STRING)
    private NivelDeAcesso nivelDeAcesso;

}
