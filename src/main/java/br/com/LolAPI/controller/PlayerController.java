package br.com.LolAPI.controller;

import br.com.LolAPI.models.PlayerDTO;
import br.com.LolAPI.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")

public class PlayerController {
    @Autowired
    private PlayerService service;

    @GetMapping(value = "/lista-player")
    public List<PlayerDTO> listaPlayer() throws Exception{
        return service.getPlayer();

    }


}
