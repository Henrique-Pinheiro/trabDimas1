package fatec.poo.model;

/**
 * @author 0030481713030
 */
public class Matricula {
    private String data;
    private int qtdeFaltas;
    private double nota;
    private String tipoMatricula;
    private APrazo aPrazo;
    private AVista aVista;
    private Aluno aluno;
    private Turma turma;

    public Matricula(String data) {
        this.data = data;
    }

    public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public void emitirCarne(){
    }

    public void setTipoMatricula(String tipoMatricula) {
        this.tipoMatricula = tipoMatricula.toLowerCase();
    }

    public void setAluno(Aluno a){
        aluno = a;
        a.setMatricula(this);
    }
    
}
