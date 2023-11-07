package br.edu.fatec.mvcDemo.modelo;
public class Jogo {
    private String nome;
    private String desenvolvedora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {this.desenvolvedora = desenvolvedora;}

    public Jogo(String nome, String desenvolvedora) {
        this.nome = nome;
        this.desenvolvedora = desenvolvedora;
    }
}
