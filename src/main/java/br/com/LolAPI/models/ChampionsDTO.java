package br.com.LolAPI.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ChampionsDTO {
    String name;
    String launch_date;
    String skins;
    String passive;
    String first_hability;
    String second_hability;
    String third_hability;
    String ultimate;
    String mastery;
}
