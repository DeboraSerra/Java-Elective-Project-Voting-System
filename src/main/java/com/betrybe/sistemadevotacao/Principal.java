package com.betrybe.sistemadevotacao;

import java.util.Scanner;

public class Principal {

  static void registerCandidate(Scanner scanner, GerenciamentoVotacao manager) {
    String question = "Cadastrar pessoa candidata?\n"
        + "1 - Sim\n"
        + "2 - Não\n" + "Entre com o número correspondente à opção desejada:";
    System.out.println(question);
    int answer = scanner.nextInt();
    while (answer != 2) {
      System.out.println("Entre com o nome da pessoa candidata:");
      String name = scanner.next();
      System.out.println("Entre com o número da pessoa candidata:");
      int number = scanner.nextInt();
      manager.cadastrarPessoaCandidata(name, number);
      System.out.println(question);
      answer = scanner.nextInt();
    }
  }

  static void registerPeople(Scanner scanner, GerenciamentoVotacao manager) {
    String question = "Cadastrar pessoa eleitora?\n"
        + "1 - Sim\n"
        + "2 - Não\n"
        + "Entre com o número correspondente à opção desejada:";
    System.out.println(question);
    int answer = scanner.nextInt();
    while (answer != 2) {
      System.out.println("Entre com o nome da pessoa eleitora:");
      String name = scanner.next();
      System.out.println("Entre com o CPF da pessoa eleitora:");
      String cpf = scanner.next();
      manager.cadastrarPessoaEleitora(name, cpf);
      System.out.println(question);
      answer = scanner.nextInt();
    }
  }

  static void registerVote(Scanner scanner, GerenciamentoVotacao manager) {
    String question = " Entre com o número correspondente à opção desejada:\n"
        + " 1 - Votar\n"
        + " 2 - Resultado Parcial\n"
        + " 3 - Finalizar Votação";
    System.out.println(question);

    int answer = scanner.nextInt();

    while (answer != 3) {
      if (answer == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int number = scanner.nextInt();
        manager.votar(cpf, number);
      } else {
        manager.mostrarResultado();
      }
      System.out.println(question);
      answer = scanner.nextInt();
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao manager = new GerenciamentoVotacao();
    registerCandidate(scanner, manager);
    registerPeople(scanner, manager);
    registerVote(scanner, manager);

    manager.mostrarResultado();
    scanner.close();

  }

}
