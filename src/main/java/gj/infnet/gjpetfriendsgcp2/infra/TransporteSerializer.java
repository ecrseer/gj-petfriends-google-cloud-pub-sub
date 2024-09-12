package gj.infnet.gjpetfriendsgcp2.infra;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import gj.infnet.gjpetfriendsgcp2.domain.Pedido;
import gj.infnet.gjpetfriendsgcp2.domain.Transporte;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class TransporteSerializer extends StdSerializer<Transporte> {

    public TransporteSerializer() {
        super(Transporte.class);
    }


    @Override
    public void serialize(Transporte transporte, JsonGenerator jgen, SerializerProvider provider) throws IOException {

        jgen.writeStartObject();
        jgen.writeNumberField("id", transporte.getId());
        jgen.writeStringField("combustivel", ""+transporte.getCombustivel());
        jgen.writeStringField("modelVeiculo", transporte.getModeloVeiculo());


    }
}
