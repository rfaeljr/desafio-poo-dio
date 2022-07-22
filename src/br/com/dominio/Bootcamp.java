package br.com.dominio;

import java.time.LocalDateTime;
import java.util.List;


public class Bootcamp {
    private Long id;
    private String titulo;
    private String pathImagem;
    private LocalDateTime dtHoraInicio;
    private LocalDateTime dtHoraFim;
    private short qtdeMaxDevs;
    private List<Curso> listaCursos;


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

    public String getPathImagem() {
        return this.pathImagem;
    }

    public void setPathImagem(String pathImagem) {
        this.pathImagem = pathImagem;
    }

    public LocalDateTime getDtHoraInicio() {
        return this.dtHoraInicio;
    }

    public void setDtHoraInicio(LocalDateTime dtHoraInicio) {
        this.dtHoraInicio = dtHoraInicio;
    }

    public LocalDateTime getDtHoraFim() {
        return this.dtHoraFim;
    }

    public void setDtHoraFim(LocalDateTime dtHoraFim) {
        this.dtHoraFim = dtHoraFim;
    }

    public short getQtdeMaxDevs() {
        return this.qtdeMaxDevs;
    }

    public void setQtdeMaxDevs(short qtdeMaxDevs) {
        this.qtdeMaxDevs = qtdeMaxDevs;
    }

    public List<Curso> getListaCursos() {
        return this.listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }


}
