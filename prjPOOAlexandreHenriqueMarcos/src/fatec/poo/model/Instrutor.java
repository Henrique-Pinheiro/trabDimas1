package fatec.poo.model;

import java.util.ArrayList;

public class Instrutor extends Pessoa{
    private String Formacao, AreAtuacao;
    private ArrayList<Turma> turmas;
    
//    public Instrutor(String Nome, String CPF) {
//        super(Nome, CPF);
//        turmas = new ArrayList<Turma>();
//    }

    public Instrutor(String Nome, String CPF) {
        super(CPF, Nome);
        this.Formacao = Formacao;
        this.AreAtuacao = AreAtuacao;
        this.turmas = turmas;
    }
    
    public void setFormacao(String Formacao) {
        this.Formacao = Formacao;
    }

    public String getFormacao() {
        return Formacao;
    }

    public String getAreAtuacao() {
        return AreAtuacao;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
    
    

    public void setAreAtuacao(String AreAtuacao) {
        this.AreAtuacao = AreAtuacao;
    }
    
    public void addTurma(Turma t){
        turmas.add(t);
        t.setInstrutor(this);
    }
    
    
}
