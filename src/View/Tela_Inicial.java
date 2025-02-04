/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.Conexao;
import Controller.UsuarioController;
import Model.Livro;

import java.sql.PreparedStatement;

import java.lang.Integer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSet;

/**
 *
 * @author williambersagui
 */
public class Tela_Inicial extends javax.swing.JFrame {

   private  Livro livro = new Livro();
    
   private UsuarioController controller = new UsuarioController();
   
   private Conexao conexao = new Conexao();
    
    private PreparedStatement ps = null;
    
    private String titulo;
    
    private String autor;
    
    private String genero;
    
    private int paginas;
    
  
    

    
   private ResultSet rs = null;
    
    
    /**
     * Creates new form Tela_Inicial
     */
    public Tela_Inicial() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ver_tabela = new javax.swing.JTable();
        btn_filtrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_limpar_tabela = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_autor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_genero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_paginas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_tabela = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        id_livro = new javax.swing.JTextField();
        btn_limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton4.setText("Listar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ver_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idLivro", "Titulo", "Autor", "Genero", "Paginas"
            }
        ));
        jScrollPane2.setViewportView(ver_tabela);

        btn_filtrar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_filtrar.setText("Filtrar");
        btn_filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setText("Buscar por ID");

        txt_id.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        btn_limpar_tabela.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_limpar_tabela.setText("Limpar");
        btn_limpar_tabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpar_tabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_filtrar, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(btn_limpar_tabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton4)
                        .addGap(51, 51, 51)
                        .addComponent(btn_filtrar)
                        .addGap(38, 38, 38)
                        .addComponent(btn_limpar_tabela)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Visualizar", jPanel2);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setText("Título");

        txt_titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Autor");

        txt_autor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Genero");

        txt_genero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setText("Paginas");

        txt_paginas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton3.setText("Deletar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tb_tabela.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        tb_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Autor", "Genero", "Paginas"
            }
        ));
        jScrollPane1.setViewportView(tb_tabela);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setText("ID do Livro");

        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(226, 226, 226))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 458, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(212, 212, 212))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_genero, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(txt_titulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_autor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_paginas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_livro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(44, 44, 44)
                                .addComponent(jButton2)
                                .addGap(38, 38, 38)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btn_limpar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(46, 46, 46)
                        .addComponent(btn_limpar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );

        jTabbedPane1.addTab("Principal", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        try{

            Deletar();

        }catch(Exception e){

            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try{
            
            Actualizar();
        }catch(Exception e){
            
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        // Aqui vamos tentar executar o codigo para cadastrar um livro da base de dados

        try{

            Cadastrar();

        }catch(Exception e){

            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        try{
            Listar();
        
        }catch(Exception e){
            
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtrarActionPerformed
        // TODO add your handling code here:
        
        
        int idLivro= Integer.parseInt(txt_id.getText());
        
        Livro livro = new Livro();
        
        try{
            
            
            livro.setIdLivro(idLivro);
            controller.buscar(livro);
            
           
            
            System.out.println(livro.getIdLivro());
            
            System.out.println(livro.getAutor());
            
            Object [] dados = { livro.getIdLivro(), livro.getTitulo(), livro.getAutor(), livro.getGenero(), livro.getPaginas()};
            
            DefaultTableModel tabela = (DefaultTableModel) ver_tabela.getModel();
            
            tabela.addRow(dados);
            
            
            
        } catch(Exception e){
            
            System.out.println(e);
            
        }
        
        
    }//GEN-LAST:event_btn_filtrarActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        // TODO add your handling code here:
        
        try{
            
            Limpar();
            
        }catch(Exception e){
            
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_limpar_tabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpar_tabelaActionPerformed
        // TODO add your handling code here:
        
     
    }//GEN-LAST:event_btn_limpar_tabelaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicial().setVisible(true);
            }
        });
    }
    
    
   @SuppressWarnings("empty-statement")
    public void Preencher(){
        
        // Vamos criar um metodo que vai preencher a tabela
        
        DefaultTableModel tabela = (DefaultTableModel) tb_tabela.getModel();
        
     String nome = "William";
     
   Object[] dados = {txt_titulo.getText(), txt_autor.getText(), txt_genero.getText(), txt_paginas.getText()};
       
     
     
   for(int i=0; i< tabela.getRowCount(); i++){
        tabela.addRow(dados);
       
   }
   
        
        
        
    }
    void Cadastrar(){
        
        // Vamos ter que converter paginas para String para poder realizar a condicao
        
        titulo = txt_titulo.getText();
        
        autor = txt_autor.getText();
        
        genero = txt_genero.getText();
        
        paginas = Integer.parseInt(txt_paginas.getText());
       
        // Convertemos o campo int para String pois ele não possui métodos
        
        String paginas_to_String = Integer.toString(paginas);
       
        if(titulo.isEmpty() || autor.isEmpty() || genero.isEmpty() || paginas_to_String.isEmpty()){
        
             
        JOptionPane.showMessageDialog(null, "OS CAMPOS NAO PODEM ESTAR VAZIOS");
            
            
        } else{
            
            
            // Vamos checar primeiro se o titulo já havia sido salvo
            
            try{
                 String sql = "SELECT * FROM Livro WHERE Titulo = ?";
            
            ps = Conexao.conectar().prepareStatement(sql);
            
            ps.setString(1, titulo);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                
                JOptionPane.showMessageDialog(null, "TÍTULO JÁ REGISTRADO");
            
            }else{
                
                  livro.setTitulo(titulo);
            
            livro.setAutor(autor);
            
            livro.setGenero(genero);
            
            livro.setPaginas(paginas);

// Vamos chamar o usuariocontroller para tentar cadastrar o livro com os valores passados

                controller.cadastrar(livro);
 
                Preencher();
                
                JOptionPane.showMessageDialog(null, "LIVRO REGISTRADO COM SUCESSO");
            }
          
            
                
                
            }catch(Exception e){
                
                System.out.println(e);
            }
           
           
        }
              
       
    }
    
     void Deletar(){
        
        int  id = Integer.parseInt(id_livro.getText());
       
        
        try{
            livro.setIdLivro(id);
          
            
            
            controller.deletar(livro);
            
        
            
        }catch(Exception e){
            
            System.out.println(e);
            
        
        }
    }
    
    void Listar(){
        
       String sql = "SELECT * FROM Livro";
       
       ResultSet rs;
       
       PreparedStatement ps;
  
       try{
           
           ps = Conexao.conectar().prepareStatement(sql);
           
           
           rs = ps.executeQuery();
           
           
           
           while(rs.next()){
               
               Livro livro = new Livro();
               
               
               // Depois de executar a query podemos pegar os valores das colunas
               livro.setIdLivro(rs.getInt("idLivro")); 
         
               livro.setTitulo(rs.getString("Titulo"));
               
               livro.setAutor(rs.getString("Autor"));
               
               livro.setGenero(rs.getString("Genero"));
               
               livro.setPaginas(rs.getInt("Paginas"));
              
               int id = livro.getIdLivro();
               
               titulo = livro.getTitulo();
               
               autor = livro.getAutor();
               
               genero = livro.getGenero();
               
               paginas = livro.getPaginas();
               
               
               
               
               Object[] dados = {id, titulo, autor, genero, paginas};
               
               DefaultTableModel tabela = (DefaultTableModel) ver_tabela.getModel();
              
               tabela.addRow(dados);
        
               
           }
           
           rs.close();
           
           
          
           
       }catch(Exception e){
           
           System.out.println(e);
           
           JOptionPane.showMessageDialog(null, "ERRO AO LISTAR LIVROS");
       }
       
    }
    
    private void Actualizar(){
        
        titulo = txt_titulo.getText();
        
        autor = txt_autor.getText();
        
        genero = txt_genero.getText();
        
        System.out.println("O titulo:" + " "  + titulo);
        
        paginas = Integer.parseInt(txt_paginas.getText());
        
        int idLivro = Integer.parseInt(id_livro.getText());
        
         String paginas_to_String = Integer.toString(paginas);
         
         String id_Livro_to_String = Integer.toString(idLivro);
        
         
        
        if(titulo.isEmpty() || genero.isEmpty() || autor.isEmpty() || txt_paginas.getText().isEmpty()){
            
          
            JOptionPane.showMessageDialog(null, "OS CAMPOS NAO PODEM ESTAR VAZIOS");
        
        }else{
            
          try{
                 
            
            livro.setIdLivro(idLivro);
            
            livro.setTitulo(titulo);
            
            livro.setAutor(autor);
            
            livro.setGenero(genero);
            
            livro.setPaginas(paginas);
            
            controller.actualizar(livro);
            JOptionPane.showMessageDialog(null, "LIVRO ACTUALIZADO COM SUCESSO");
            
            // Vamos tentar colocar os dados actualizados na tabela
            
            DefaultTableModel tabela = (DefaultTableModel) tb_tabela.getModel();
            
            Object [] dados = { titulo, autor, genero, paginas};
            
            tabela.addRow(dados);
           
            
            
        }catch(Exception e){
            
            System.out.println(e);
            
            JOptionPane.showMessageDialog(null, "ERRO AO ACTUALIZAR LIVRO");
            
            
            
        }
            
            
        }
       
    }
    
    void Limpar(){
        
        
        txt_titulo.setText(" ");
        
        txt_autor.setText(" ");
        
        txt_genero.setText(" ");
        
        txt_paginas.setText(" ");
        
       id_livro.setText( " ");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_filtrar;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_limpar_tabela;
    private javax.swing.JTextField id_livro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tb_tabela;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_genero;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_paginas;
    private javax.swing.JTextField txt_titulo;
    private javax.swing.JTable ver_tabela;
    // End of variables declaration//GEN-END:variables
}
