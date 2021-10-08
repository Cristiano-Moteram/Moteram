import buscaEndereco.CepServico;
import buscaEndereco.EnderecoDTO;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.print("Informe seu CEP: ");
        String cep = new Scanner(System.in).nextLine();

        EnderecoDTO enderecoDTO = CepServico.bucaEnderecoPeloCep(cep);

        System.out.println("Bairro: " + enderecoDTO.getBairro());
        System.out.println("Rua: " + enderecoDTO.getRua());
        System.out.println("Complemento: " + enderecoDTO.getComplemento());
        System.out.println("Localidade: " + enderecoDTO.getLocalidade());
        System.out.println("Estado: " + enderecoDTO.getUf());

    }

}
