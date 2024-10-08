package com.fatour.tcc.dto;

public class UsuarioLoginResponseDTO {

    private Long id;
    private String msg;

    public UsuarioLoginResponseDTO(Long id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public Long getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }
}
