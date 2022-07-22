package br.com.dominio;

import java.time.LocalDateTime;

//conceito de interface
public interface ITreinamento {
    public static enum tipoTreinamento {CURSO, MENTORIA};
    //conceito de sobrecarga ou overload ou polimorfismo
    //mesmo método contendo parametros diferentes
    public void matricular(Long id, Dev dev, tipoTreinamento tipo);
    public void matricular(Long id, Dev dev, LocalDateTime dtHora);
    public void cancelarMatricular(Long id, Dev dev);
    public void mudarStatus(Long id, String status);
}
