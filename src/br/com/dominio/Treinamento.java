package br.com.dominio;

import java.util.List;

public abstract class Treinamento {
    public static enum status {ATIVO, INATIVO, CANCELADO};
    protected Long id;
    protected String titulo;
    protected String ementa;
    protected String professor;
    protected String cargaHoraria;
    protected List<Dev> listaDevs;
    protected List<Professor> listaProfessor;
    protected short qtdeMaxDev;



    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEmenta() {
        return this.ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getProfessor() {
        return this.professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Dev> getListaDevs() {
        return this.listaDevs;
    }

    public void setListaDevs(List<Dev> listaDevs) {
        this.listaDevs = listaDevs;
    }

    public List<Professor> getListaProfessor() {
        return this.listaProfessor;
    }

    public void setListaProfessor(List<Professor> listaProfessor) {
        this.listaProfessor = listaProfessor;
    }

    public short getQtdeMaxDev() {
        return this.qtdeMaxDev;
    }

    public void setQtdeMaxDev(short qtdeMaxDev) {
        this.qtdeMaxDev = qtdeMaxDev;
    }


}
