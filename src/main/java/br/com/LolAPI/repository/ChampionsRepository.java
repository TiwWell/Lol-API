package br.com.LolAPI.repository;

import br.com.LolAPI.entity.ChampionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionsRepository extends JpaRepository<ChampionsEntity, Long> {
}
