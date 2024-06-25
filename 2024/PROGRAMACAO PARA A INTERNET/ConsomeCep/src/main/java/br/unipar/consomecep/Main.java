package br.unipar.consomecep;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.BufferedReader;
import  java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        try{
            System.out.println("endereço: "+ getViaCep("85810061"));
        }catch (Exception e) {
            System.out.println(e);
        }

    }

      private static  String getViaCep(String cep) throws Exception {
            URL url = new URL("http://viacep.com.br/ws/"+cep.replace("-","").replace(".","")+"/xml/");

            BufferedReader in = new BufferedReader( new InputStreamReader(url.openStream()));

            String inputLine;
            String result = "";
            while ((inputLine = in.readLine()) != null) result += inputLine;

            in.close();
           // return result;

          Cep objCep = new Cep();
          objCep = Cep.unmarshalFmromString(result);

          return objCep.toString();
        }
    }
