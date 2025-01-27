/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Livro;

import java.sql.PreparedStatement;
/**
 *
 * @author williambersagui
 */
public class UsuarioController {
    
    
public void cadastrar (Livro livro) throws  ClassNotFoundException {
    
    
    Conexao conexao  = new Conexao();
    
    String sql = "INSERT INTO Livro(Titulo, Autor, Genero, Paginas,Lido) VALUES (?,?,?,?,?)";
    
    PreparedStatement ps = null;
    
    
    try{
        
        // Vamos tentar fazer a conexao e passar a instrucao sql
        
        ps = Conexao.conectar().prepareStatement(sql);
        
        // Caso a conexao for bem sucedida vamos passar as instrucoes que devem ser realizadas
        
        ps.setString(1, livro.getTitulo());
        
        ps.setString(2, livro.getAutor());
        
        ps.setString(3, livro.getGenero());
        
        ps.setInt(4, livro.getPaginas());
        
        ps.setBoolean(5, livro.getLido());
        
        ps.execute();
        
        ps.close();
        
        
    }catch(Exception e){
        
        System.out.println(e);
    }
    
    
}
    
    
}
