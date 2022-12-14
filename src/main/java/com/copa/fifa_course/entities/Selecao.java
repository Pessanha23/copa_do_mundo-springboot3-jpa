package com.copa.fifa_course.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
@Entity
@Table(name = "tb_selecao")
public class Selecao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String time;
    private String continente;

    public Selecao() {
    }

    public Selecao(Long id, String time, String continente) {
        this.id = id;
        this.time = time;
        this.continente = continente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Selecao selecao = (Selecao) o;
        return id.equals(selecao.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
