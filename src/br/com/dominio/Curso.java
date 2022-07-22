package br.com.dominio;

import java.time.LocalDateTime;

public class Curso extends Treinamento {
    private Long id;
    private LocalDateTime dtHoraInicio;
    private LocalDateTime dtHoraFim;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

}
