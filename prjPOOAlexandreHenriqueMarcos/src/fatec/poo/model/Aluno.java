package fatec.poo.model;
public class Aluno extends Pessoa{
    private String Escolaridade;
    private Matricula matricula;
    
    public Aluno(String Nome, String CPF) {
        super(Nome, CPF);
    }

    public void setEscolaridade(String Escolaridade) {
        this.Escolaridade = Escolaridade;
    }
    
    public void setMatricula(Matricula m){
        matricula = m;
        m.setAluno(this);
    }
}
