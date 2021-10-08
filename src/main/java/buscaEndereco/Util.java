package buscaEndereco;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {

    public static String converteJsonEmTexto(BufferedReader bufferedReader) throws IOException {
        String resposta = "";
        String jsonEmTexto = "";

        while ((resposta = bufferedReader.readLine()) != null) {
            jsonEmTexto += resposta;
        }

        return jsonEmTexto;
    }

}
