/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexaoBD.ConexaoPostgres;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuário
 */
public abstract class GenericDao<Objeto> {
    
    public Connection conn = null;
    
    public GenericDao(){
        conn = ConexaoPostgres.getConection();
    }
    
    protected abstract Objeto construirObjeto(ResultSet rs); // esse método retorna do BC (apartir dele que vou construir meu objeto)
    
    public abstract boolean salvar(Objeto obj); // vai salvar o registro no banco 
    
    public abstract boolean atualizar(Objeto obj); // vai atualizar o registroi no banco 
    
    public ArrayList<Objeto>  retornaLista(String sql){ 
        // retorna dados
        
        PreparedStatement ps;
        ResultSet rs;   // retorna dados da tabela
        ArrayList<Objeto>lista = new ArrayList<>();
        
        try {
            
        ps = conn.prepareStatement(sql); // criando a conexão (o conn conecta com a tabela)
        rs = ps.executeQuery(); //aqui vai executar
        
        
        while(rs.next()){
            lista.add(construirObjeto(rs));
        }
        
        ps.close(); // fechando a conexão

        } catch (SQLException ex) {
            Logger.getLogger(GenericDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }
    
    public Objeto retornarPeloId(int id, String tabela, String chavePrimaria){
        
        
            PreparedStatement ps;
            ResultSet rs;
            Objeto obj = null;
            
            try {
            
            ps = conn.prepareStatement("SELECT * FROM public.\""+tabela+"\" WHERE "+
                    "\""+chavePrimaria+"\" = ?");
            ps.setInt(1, id); // esse 1 é a ordem do parametro (parametro é a ? passada acima (pode ter mais de um parametro,ai vai serv mais ?) 
            rs = ps.executeQuery(); //executando 
                    
            if(rs.next()){
                obj = construirObjeto(rs);
            }
            
            ps.close(); // fechando a conexão
            
            
            } catch (SQLException ex) {
            Logger.getLogger(GenericDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return obj;
    }
    
    public void delete(int id, String tabela, String chavePrimaria){
        
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement("DELETE FROM "
                    + "public. \""+tabela+"\" WHERE \""+
                    chavePrimaria+"\" = ?");
            
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(GenericDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
