package com.aceleradora.cadastrador;

import com.aceleradora.cadastrador.dominio.Aluna;
import com.aceleradora.cadastrador.dominio.Curso;
import com.aceleradora.cadastrador.dominio.Matricula;
import com.aceleradora.cadastrador.dominio.Mentora;
import com.aceleradora.cadastrador.dominio.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  
  public static Scanner scanner = new Scanner(System.in);
  private static List<Pessoa> pessoasAceleradora = new ArrayList<>();
  

  public static void main(String[] args) {
    
    System.out.println("Para aluna digite 1, para mentor digite 2: ");
    int opcao = scanner.nextInt();

  switch (opcao){
    case 1 :  criaMentor();
    break;
    case 2 : 
    System.out.println("Voce escolheu para criar um Aluno : ");
    criaAluna();
    break;
    default:
    System.out.println("Voce terminou sua inscrição.");
    

  }

  }

  private static void criaMentor() {
    
  }

  public static void criaAluna() {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escolha o Nome do aluno");
    String nomeDaPessoa = teclado.nextLine();

    System.out.println("escolha o a matricula");
    String cadastroPessoaFisica = teclado.nextLine();

    System.out.println("Digite a data de nascimento");
    String dataDeNascimento = teclado.nextLine();

    System.out.println("Semestre da Aluna ");
    String semestreTurma = teclado.nextLine();

    System.out.println("Cadastro do estagio ");
    String cadastroEstagio = teclado.nextLine();

    System.out.println("Escreva os dados da Matricula");
    System.out.println("Digite o numero de matricula");
    String numero = teclado.nextLine();
    System.out.println("Data de inicio");
    String dataDeInicio = teclado.nextLine();
    System.out.println("Nome do curso");
    String nomecurso = teclado.nextLine();
    System.out.println("Nome da Faculdade");
    String faculdade = teclado.nextLine();
    System.out.println("Nota da faculdade");
    double nota = teclado.nextInt();

    Curso curso = new Curso(nomecurso, faculdade,nota );

    Matricula matricula = new Matricula(numero, dataDeInicio,curso);
    
    Aluna aluna = new Aluna(nomeDaPessoa, dataDeNascimento, cadastroPessoaFisica, semestreTurma, cadastroEstagio, matricula);

    System.out.println(" Nome da aluna : " + aluna.getNome() + " \n Data de nascimento : " + aluna.getDataDeNascimento() + "\n Cadastro de pessoa fisica : " + aluna.getCpf() 
    + "\n Semestre da turma : " + aluna.getSemestreTurma() + "\n Cadastro do estagio : " + aluna.getCadastroEstagio() + "\n Matricula numero : " + matricula.getNumero() + 
    "\n Matricula data de inicio : " + matricula.getDataDeInicio() + "\n Nome do curso : " + curso.getNomeCurso() + "\n Faculdade : " + curso.getFaculdade() + "\n Nota do curso : " + curso.getNotaINEP() );

  }

}
