package com.example.demo.service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.TarefaRepository;
import com.example.demo.repository.UsuarioRepository;

import java.util.List;

public class UsuarioService {
    private UsuarioRepository usuarioRepository;


    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id){
        return usuarioRepository.findById(id).get();
    }

    public void delete(Long id){
        usuarioRepository.deleteById(id);
    }

}
