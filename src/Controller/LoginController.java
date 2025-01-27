/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Usuario;

import java.sql.PreparedStatement;

/**
 *
 * @author williambersagui
 */
public class LoginController {
    
    
    public void cadastrar(Usuario usuario) throws ClassNotFoundException{
        
        
        PreparedStatement ps = null;
        
        Conexao conexao = new Conexao();
        
        try{
            
            
            String sql = "INSERT INTO Usuario(Nome,Email,Senha) VALUES (?,?,?)";
            ps = Conexao.conectar().prepareStatement(sql);
            
            ps.setString(1, usuario.getNome());
            
            ps.setString(2, usuario.getEmail());
            
            ps.setString(3, usuario.getSenha());
            
            ps.execute();
            
            ps.close();
            
            
        }catch( Exception e){
            
            System.out.println(e);
        }
        
        
        
        
    }
}
