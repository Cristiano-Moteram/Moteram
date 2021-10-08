package buscaEndereco;

public class EnderecoDTO {

    String complemento;
    String bairro;
    String localidade;
    String logradouro;
    String uf;

    public String getComplemento() {
        return this.complemento;
    }

    public String getBairro() {
        return this.bairro;
    }
    public String getRua() {
        return this.logradouro;
    }
    public String getUf(){
        return this.uf;
    }
    public String getLocalidade(){
        return this.localidade;
    }

}
