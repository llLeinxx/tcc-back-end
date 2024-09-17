package com.fatour.tcc.service;

import com.fatour.tcc.entity.Usuario;
import com.fatour.tcc.reporitory.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario insert(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
