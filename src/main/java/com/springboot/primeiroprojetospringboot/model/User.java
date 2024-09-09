package com.springboot.primeiroprojetospringboot.model;
import java.util.Objects;


public class User {
    private String nome;
    private String email;

    public User() {
    }

    public User(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User nome(String nome) {
        setNome(nome);
        return this;
    }

    public User email(String email) {
        setEmail(email);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(nome, user.nome) && Objects.equals(email, user.email);
    }
}
