package com.List.ToDo.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.List.ToDo.dto.TarefaDTO;
import com.List.ToDo.entities.Tarefa;
import com.List.ToDo.entities.Usuario;
import com.List.ToDo.repository.TarefaRepository;
import com.List.ToDo.repository.UsuarioRepository;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;
    private final UsuarioRepository usuarioRepository;

    public TarefaService(TarefaRepository tarefaRepository, UsuarioRepository usuarioRepository) {
        this.tarefaRepository = tarefaRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public Tarefa criarTarefa(TarefaDTO dto) {

        Usuario usuario = usuarioRepository.findById(dto.getUsuarioId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        Tarefa tarefa = new Tarefa(
                dto.getTitulo(),
                dto.getDescricao(),
                LocalDate.now(),
                dto.getStatus(),
                usuario
        );

        return tarefaRepository.save(tarefa);
    }
}