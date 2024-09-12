package gj.infnet.gjpetfriendsgcp2.infra;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import gj.infnet.gjpetfriendsgcp2.domain.Pedido;
import gj.infnet.gjpetfriendsgcp2.domain.Transporte;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TransporteDeserializer extends StdDeserializer<Transporte> {

    public TransporteDeserializer() {
        super(Transporte.class);
    }

    @Override
    public Transporte deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JacksonException {
        JsonNode node = jp.getCodec().readTree(jp);
        Transporte transpor = new Transporte();
        transpor.setId(node.get("id").asLong());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        transpor.setModeloVeiculo(node.get("modeloVeiculo").toString());
        transpor.setCombustivel(Transporte.TipoCombustiveis.valueOf(node.get("combustivel").asText()));
        return transpor;
    }
}
