package fatec.poo.model;

import java.util.ArrayList;

public class Turma {
    private String siglaTurma;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private String Periodo;
    private int qtdVagas;
    private String observacoes;
    private Curso curso;

    public Turma(String siglaTurma, String descricao) {
        this.siglaTurma = siglaTurma;
        this.descricao = descricao;
        }
                
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }
    
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }
    
    public void EmitirListaFrequencia(){
        
    }
}

