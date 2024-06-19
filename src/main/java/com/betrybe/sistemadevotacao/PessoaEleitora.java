package com.betrybe.sistemadevotacao;

public class PessoaEleitora extends Pessoa {

  private String cpf;

  public PessoaEleitora(String nome, String cpf) {
    this.cpf = cpf;
    setNome(nome);
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

}
