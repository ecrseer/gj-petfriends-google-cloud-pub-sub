package gj.infnet.gjpetfriendsgcp2.domain;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.io.Serializable;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Transporte   implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modeloVeiculo;

    private TipoCombustiveis combustivel;



    public enum TipoCombustiveis{
        GASOLINA,DIESEL,ETANOL
    }

    private Long lojaPetShopId;

    @ManyToOne
    @JoinColumn(name = "entregador_id")
    private Entregador entregador;

    private Rota rota;

    public void mudarRota(Rota nova,String motivo){
        if(motivo.length()<6){
            throw new RuntimeException("É necessário um motivo maior que 6 caracteres para mudar de rota");
        }
        this.rota=nova;

    }


    public void setId(Long id) {
        this.id = id;
    }


    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }



    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }



    public void setCombustivel(TipoCombustiveis combustivel) {
        this.combustivel = combustivel;
    }


}
