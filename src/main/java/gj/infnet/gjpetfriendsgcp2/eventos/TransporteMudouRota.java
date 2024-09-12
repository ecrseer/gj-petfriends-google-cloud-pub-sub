package gj.infnet.gjpetfriendsgcp2.eventos;


import gj.infnet.gjpetfriendsgcp2.domain.Pedido;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
public class TransporteMudouRota implements IEventoDominio {

    private Long idTransporte;
    private Pedido pedido;
    private String motivo;

    private Date quando;


}
