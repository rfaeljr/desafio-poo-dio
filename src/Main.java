import java.time.LocalDate;

import br.com.dominio.Curso;
import br.com.dominio.Mentoria;
import br.com.dominio.treinamento.TreinamentoMatricula;

public class Main {
    public static void main(String[] args) {
        //classe Treinamento não pode ser instanciada
        String funcionario  = TreinamentoMatricula.funcionarioResponsavelMatricula();
        Curso c = TreinamentoMatricula.getTreinamentoCurso();
        Mentoria m = TreinamentoMatricula.getTreinamentoMentoria();
        //Classe Curso, classe filha da classe pai Treinamento
        c.setId(1L); //aqui o atributo acessado é o da classe filha
        c.setTitulo("Aprendendo Java Com Rafael Alves da Costa Junior");
        //..continuação de setters para o objeto Curso
        //Classe Mentoria, classe filha da classe pai Treinamento
        m.setId(1L);
        m.setTitulo("Aprendendo Java Com Rafael Alves da Costa Junior");
        //..continuação de setters para o objeto Curso

        //Conceitos implementados de POO e de design patterns
        //**Herança Classes Curos e Mentoria herdando atributos e métodos da classe TreinamentoMatricula
        //**Abstração, mapeamento do domínio do mundo real, Bootcamps e cursos da DIO.
        //Em java classe Treinamento marcada com abstract não pode ser instanciada
        //**Polimorfismo, Sobrecarga ou Overload. Métodos da classe ITreinamento:
        //    public void matricular(Long id, Dev dev, tipoTreinamento tipo);
        //    public void matricular(Long id, Dev dev, LocalDateTime dtHora);
        //
        //Sobreescrita de método, classe implementando outro comportamento de um mesmo método da classe pai
        //TreinamentoMatricula.public void mudarStatus(Long id, String status)
        //Encapsulamento, atributos das classes Curso, BootCamp, Treinamento só podem ser acessados através de métodos getters and setters  
    }

}
