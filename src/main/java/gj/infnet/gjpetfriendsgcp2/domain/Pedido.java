package gj.infnet.gjpetfriendsgcp2.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dataPedido;
    private Long clienteId;
    private PedidoStatus status;

    public enum PedidoStatus {
        NOVO, FECHADO, CANCELADO, ENVIADO
    }

}