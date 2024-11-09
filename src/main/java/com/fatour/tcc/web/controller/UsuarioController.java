package com.fatour.tcc.web.controller;


import com.fatour.tcc.dto.SeatDTO;
import com.fatour.tcc.dto.UsuarioDTO;
import com.fatour.tcc.dto.UsuarioLoginRequestDTO;
import com.fatour.tcc.dto.UsuarioLoginResponseDTO;
import com.fatour.tcc.entity.Usuario;
import com.fatour.tcc.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/usuarios")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> insert(@RequestBody UsuarioDTO usuarioDTO) {
           Usuario user = usuarioService.insert(usuarioDTO);
           return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PostMapping("/login")
    public ResponseEntity<UsuarioLoginResponseDTO> login(@RequestBody UsuarioLoginRequestDTO usuarioDTO) {
        UsuarioLoginResponseDTO usuarioLoginResponseDTO = usuarioService.login(usuarioDTO);
        if ("Login successfull".equals(usuarioLoginResponseDTO.getMsg())){
            return ResponseEntity.status(HttpStatus.OK).body(usuarioLoginResponseDTO);
        }else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(usuarioLoginResponseDTO);
        }
    }


    @GetMapping("/{usuarioId}/seat")
    public ResponseEntity<List<SeatDTO>> findSeatByExcursionId(@PathVariable Long usuarioId) {
        List<SeatDTO> seats = usuarioService.findSeatByUsuarioId(usuarioId);
        return ResponseEntity.ok(seats);
    }
}
