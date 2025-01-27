/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.LoginController;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author williambersagui
 */
public class Teste {
    
    public static void main(String args[]){
        
        
        String nome = "a";
        
        String email  = "a";
        
        String senha = "a";
        
        Usuario usuario = new Usuario();
        
        usuario.setNome(nome);
        
        usuario.setEmail(email);
        
        usuario.setSenha(senha);
        
                
        LoginController controller = new LoginController();
        
        try {
            controller.cadastrar(usuario);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
