package br.edu.iftm.aula07templates;

public class Contato {
     String nome, telefone;
     Long id;
     

  

    public Contato(String nome, String telefone, Long id) {
        this.nome = nome;
        this.telefone = telefone;
        this.id = id;
    }
    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
  
