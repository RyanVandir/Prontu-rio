package com.prontuario.prontuario.model;

public class Paciente {
    private String id;
    private String nome;
    private String cpf;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Paciente(String id, String nome, String cpf, String email){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    public Paciente(){

    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                "}";
    }
}
