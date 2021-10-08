package buscaEndereco;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CepServico {

    static String servicoWeb = "http://viacep.com.br/ws/";
    static int httpCod = 200;

    public static EnderecoDTO bucaEnderecoPeloCep(String cep) throws Exception {
        String chamadaURL = servicoWeb + cep +"/json";

        try {
            URL url = new URL(chamadaURL);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if(conexao.getResponseCode() != httpCod){
                throw new RuntimeException("Error de HTTP: " +conexao.getResponseCode());
            }

            BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            String jsonTexto = Util.converteJsonEmTexto(resposta);

            Gson gson = new Gson();
            EnderecoDTO enderecoDTO = gson.fromJson(jsonTexto, EnderecoDTO.class);

            return enderecoDTO;

        } catch (Exception e){

            throw new Exception("ERRO: " + e);
        }

    }

}
