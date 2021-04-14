package com.aceleradora.cadastrador.dominio;

public class Aluna extends Pessoa {
  private String semestreTurma;
  private String cadastroEstagio;
  private Matricula matricula;

  public Aluna(String nomeDaPessoa, String dataDeNascimento, String cadastroPessoaFisica, String semestreTurma, String cadastroEstagio, Matricula matricula) {
    super(nomeDaPessoa, dataDeNascimento, cadastroPessoaFisica);
    this.semestreTurma = semestreTurma;
    this.cadastroEstagio = cadastroEstagio;
    this.matricula = matricula;
  }

 
  public String todosOsGetters(){
    getSemestreTurma();
    getCadastroEstagio();
    getDataDeNascimento();
    getMatricula();
    getNome();
    getCpf();

    return todosOsGetters();

  }

  


  public String getSemestreTurma() {
    return this.semestreTurma;
    
  }

  public String getCadastroEstagio() {
    return this.cadastroEstagio;
  }

  public Matricula getMatricula() {
    return this.matricula;
    
  
  }

}
