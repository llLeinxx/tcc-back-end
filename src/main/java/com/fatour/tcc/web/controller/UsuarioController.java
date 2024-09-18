package com.fatour.tcc.web.controller;


import com.fatour.tcc.entity.Usuario;
import com.fatour.tcc.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/usuarios")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> insert(@RequestBody Usuario usuario){
           Usuario user = usuarioService.insert(usuario);
           return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
