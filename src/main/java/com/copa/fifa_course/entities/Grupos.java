package com.copa.fifa_course.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_grupos")
public class Grupos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Selecao selecao1;
    @ManyToOne
    private Selecao selecao2;
    @ManyToOne
    private Selecao selecao3;
    @ManyToOne
    private Selecao selecao4;

    public Grupos() {
    }

    public Grupos(Long id, Selecao selecao1, Selecao selecao2, Selecao selecao3, Selecao selecao4) {
        this.id = id;
        this.selecao1 = selecao1;
        this.selecao2 = selecao2;
        this.selecao3 = selecao3;
        this.selecao4 = selecao4;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Selecao getSelecao1() {
        return selecao1;
    }

    public void setSelecao1(Selecao selecao1) {
        this.selecao1 = selecao1;
    }

    public Selecao getSelecao2() {
        return selecao2;
    }

    public void setSelecao2(Selecao selecao2) {
        this.selecao2 = selecao2;
    }

    public Selecao getSelecao3() {
        return selecao3;
    }

    public void setSelecao3(Selecao selecao3) {
        this.selecao3 = selecao3;
    }

    public Selecao getSelecao4() {
        return selecao4;
    }

    public void setSelecao4(Selecao selecao4) {
        this.selecao4 = selecao4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grupos grupos = (Grupos) o;
        return id.equals(grupos.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
