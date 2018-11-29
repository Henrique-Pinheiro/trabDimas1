package fatec.poo.control;

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
        ArrayList<String> ls = null;
        try{
            ps = conn.prepareStatement("SELECT * FROM tb_Curso");
            ResultSet rs = ps.executeQuery();
            System.out.println(ps);
            while(rs.next()){
                ls.add(rs.getString("curso_sigla"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return ls;
    }
}
