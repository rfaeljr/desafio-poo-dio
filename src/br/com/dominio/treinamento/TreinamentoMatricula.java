package br.com.dominio.treinamento;

import java.time.LocalDateTime;

import br.com.dominio.Curso;
import br.com.dominio.Dev;
import br.com.dominio.ITreinamento;
import br.com.dominio.Mentoria;


//Conceito de inversão de dependência
public class TreinamentoMatricula implements ITreinamento{
    public static String funcionario;

    //Conceito de Singleton, implementado de forma estática, no mundo real aplica-se a coisas como jdbc connections etc 
    public static String funcionarioResponsavelMatricula(){
        if(funcionario==null){
            return "Josevaldo";
        }
        else{
            return "Default";
        }
    }

    //Conceito de factory de objetos
    public static Curso getTreinamentoCurso(){
        return new Curso();
    }

    public static Mentoria getTreinamentoMentoria(){
        return new Mentoria();
    }

    @Override
    //Conceito de command, qualquer que seja o tipo de treinamento Curso ou Mentoria para matricular deve-se acessar este método
    public void matricular(Long id, Dev dev, tipoTreinamento tipo) {
        // TODO Auto-generated method stub
        if (tipo == tipoTreinamento.CURSO) {short v = 1+1;}
        else{short v = 2+2;}
    }

    @Override
    public void matricular(Long id, Dev dev, LocalDateTime dtHora) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cancelarMatricular(Long id, Dev dev) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mudarStatus(Long id, String status) {
        // TODO Auto-generated method stub
        
    }


    
}
