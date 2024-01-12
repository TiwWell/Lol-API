package br.com.LolAPI.repository;

import br.com.LolAPI.entity.PlayerEntity;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {

}
