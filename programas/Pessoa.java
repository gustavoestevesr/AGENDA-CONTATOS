package programas;

public class Pessoa {

    // Construtor
    public Pessoa(){

    }

    public Pessoa(String nome, String sobrenome, String telefone){
        setNome(nome);
        setSobrenome(sobrenome);
        setTelefone(telefone);        
    }
    
    // Atributos
    String nome;
    String sobrenome;
    String telefone; //(21) 9 123-1234

    // Encapsulamento
    void setNome(String nome){
        this.nome = nome;
    }
    String getNome(){
        return nome;
    }
    String getSobrenome() {
        return sobrenome;
    }
    void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    String getTelefone() {
        return telefone;
    }
    void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    void getInfo(){
        System.out.printf("%s %s - %s\n", getNome(), getSobrenome(), getTelefone());
    }

}
