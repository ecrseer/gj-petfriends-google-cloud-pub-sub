package gj.infnet.gjpetfriendsgcp2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class Rota {
    private int id;
    private List<String> enderecos;
    private List<String> paradas;

}
