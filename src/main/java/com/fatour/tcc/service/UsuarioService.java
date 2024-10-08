package com.fatour.tcc.service;

import com.fatour.tcc.dto.UsuarioDTO;
import com.fatour.tcc.dto.UsuarioLoginRequestDTO;
import com.fatour.tcc.dto.UsuarioLoginResponseDTO;
import com.fatour.tcc.entity.Usuario;
import com.fatour.tcc.reporitory.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private  UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public Usuario insert(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setUsername(usuarioDTO.getUsername());
        usuario.setUseremail(usuarioDTO.getUseremail());
        usuario.setPassword(bCryptPasswordEncoder.encode(usuarioDTO.getPassword()));
        usuario.setRole(usuarioDTO.getRole());

        return usuarioRepository.save(usuario);
    }

    public UsuarioLoginResponseDTO login(UsuarioLoginRequestDTO usuarioLoginRequestDTO) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findByUseremail(usuarioLoginRequestDTO.getUseremail());
        if (usuarioOptional.isPresent()) {
            Usuario usuario = usuarioOptional.get();
            if (bCryptPasswordEncoder.matches(usuarioLoginRequestDTO.getPassword(), usuario.getPassword())){
                return new UsuarioLoginResponseDTO(usuario.getId(),"Login successfull");
            }
        }
        return new UsuarioLoginResponseDTO(null,"Login failed");
    }
}
