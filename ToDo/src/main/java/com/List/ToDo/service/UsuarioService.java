package com.List.ToDo.service;

import org.springframework.stereotype.Service;

import com.List.ToDo.dto.UsuarioDTO;
import com.List.ToDo.entities.Usuario;
import com.List.ToDo.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario criarUsuario(UsuarioDTO dto) {
        Usuario usuario = new Usuario(
                dto.getNome(),
                dto.getEmail(),
                dto.getSenha()
        );

        return usuarioRepository.save(usuario);
    }
}