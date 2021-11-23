package iftm.edu.br.redballon2.Model;

public class redModel {

    private String nome;
    private Integer id;

    public redModel() {
    }

    public redModel(String nome, Integer id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
