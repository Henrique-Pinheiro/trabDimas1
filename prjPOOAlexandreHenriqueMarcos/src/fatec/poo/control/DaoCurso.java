package fatec.poo.control;

import fatec.poo.model.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoCurso {
    
    private Connection conn;

    public DaoCurso(Connection conn) {
        this.conn = conn;
    }
    
    public Curso consultar(String sigla){
        PreparedStatement ps = null;
        Curso c = null;
        try{
            ps = conn.prepareStatement("SELECT * from tb_Curso where " + "curso_sigla = ?");
            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() == true){
                c = new Curso (sigla, rs.getString("curso_nome"));
            }
        }
        catch (SQLException ex){
            System.out.println("ex.toString()");
        }
        return (c);
    }
    
    public void alterar(Curso curso){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("UPDATE tb_Curso set curso_nome = ?" + "where curso_sigla = ?");
            ps = conn.prepareStatement("UPDATE tb_Curso set curso_carga_horaria = ?" + "where curso_sigla = ?");
            ps = conn.prepareStatement("UPDATE tb_Curso set curso_valor = ?" + "where curso_sigla = ?");
            ps = conn.prepareStatement("UPDATE tb_Curso set curso_programa = ?" + "where curso_sigla = ?");
            ps = conn.prepareStatement("UPDATE tb_Curso set curso_data_vigente = ?" + "where curso_sigla = ?");
            ps = conn.prepareStatement("UPDATE tb_Curso set curso_valor_hora_instrutor = ?" + "where curso_sigla = ?");
            ps.setString(1, curso.getNome());
            ps.setString(2, curso.getSigla());
            ps.setDouble(3, curso.getCargaHoraria());
            ps.setString(4, curso.getSigla());
            ps.setDouble(5, curso.getValor());
            ps.setString(6, curso.getSigla());
            ps.setString(7, curso.getPrograma());
            ps.setString(8, curso.getSigla());
            ps.setString(9, curso.getDataVigencia());
            ps.setString(10, curso.getSigla());
            ps.setString(11, curso.getValorHoraInstrutor());
            ps.setString(12, curso.getSigla());
            ps.execute();
        } catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public void excluir(Curso curso){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("DELETE FROM tb_Curso whre curso_sigla = ?");
            ps.setString(1, curso.getSigla());
            ps.execute();
        } catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public void incluir(Curso curso){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("INSERT INTO tb_Curso(curso_sigla,curso_nome,curso_carga_horaria,curso_valor,curso_data_vigente,curso_valor_hora_instrutor,curso_programa) VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, curso.getSigla());
            ps.setString(2, curso.getNome());
            ps.setDouble(3, curso.getCargaHoraria());
            ps.setDouble(4, curso.getValor());
            ps.setString(5, curso.getDataVigencia());
            ps.setString(6, curso.getValorHoraInstrutor());
            ps.setString(7, curso.getPrograma());
            ps.execute();
        } catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
}
