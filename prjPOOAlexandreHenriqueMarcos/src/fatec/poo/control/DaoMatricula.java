/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 0030481713030
 */
public class DaoMatricula {
        
        private Connection conn;

        public DaoMatricula(Connection conn) {
            this.conn = conn;
        }
        
        public Object retornaAtibutoTurma (String sigla, String atributo) {
        PreparedStatement ps = null;
        Object objAtributo = null;
        try {
            ps = conn.prepareStatement("SELECT " + atributo + " from tb_Turma where " +
                                                 "turma_sigla = ?");
            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                if (atributo.equals("turma_qtd_vagas")){
                    objAtributo = rs.getInt(atributo);
                }else{
                    objAtributo = rs.getString(atributo);
                }
                
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return objAtributo;
    }
    
    public Object retornaAtibutoCurso (String sigla, String atributo) {
        PreparedStatement ps = null;
        Object objAtributo = null;
        try {
            ps = conn.prepareStatement("SELECT " + atributo + " from tb_Curso where " +
                                                 "curso_sigla = ?");
            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                    objAtributo = rs.getString(atributo);
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return objAtributo;
    }
    
        public Object retornaAtibutoAluno (String CPF, String atributo) {
        PreparedStatement ps = null;
        Object objAtributo = null;
        try {
            ps = conn.prepareStatement("SELECT " + atributo + " FROM tb_Aluno where " +
                                                 "aluno_cpf = ?");
            ps.setString(1, CPF);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                    objAtributo = rs.getString(atributo);
            }else{
                System.err.print("Erro AQui");
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return objAtributo;
    }
}
