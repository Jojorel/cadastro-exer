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
  private static List<Pessoa> pessoasAceleradora = new ArrayList<>(30);
  private static List<Aluna> alunasaceleradora = new ArrayList<>(30);
 
  public static void main(String[] args) {
    

    while(true){
      
    System.out.println("1- Para aluna digite , 2- para mentor digite  , 3- Dados de todas as pessoas , 4- Procure o nome da pessoa no cadastro ");
    int opcao = scanner.nextInt();

  switch (opcao){
    case 1 :  criaMentor();
    break;
    case 2 : 
    System.out.println("Voce escolheu para criar um Aluno : ");
    criaAluna();
    break;
    case 3 : percorrePessoas();
    break;
    case 4 : retornaNomeAluna();
    break;
    default:
    System.out.println("Voce terminou sua inscrição.");
    

  }
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
    alunasaceleradora.add(aluna);
    
    
    

  }

  public static void percorrePessoas(){
    for (int i=0; i<alunasaceleradora.size(); i++){
      Aluna aluna = alunasaceleradora.get(i);
      Matricula matricula = aluna.getMatricula();
      Curso curso = matricula.getCurso();

  
      

      System.out.println(printaInformacoes(aluna,matricula,curso));
      
    }
    }

  public static void retornaNomeAluna(){
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o nome da Aluna que voce quer encontrar no castro");
    String nomeDaPessoa = teclado.nextLine();

    boolean achou = false;
    for (int i=0; i<alunasaceleradora.size(); i++){
      if (nomeDaPessoa.equals(alunasaceleradora.get(i).getNome())){
          Aluna aluna = alunasaceleradora.get(i);
          Matricula matricula = aluna.getMatricula();
          Curso curso = matricula.getCurso();
          achou = true;
          System.out.println(printaInformacoes(aluna,matricula,curso));
      
      }
    }
    if (achou != true){
          System.out.println("Nome da Aluna não encontrado !!");
      } 
  }
  

  public static String printaInformacoes(Aluna aluna, Matricula matricula, Curso curso){
    return (" Nome da aluna : " + aluna.getNome() + " \n Data de nascimento : " + aluna.getDataDeNascimento() + "\n Cadastro de pessoa fisica : " + aluna.getCpf() 
    + "\n Semestre da turma : " + aluna.getSemestreTurma() + "\n Cadastro do estagio : " + aluna.getCadastroEstagio() + "\n Matricula numero : " + matricula.getNumero() + 
    "\n Matricula data de inicio : " + matricula.getDataDeInicio() + "\n Nome do curso : " + curso.getNomeCurso() + "\n Faculdade : " + curso.getFaculdade() + "\n Nota do curso : " + curso.getNotaINEP() );
  }
    
 



  }



