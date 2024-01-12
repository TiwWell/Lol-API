package br.com.LolAPI.service;

import br.com.LolAPI.entity.PlayerEntity;
import br.com.LolAPI.models.PlayerDTO;
import br.com.LolAPI.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository repository;

    public List<PlayerDTO> getPlayer() throws Exception{
        List<PlayerDTO> listaDePlayers = new ArrayList<>();
        try{
            List<PlayerEntity> listaPlayerEntity = repository.findAll();
            for (PlayerEntity playerEntity : listaPlayerEntity) {
                PlayerDTO player = new PlayerDTO();
                player.setNickname(playerEntity.getNickname());
                player.setRank(playerEntity.getRank());
                player.setLevel(playerEntity.getLevel());
                listaDePlayers.add(player);
            }
        } catch (Exception ex){
            throw new Exception(ex.getCause());
        }
        return listaDePlayers;
    }

}
