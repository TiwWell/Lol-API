package br.com.LolAPI.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Table(name = "Player")
@Data
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nickname")
    private String nickname;

    @Column(name = "rank")
    private String rank;

    @Column (name = "level")
    private int level;

}
