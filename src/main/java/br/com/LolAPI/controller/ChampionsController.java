package br.com.LolAPI.controller;

import br.com.LolAPI.models.ChampionsDTO;
import br.com.LolAPI.service.ChampionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/api")
public class ChampionsController {

    @Autowired
    private ChampionsService service;

    @GetMapping(value = "/champion-list")
    public List<ChampionsDTO> listChampion() throws Exception{
        return service.getChampions()
    }
}
