package br.com.LolAPI.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Table(name = "Champions")
@Data


public class ChampionsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Nickname")
    private String name;

    @Column(name = "Launch Date")
    private String launch_date;

    @Column(name = "Skins")
    private String skins;

    @Column(name = "Passive")
    private String Passive;

    @Column(name = "First Hability")
    private String first_hability;

    @Column(name = "Second Hability")
    private String second_hability;

    @Column(name = "Third Hability")
    private String third_hability;

    @Column(name = "Ultimate")
    private String ultimate;

    @Column(name = "Mastery")
    private String mastery;

}
