package com.fatour.tcc.dto;

import com.fatour.tcc.entity.RoleUsuario;

public class UsuarioLoginResponseDTO {

    private Long id;
    private String msg;
    private RoleUsuario role;

    public UsuarioLoginResponseDTO(Long id, String msg, RoleUsuario role) {
        this.id = id;
        this.msg = msg;
        this.role = role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public Long getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    public RoleUsuario getRole() {
        return role;
    }

    public void setRole(RoleUsuario role) {
        this.role = role;
    }
}
