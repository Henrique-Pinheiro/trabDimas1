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
    private Instrutor instrutor;
    private ArrayList<Matricula> matriculas;

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

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public String getSiglaTurma() {
        return siglaTurma;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }
    
    public void EmitirListaFrequencia(){
        
    }
}

