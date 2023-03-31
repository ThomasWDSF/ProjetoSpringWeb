package com.web.tornese.SpringWeb.models;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "administradores")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @jakarta.validation.constraints.NotNull(message = "Não pode ser nulo")
    @NotBlank(message = "É obrigatório um nome")
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @jakarta.validation.constraints.NotNull(message = "Não pode ser nulo")
    @NotBlank(message = "É obrigatório um email")
    @Column(name = "email", length = 180, nullable = false)
    private String email;

    @jakarta.validation.constraints.NotNull(message = "Não pode ser nulo")
    @NotBlank(message = "É obrigatório uma senha")
    @Column(name = "senha", length = 255, nullable = false)
    private String senha;

    @Column(name = "observacao")
    @JdbcTypeCode(SqlTypes.LONGVARCHAR)
    private String observacao;

    public String getObservacao(){
        return this.observacao;
    }

    public void setObservacao(String observacao){
        this.observacao = observacao;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getSenha(){
        return this.senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
}
