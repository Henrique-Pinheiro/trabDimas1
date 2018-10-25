package fatec.poo.model;

/**
 *
 * @author 0030481713030
 */
public class APrazo {
    
    private double valor;
    private String dtVencimento;
    private double taxaJuros;
    private int qtdMensalidade;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void setQtdMensalidade(int qtdMensalidade) {
        this.qtdMensalidade = qtdMensalidade;
    }
    
}
