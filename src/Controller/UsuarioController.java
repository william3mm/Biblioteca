/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Livro;
import Model.Usuario;
import View.Tela_Inicial;
import java.awt.List;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author williambersagui
 */
public class UsuarioController {
    
    
public void cadastrar (Livro livro) throws  ClassNotFoundException {
    
    
    Conexao conexao  = new Conexao();
    
    String sql = "INSERT INTO Livro(Titulo, Autor, Genero, Paginas) VALUES (?,?,?,?)";
    
    PreparedStatement ps = null;
    
    
    try{
        
        // Vamos tentar fazer a conexao e passar a instrucao sql
        
        ps = Conexao.conectar().prepareStatement(sql);
        
        // Caso a conexao for bem sucedida vamos passar as instrucoes que devem ser realizadas
        
        ps.setString(1, livro.getTitulo());
        
        ps.setString(2, livro.getAutor());
        
        ps.setString(3, livro.getGenero());
        
        ps.setInt(4, livro.getPaginas());
        

        
        ps.execute();
        
        ps.close();
        
        
    }catch(Exception e){
        
        System.out.println(e);
    }
    
    
}

public void deletar(Livro livro) throws ClassNotFoundException{
    
    String sql = "DELETE FROM Livro WHERE idLivro = ?";
    
    PreparedStatement ps;
    
    
    try{
        
        ps = Conexao.conectar().prepareStatement(sql);
        
        ps.setInt(1, livro.getIdLivro());
        
      ps.execute();
      
      JOptionPane.showMessageDialog(null, "LIVRO DELETADO COM SUCESSO");
       ps.close();
        
    }catch(Exception e){
        
        System.out.println(e);
        
        JOptionPane.showMessageDialog(null, "ERRO AO DELETAR LIVRO");
    }
    
        }


   public void listar() throws ClassNotFoundException{
       
       String sql = "SELECT * FROM Livro";
       
       ResultSet rs;
       
       PreparedStatement ps;
       
      
       
       
       
       try{
           
           ps = Conexao.conectar().prepareStatement(sql);
           
           
           rs = ps.executeQuery();
           
           
           
           while(rs.next()){
               
               Livro livro = new Livro();
               
               
               livro.setIdLivro(rs.getInt("idLivro"));
         
               livro.setTitulo(rs.getString("Titulo"));
               
               livro.setAutor(rs.getString("Autor"));
               
               livro.setGenero(rs.getString("Genero"));
               
               livro.setPaginas(rs.getInt("Paginas"));
               
               System.out.println(livro.getIdLivro());
               System.out.println(livro.getTitulo());
              
               System.out.println(livro.getAutor());
               
               System.out.println(livro.getGenero());
               
               System.out.println(livro.getPaginas());
               
               
           }
           
           rs.close();
           
           
          
           
       }catch(Exception e){
           
           System.out.println(e);
           
           JOptionPane.showMessageDialog(null, "ERRO AO LISTAR LIVROS");
       }
   
   }
   
     public void buscar(Livro livro) throws ClassNotFoundException{
    
         
         PreparedStatement ps;
         
           ResultSet   rs;
         
        
          String valor;
         
         String sql = "SELECT * FROM Livro WHERE idLivro = ?";
         try{
             ps = Conexao.conectar().prepareStatement(sql);
             
             ps.setInt(1, livro.getIdLivro());
             
           rs = ps.executeQuery();
           
           if(rs.next()){
               
               JOptionPane.showMessageDialog(null,"Livro encontrado");
               
             
             livro.setIdLivro(rs.getInt("idLivro"));
             
             // Vamos tentar pegar o nome do livro associado ao idLivro encontrado
             
             livro.setAutor(rs.getString("Autor"));
             
             livro.setGenero(rs.getString("Genero"));
             
             livro.setPaginas(rs.getInt("Paginas"));
               
           }else{
               
              JOptionPane.showMessageDialog(null, "NENHUM LIVRO ENCONTRADO");
           }
             
            
             
             ps.close();
             
             
         }catch(Exception e){
             
             System.out.println(e);
             
             JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR ITEM");
         }
         
           
           
       }
       
       
      public void actualizar(Livro livro) throws ClassNotFoundException{
          
          
          
          PreparedStatement ps;
      
          
          try{
              
              String sql = "UPDATE Livro SET Titulo = ?, Autor = ?, Genero = ?, Paginas = ?  WHERE idLivro = ?";
              
              
              ps = Conexao.conectar().prepareStatement(sql);
              
              ps.setString(1, livro.getTitulo());
              
              ps.setString(2,livro.getAutor());
              
              ps.setString(3, livro.getGenero());
              
              ps.setInt(4, livro.getPaginas());
              
              ps.setInt(5, livro.getIdLivro());
              
              ps.execute();
              
              ps.close();
          }catch(Exception e){
              
              System.out.println(e);
          }
      }
   
     

    
    
}
