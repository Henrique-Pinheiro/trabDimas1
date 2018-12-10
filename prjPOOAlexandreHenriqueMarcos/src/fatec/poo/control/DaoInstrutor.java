package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Instrutor;

public class DaoInstrutor {

    private Connection conn;

    public DaoInstrutor(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_Instrutor(instrutor_cpf, instrutor_nome, instrutor_data_nascimento, instrutor_sexo, instrutor_estado_civil, intrutor_endereço, intrutor_numero, intrutor_bairro, intrutor_CEP, intrutor_cidade, intrutor_estado, intrutor_tel_residencial, intrutor_celular, intrutor_RG, instrutor_formacao, intrutor_area_atuacao, instrutor_email) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, instrutor.getCPF());
            ps.setString(2, instrutor.getNome());
            ps.setString(3, instrutor.getDataNasc());
            ps.setString(4, instrutor.getSexo());
            ps.setString(5, instrutor.getEstadoCivil());
            ps.setString(6, instrutor.getEndereco());
            ps.setString(7, instrutor.getNumero());
            ps.setString(8, instrutor.getBairro());
            ps.setString(9, instrutor.getCEP());
            ps.setString(10, instrutor.getCidade());
            ps.setString(11, instrutor.getEstado());
            ps.setString(12, instrutor.getTelefone());
            ps.setString(13, instrutor.getCelular());
            ps.setString(14, instrutor.getRG());
            ps.setString(15, instrutor.getFormacao());
            ps.setString(16, instrutor.getAreAtuacao());
            ps.setString(17, instrutor.getEmail());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tb_Instrutor set instrutor_nome = ?"
                    + "where instrutor_cpf = ?");

            ps.setString(1, instrutor.getNome());
            ps.setString(2, instrutor.getDataNasc());
            ps.setString(3, instrutor.getSexo());
            ps.setString(4, instrutor.getEstadoCivil());
            ps.setString(5, instrutor.getEndereco());
            ps.setString(6, instrutor.getNumero());
            ps.setString(7, instrutor.getBairro());
            ps.setString(8, instrutor.getCEP());
            ps.setString(9, instrutor.getCidade());
            ps.setString(10, instrutor.getEstado());
            ps.setString(11, instrutor.getTelefone());
            ps.setString(12, instrutor.getCelular());
            ps.setString(13, instrutor.getRG());
            ps.setString(14, instrutor.getFormacao());
            ps.setString(15, instrutor.getAreAtuacao());
            ps.setString(16, instrutor.getEmail());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public Instrutor consultar(String CPF) {

        Instrutor i = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tb_Instrutor where "
                    + "instrutor_cpf = ?");

            ps.setString(1, CPF);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                i = new Instrutor(CPF, rs.getString("instrutor_nome"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (i);
    }

    public Object retornaAtibuto(String CPF, String atributo) {
        PreparedStatement ps = null;
        Object objAtributo = null;
        try {
            ps = conn.prepareStatement("SELECT " + atributo + " from tb_Instrutor where "
                    + "instrutor_cpf = ?");
            ps.setString(1, CPF);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                //if (atributo.equals("turma_qtd_vagas")) {
                    //objAtributo = rs.getInt(atributo);
                //} 
                //else {
                    objAtributo = rs.getString(atributo);
                //}

            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return objAtributo;
    }

    public void excluir(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_Instrutor where instrutor_cpf = ?");

            ps.setString(1, instrutor.getCPF());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
