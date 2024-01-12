package br.com.LolAPI.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PlayerResponse {

    private int codReturn;
    private String message;
    private List<PlayerDTO> player;
}
