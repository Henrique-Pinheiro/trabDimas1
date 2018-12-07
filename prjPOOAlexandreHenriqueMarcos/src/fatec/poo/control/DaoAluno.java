package fatec.poo.control;

import fatec.poo.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoAluno {
    private Connection conn;

    public DaoAluno(Connection conn) {
        this.conn = conn;
    }
    
    public Aluno consultar(String cpf){
        PreparedStatement ps = null;
        Aluno a = null;
        try{
            ps = conn.prepareStatement("SELECT * from tb_Aluno where " + "aluno_cpf = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() == true){
                a = new Aluno (cpf, rs.getString("aluno_nome"));
            }
        }
        catch (SQLException ex){
            System.out.println("ex.toString()");
        }
        return (a);
    }
    
        
        public void alterar(Aluno aluno){
            PreparedStatement ps = null;
            try{
                ps = conn.prepareStatement("UPDATE tb_Aluno setme aluno_nome = ?" + "where aluno_cpf = ?");
                ps = conn.prepareStatement("UPDATE tb_Aluno setme aluno_data_nascimento = ?" + "where aluno_cpf = ?");
                ps = conn.prepareStatement("UPDATE tb_Aluno setme aluno_sexo = ?" + "where aluno_cpf = ?");
                ps = conn.prepareStatement("UPDATE tb_Aluno setme aluno_estado_civil = ?" + "where aluno_cpf = ?");
                ps = conn.prepareStatement("UPDATE tb_Aluno setme aluno_escolaridade = ?" + "where aluno_cpf = ?");
                ps = conn.prepareStatement("UPDATE tb_Aluno setme aluno_endereco = ?" + "where aluno_cpf = ?");
                ps = conn.prepareStatement("UPDATE tb_Aluno setme aluno_numero = ?" + "where aluno_cpf = ?");
                ps = conn.prepareStatement("UPDATE tb_Aluno setme aluno_bairro = ?" + "where aluno_cpf = ?");
                ps = conn.prepareStatement("UPDATE tb_Aluno setme aluno_CEP = ?" + "where aluno_cpf = ?");
                ps = conn.prepareStatement("UPDATE tb_Aluno setme aluno_cidade = ?" + "where aluno_cpf = ?");
                ps = conn.prepareStatement("UPDATE tb_Aluno setme aluno_estado = ?" + "where aluno_cpf = ?");
                ps = conn.prepareStatement("UPDATE tb_Aluno setme aluno_tel_residencial = ?" + "where aluno_cpf = ?");
                ps = conn.prepareStatement("UPDATE tb_Aluno setme aluno_celular = ?" + "where aluno_cpf = ?");
                ps = conn.prepareStatement("UPDATE tb_Aluno setme aluno_RG = ?" + "where aluno_cpf = ?");
                ps = conn.prepareStatement("UPDATE tb_Aluno setme aluno_email = ?" + "where aluno_cpf = ?");
                ps.setString(1, aluno.getNome());
                ps.setString(1, aluno.getCPF());
                ps.setString(1, aluno.getDataNasc());
                ps.setString(1, aluno.getCPF());
                ps.setString(1, aluno.getSexo());
                ps.setString(1, aluno.getCPF());
                ps.setString(1, aluno.getEstadoCivil());
                ps.setString(1, aluno.getCPF());
                ps.setString(1, aluno.getEscolaridade());
                ps.setString(1, aluno.getCPF());
                ps.setString(1, aluno.getEndereco());
                ps.setString(1, aluno.getCPF());
                ps.setDouble(1, aluno.getNumero());
                ps.setString(1, aluno.getCPF());
                ps.setString(1, aluno.getBairro());
                ps.setString(1, aluno.getCPF());
                ps.setString(1, aluno.getCEP());
                ps.setString(1, aluno.getCPF());
                ps.setString(1, aluno.getCidade());
                ps.setString(1, aluno.getCPF());
                ps.setString(1, aluno.getEstado());
                ps.setString(1, aluno.getCPF());
                ps.setString(1, aluno.getTelefone());
                ps.setString(1, aluno.getCPF());
                ps.setString(1, aluno.getCelular());
                ps.setString(1, aluno.getCPF());
                ps.setString(1, aluno.getRG());
                ps.setString(1, aluno.getCPF());
                ps.setString(1, aluno.getEmail());
                ps.setString(1, aluno.getCPF());
                ps.execute();                
            }
            catch(SQLException ex){
                System.out.println("ex.toString()");
            }
        }
        
        public void excluir(Aluno aluno){
            PreparedStatement ps = null;
            try{
                ps = conn.prepareStatement("DELETE FROM tb_Aluno whre aluno_cpf = ?");
                ps.setString(1, aluno.getCPF());
                ps.execute();
            }
            catch(SQLException ex){
                System.out.println("ex.toString()");
            }
        }
        
        public void incluir(Aluno aluno){
            PreparedStatement ps = null;
            try{
                ps = conn.prepareStatement("INSERT INTO tb_Aluno(aluno_cpf,aluno_nome,aluno_data_nascimento,aluno_sexo,aluno_estado_civil,aluno_escolaridade,aluno_endereco,aluno_numero,aluno_bairro,aluno_CEP,aluno_cidade,aluno_estado,aluno_tel_residencial,aluno_celularaluno_RG,aluno_email) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, aluno.getCPF());
                ps.setString(1, aluno.getNome());
                ps.setString(1, aluno.getDataNasc());
                ps.setString(1, aluno.getSexo());
                ps.setString(1, aluno.getEstado());
                ps.setString(1, aluno.getEscolaridade());
                ps.setString(1, aluno.getEndereco());
                ps.setDouble(1, aluno.getNumero());
                ps.setString(1, aluno.getBairro());
                ps.setString(1, aluno.getCEP());
                ps.setString(1, aluno.getCidade());
                ps.setString(1, aluno.getEstado());
                ps.setString(1, aluno.getTelefone());
                ps.setString(1, aluno.getCelular());
                ps.setString(1, aluno.getRG());
                ps.setString(1, aluno.getEmail());
                ps.execute();
            } catch(SQLException ex){
                System.out.println("ex.toString()");
            }
        }
}
