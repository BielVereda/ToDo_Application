package com.List.ToDo.dto;

import com.List.ToDo.entities.Status;

public class TarefaDTO {

    private String titulo;
    private String descricao;
    private Long usuarioId;
    private Status status;

    public TarefaDTO() {}

    public TarefaDTO(String titulo, String descricao, Long usuarioId, Status status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.usuarioId = usuarioId;
        this.status = status;
    }

    // GETTERS E SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}