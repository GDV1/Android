package com.example.gabri.projetofinal;

// Classe para a declaração das variáveis que vão manipular os dados inseridos
public class Cadastro {

    // Declaração das variáveis
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String idade;

    // Construtor
    Cadastro(String nome, String cpf, String telefone, String email, String idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
    }

    /**
     *
     * MÉTODOS GETTERS AND SETTERS
     *
     * */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
