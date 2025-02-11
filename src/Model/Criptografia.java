
package Model;


import java.security.MessageDigest;


/**
 *
 * @author williambersagui
 */
public class Criptografia{
    
    public String Codificar (String senha){
        
        
    try{
        
        MessageDigest algoritmo = MessageDigest.getInstance("SHA-256");
        
      
        
        byte[] array_bytes = algoritmo.digest(senha.getBytes());   // Geramos um array contendo a senha 
        
        
        
         StringBuilder hexa = new StringBuilder();
            for (byte b : array_bytes) {
                hexa.append(String.format("%02x", b)); // Vamos converter o array em hexadecimal 
            }
            return hexa.toString();
        
        
    }catch(Exception e){
        
        System.out.println(e);
    }
        return null;
       
       
    
    }
    
    // Vamos criar um método para verificar  a senha dada o hash
    
     public boolean PasswordVerificator(String senhaDigitada, String senhaHashArmazenada) {
   
        String senhaCriptografada = Codificar(senhaDigitada); // Gera a hash da senha digitada
    
        return senhaCriptografada != null && senhaCriptografada.equals(senhaHashArmazenada); // Se senhaCriptografada nao for null retorna a senha armazenada
}
    
    
    
}






