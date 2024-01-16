package br.com.LolAPI.service;

import br.com.LolAPI.entity.ChampionsEntity;
import br.com.LolAPI.entity.PlayerEntity;
import br.com.LolAPI.models.ChampionsDTO;
import br.com.LolAPI.repository.ChampionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service

public class ChampionsService {

    @Autowired
    private ChampionsRepository repository;

    public List<ChampionsDTO> getChampions() throws Exception{
        List<ChampionsDTO> championsList = new ArrayList<>();
        try{
            List<ChampionsEntity> championsListEntity = repository.findAll();
            for (ChampionsEntity championsEntity : championsListEntity) {
                ChampionsDTO champion = new ChampionsDTO();
                championsEntity.setName(championsEntity.getName());
                championsEntity.setLaunch_date(championsEntity.getLaunch_date());
                championsEntity.setSkins(championsEntity.getSkins());
                championsEntity.setPassive(championsEntity.getPassive());
                championsEntity.setFirst_hability(championsEntity.getFirst_hability());
                championsEntity.setSecond_hability(championsEntity.getSecond_hability());
                championsEntity.setThird_hability(championsEntity.getThird_hability());
                championsEntity.setUltimate(championsEntity.getUltimate());
                championsEntity.setMastery(championsEntity.getMastery());
        }
    } catch (Exception ex){
            throw new Exception(ex.getCause());
        }
        return championsList
}
