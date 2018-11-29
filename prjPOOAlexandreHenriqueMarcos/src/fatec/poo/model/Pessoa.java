package fatec.poo.model;
public class Pessoa {

    String Nome;
    String DataNasc;
    String Endereco;
    String Bairro;
    private String Cidade, Estado, CEP, Telefone, Celular, Sexo, EstadoCivil, RG, CPF, Email;
    private int Numero;

    public Pessoa(String Nome, String CPF) {
        this.Nome = Nome;
        this.CPF = CPF;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public String getCEP() {
        return CEP;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public String getRG() {
        return RG;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEmail() {
        return Email;
    }

    public int getNumero() {
        return Numero;
    }

    public String getNome() {
        return Nome;
    }
    
    
    
    public static boolean validarCPF(String CPF) {
        int d1, d2;
        int digito1, digito2, resto;
        int digitoCPF;
        String nDigResult;
        d1 = d2 = 0;
        digito1 = digito2 = resto = 0;
        for (int nCount = 1; nCount < CPF.length() - 1; nCount++) {
            digitoCPF = Integer.valueOf(CPF.substring(nCount - 1, nCount)).intValue();
            d1 = d1 + (11 - nCount) * digitoCPF;
            d2 = d2 + (12 - nCount) * digitoCPF;
        }
        resto = (d1 % 11);
        if (resto < 2) {
            digito1 = 0;
        } else {
            digito1 = 11 - resto;
        }
        d2 += 2 * digito1;
        resto = (d2 % 11);
        if (resto < 2) {
            digito2 = 0;
        } else {
            digito2 = 11 - resto;
        }
        String nDigVerific = CPF.substring(CPF.length() - 2, CPF.length());
        nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
        return nDigVerific.equals(nDigResult);
    }

    void setCpf(String cpf) {
        this.CPF = cpf;
    }

    public static void main(String[] args) {
        System.out.println(validarCPF("3268*****01") ? "OK" : "Incorreto");
    }
}
