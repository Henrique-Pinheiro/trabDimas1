package fatec.poo.control;

import fatec.poo.model.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 0030481713030
 */
public class DaoTurma {
    
    private Connection conn;
    
    public DaoTurma(Connection conn) {
        this.conn = conn;
    }
    
    public ArrayList<String> listarCurso(){
        PreparedStatement ps = null;
        ArrayList<String> ls = new ArrayList<String>();
        try{
            ps = conn.prepareStatement("SELECT * FROM tb_Curso");
            //ps.setString(1, "tb_Curso");
            ResultSet rs = ps.executeQuery();
            //System.out.println("");
            while(rs.next()){
               ls.add(rs.getString("curso_sigla"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return ls;
    }
    
    public Turma consultar (String sigla) {
        Turma t = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tb_Turma where " +
                                                 "turma_sigla = ?");
            
            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();
            //System.err.print(rs);
            if (rs.next()) {
                t = new Turma (sigla, rs.getString("turma_descricao"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (t);
    }
}
