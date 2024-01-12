package br.com.LolAPI.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class PlayerDTO {
    String nickname;
    String rank;
    int level;

}
