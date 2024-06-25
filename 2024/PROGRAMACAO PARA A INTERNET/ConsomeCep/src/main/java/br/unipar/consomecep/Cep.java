package br.unipar.consomecep;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;

@XmlRootElement(name =  "xmlcep")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class Cep {
    public String cep;
    public String logradouro;
    public String complemento;
    public String bairro;
    public String localidade;
    public String uf;
    public String ibge;
    public String gia;
    public String ddd;
    public String siafi;

    public static Cep unmarshalFmromString(String stringXml)
        throws Exception {
        JAXBContext context = null;
        context = JAXBContext.newInstance(Cep.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        StringReader reader = new StringReader( stringXml);
        return(Cep) unmarshaller.unmarshal(reader);
    }

    @Override
    public String toString() {
        return "Cep{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", ibge='" + ibge + '\'' +
                ", gia='" + gia + '\'' +
                ", ddd='" + ddd + '\'' +
                ", siafi='" + siafi + '\'' +
                '}';
    }
}
