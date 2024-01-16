package br.com.LolAPI.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ChampionsResponse {
    private int retunrnCode;
    private String mensagem;
    private List<ChampionsDTO> champions;


}
