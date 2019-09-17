/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import exceptions.ConexaoException;
import exceptions.DAOException;
import util.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelo.Valor;

/**
 *
 * @author robso
 */
public class ValorDao {
   public ValorDao()
    {
    
    }
    
    public boolean inserir(Valor valores)throws ConexaoException, DAOException
    {
        String sql = "INSERT INTO valor(id,valor,titulo,etiqueta,observacao) VALUES(?,?,?,?,?)";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            pst.setInt(1, valores.getId());
            pst.setDouble(2, valores.getValor());
            pst.setString(3, valores.getTitulo());
            pst.setString(4, valores.getEtiqueta());
            pst.setString(5, valores.getObservacao());
            
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
            
            
        } catch (Exception e) {
            Logger.getLogger(ValorDao.class.getName()).log(Level.SEVERE, null, e);
            retorno = false;
        }
        
        return retorno;
    
    }
    public boolean atualizar(Valor valores) throws ConexaoException, DAOException
  
    {
        String sql = "UPDATE valor set  valor=?,titulo=?,etiqueta=?,observacao=? where id=?";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
          
            pst.setDouble(1, valores.getValor());
            pst.setString(2, valores.getTitulo());
            pst.setString(3, valores.getEtiqueta());
            pst.setString(4, valores.getObservacao());
            pst.setInt(5, valores.getId());
          
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
            
            
        } catch (Exception e) {
            Logger.getLogger(ValorDao.class.getName()).log(Level.SEVERE, null, e);
            retorno = false;
        }
        
        return retorno;
    
    }
    public boolean excluir(Integer id) throws ConexaoException, DAOException
    {
        String sql = "DELETE FROM valor where id=?";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
          
           
            pst.setInt(1, id);
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
            
            
        } catch (Exception e) {
            Logger.getLogger(ValorDao.class.getName()).log(Level.SEVERE, null, e);
            retorno = false;
        }
        
        return retorno;
    
    }
    
    public List<Valor> listar() throws ConexaoException, DAOException
    {
         String sql = "SELECT * FROM valor";
        List<Valor> retorno = new ArrayList<Valor>();
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
           
            
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
               Valor item = new Valor();
               item.setId(res.getInt("id"));
                item.setValor(res.getDouble("valor"));
                item.setTitulo(res.getString("titulo"));
                item.setEtiqueta(res.getString("etiqueta"));
                item.setObservacao(res.getString("observacao"));
                
                retorno.add(item);
            }
               
            
            
        } catch (Exception e) {
            Logger.getLogger(ValorDao.class.getName()).log(Level.SEVERE, null, e);
            
        }
        
        return retorno;
    
    
    }
    public Valor buscar(Integer id) throws ConexaoException, DAOException
    {
         String sql = "SELECT * FROM valor where id=?";
        Valor retorno = null;
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
           
            pst.setInt(1, id);
            ResultSet res = pst.executeQuery();
            
            if(res.next())
            {
                retorno = new Valor();
                retorno.setId(res.getInt("id"));
                retorno.setValor(res.getDouble("valor"));
                retorno.setTitulo(res.getString("titulo"));
                retorno.setEtiqueta(res.getString("etiqueta"));
                retorno.setObservacao(res.getString("observacao"));
                
                
            }
               
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ValorDao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
    
    
    }


}
   

