package com.aceleradora.cadastrador.dominio;

public class Matricula {
  
  private String numero;
  private String dataDeInicio;
  private Curso curso;


  public Matricula(String numero, String dataDeInicio, Curso curso) {
    this.numero = numero;
    this.dataDeInicio = dataDeInicio;
    this.curso = curso;
  }

  public String getNumero() {
    return this.numero;
  }

  public String getDataDeInicio() {
    return this.dataDeInicio;
  }

  public Curso getCurso() {
    return this.curso;
  }

}
