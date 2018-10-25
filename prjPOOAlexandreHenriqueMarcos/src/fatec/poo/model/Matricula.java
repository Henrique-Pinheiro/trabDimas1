package fatec.poo.model;

/**
 * @author 0030481713030
 */
public class Matricula {
    private String data;
    private int qtdeFaltas;
    private double nota;

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
}
