package com.List.ToDo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.List.ToDo.dto.TarefaDTO;
import com.List.ToDo.service.TarefaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @PostMapping
    public ResponseEntity<?> criarTarefa(@Valid @RequestBody TarefaDTO dto) {
        return ResponseEntity.ok(tarefaService.criarTarefa(dto));
    }
}