/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Card;
import util.Conexao;

/**
 *
 * @author robso
 */
public class CardDao {
   public CardDao()
    {
    
    }
    
    public boolean inserir(Card cards)
    {
        String sql = "INSERT INTO card(etiqueta,titulo,modelo) VALUES(?,?,?)";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
           
            pst.setString(1, cards.getEtiqueta());
            pst.setString(2, cards.getTitulo());
            pst.setInt(3, cards.getModelo());
            
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CardDao.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    
    }
    public boolean atualizar(Card cards)
    {
        String sql = "UPDATE card set etiqueta=?,titulo=?,modelo=? where id_card=?";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
 
            pst.setString(1, cards.getEtiqueta());
            pst.setString(2, cards.getTitulo());
            pst.setInt(3, cards.getModelo());
            pst.setInt(4, cards.getId());
            
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CardDao.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    
    }
    public boolean excluir(Card cards)
    {
        String sql = "DELETE FROM card where id_card=?";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
          
           
            pst.setInt(1, cards.getId());
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CardDao.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    
    }
    
    public List<Card> listar()
    {
         String sql = "SELECT * FROM card";
        List<Card> retorno = new ArrayList<Card>();
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
           
            
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
               Card item = new Card();
                item.setEtiqueta(res.getString("etiqueta"));
                item.setTitulo(res.getString("titulo"));
                item.setModelo(res.getInt("modelo"));
               
                
                retorno.add(item);
            }
               
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CardDao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
    
    
    }
    public Card buscar(Card cards)
    {
         String sql = "SELECT * FROM card where id_card=?";
        Card retorno = null;
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
           
            pst.setInt(1, cards.getId());
            ResultSet res = pst.executeQuery();
            
            if(res.next())
            {
                retorno = new Card();
                retorno.setEtiqueta(res.getString("etiqueta"));
                retorno.setTitulo(res.getString("titulo"));
                retorno.setModelo(res.getInt("modelo"));
              
                
                
            }
               
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CardDao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
    
    
    }

   
}
