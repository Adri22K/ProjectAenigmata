package Telas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SalaProfessor extends javax.swing.JFrame implements ActionListener{
    
    int contador = 0;
    SenhasPC pass= new SenhasPC();
    javax.swing.Timer timer = new javax.swing.Timer(1000, this);
    int c = 900;
    int limitador = 0;
    
    public SalaProfessor() {
        timer.start();
        initComponents();
        
        URL caminhoIcone = getClass().getResource("/IMGsIcon/LOGOTITULO.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo); 
        
        this.jDicaTexto.setVisible(false);
        this.jVirar.setVisible(false);
        this.jVoltar.setVisible(false);
        this.jLivro1Aberto.setVisible(false);
        this.jProximo.setVisible(false);
        this.jFecharLivro.setVisible(false);
        this.jSenha.setVisible(false);
        this.jContinuar.setVisible(false);
        this.jFundo1.setVisible(false);
        this.jSairPC.setVisible(false);
        this.jLivro1Margem.setVisible(false);
    }
    
    @Override
         public void actionPerformed(ActionEvent e) {
            jCronometro.setText(""+c-- +"s");
            if (c == -1){
                timer.stop();
                JOptionPane.showMessageDialog(null,"SEU TEMPO ACABOU!");
                new Menu().setVisible(true);
                dispose();
                }
            }
    
    
    public void ImageIcon (){
            
          if (this.contador == 0){
                    ImageIcon img = new ImageIcon(getClass().getResource("/IMGsGame/VTM1.png"));
                    
                    this.jProximo.setVisible(true);
                    this.jVirar.setVisible(false);
                    this.jLivro1Aberto.setIcon(img);
                    this.jVoltar.setVisible(false);
                    this.jFecharLivro.setVisible(true);
          }else if(this.contador == 1){
                    ImageIcon img = new ImageIcon(getClass().getResource("/IMGsGame/VTM2.png"));
                    
                    this.jProximo.setVisible(true);
                    this.jVirar.setVisible(false);
                    this.jLivro1Aberto.setIcon(img);
                    this.jVoltar.setVisible(true);
                    this.jFecharLivro.setVisible(true);
          }else if(this.contador == 2){
                    ImageIcon img = new ImageIcon(getClass().getResource("/IMGsGame/VTM3.png"));
                    
                    this.jProximo.setVisible(true);
                    this.jVirar.setVisible(false);
                    this.jLivro1Aberto.setIcon(img);
                    this.jFecharLivro.setVisible(true);
          }else if(this.contador == 3){
                    ImageIcon img = new ImageIcon(getClass().getResource("/IMGsGame/VTM4.png"));
                    
                    this.jProximo.setVisible(true);
                    this.jVirar.setVisible(false);
                    this.jLivro1Aberto.setIcon(img);
                    this.jFecharLivro.setVisible(true);
          }else if(this.contador == 4){
                    ImageIcon img = new ImageIcon(getClass().getResource("/IMGsGame/VTM5.png"));
                    
                    this.jProximo.setVisible(true);
                    this.jVirar.setVisible(false);
                    this.jLivro1Aberto.setIcon(img);
                    this.jFecharLivro.setVisible(true);
          }else if(this.contador == 5){
                    ImageIcon img = new ImageIcon(getClass().getResource("/IMGsGame/VTM6.png"));
                    
                    this.jLivro1Aberto.setIcon(img);
                    this.jVirar.setVisible(true);
                    this.jProximo.setVisible(false);
                    this.jFecharLivro.setVisible(true);
          }else if(this.contador == 6){
                    ImageIcon img = new ImageIcon(getClass().getResource("/IMGsGame/VTMVIRADO.png"));
                    
                    this.jVirar.setVisible(false);
                    this.jLivro1Aberto.setIcon(img);
                    this.jFecharLivro.setVisible(false);
          }
    }

    public void ImageIcon2(){
        if(pass.passagem == 1){
            ImageIcon img = new ImageIcon(getClass().getResource("/IMGsGame/TELASENHA2.png"));
        
            this.jFundo1.setIcon(img);
        }else if(pass.passagem == 2){
            ImageIcon img = new ImageIcon(getClass().getResource("/IMGsGame/TELASENHA3.png"));
            
            this.jFundo1.setIcon(img);
        }else if(pass.passagem == 3){
            ImageIcon img = new ImageIcon(getClass().getResource("/IMGsGame/TELASENHA4.png"));
            
            this.jFundo1.setIcon(img);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFecharLivro = new javax.swing.JLabel();
        jVirar = new javax.swing.JLabel();
        jProximo = new javax.swing.JLabel();
        jVoltar = new javax.swing.JLabel();
        jDica = new javax.swing.JLabel();
        jDicaTexto = new javax.swing.JLabel();
        jLivro1Margem = new javax.swing.JLabel();
        jLivro1 = new javax.swing.JLabel();
        jLivro1Aberto = new javax.swing.JLabel();
        jComputador = new javax.swing.JLabel();
        jSenha = new javax.swing.JTextField();
        jContinuar = new javax.swing.JLabel();
        jSairPC = new javax.swing.JLabel();
        jFundo1 = new javax.swing.JLabel();
        jCronometro = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 787));
        setMinimumSize(new java.awt.Dimension(1280, 787));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 787));
        getContentPane().setLayout(null);

        jFecharLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGerais/FECHAR.png"))); // NOI18N
        jFecharLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jFecharLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFecharLivroMouseClicked(evt);
            }
        });
        getContentPane().add(jFecharLivro);
        jFecharLivro.setBounds(1180, 130, 30, 30);

        jVirar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jVirar.setText("VIRAR LIVRO");
        jVirar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVirarMouseClicked(evt);
            }
        });
        getContentPane().add(jVirar);
        jVirar.setBounds(630, 300, 150, 70);

        jProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGerais/SETA_CONTINUAR.png"))); // NOI18N
        jProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jProximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProximoMouseClicked(evt);
            }
        });
        getContentPane().add(jProximo);
        jProximo.setBounds(1110, 560, 50, 20);

        jVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGerais/SETA_SAIDA.png"))); // NOI18N
        jVoltar.setText("Voltar");
        jVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(jVoltar);
        jVoltar.setBounds(570, 560, 50, 50);

        jDica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/DICA.png"))); // NOI18N
        jDica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDicaMouseExited(evt);
            }
        });
        getContentPane().add(jDica);
        jDica.setBounds(10, 10, 80, 70);

        jDicaTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/DICA_TEXTO2.png"))); // NOI18N
        getContentPane().add(jDicaTexto);
        jDicaTexto.setBounds(60, 0, 500, 110);

        jLivro1Margem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/MARGEM_EMPE.png"))); // NOI18N
        getContentPane().add(jLivro1Margem);
        jLivro1Margem.setBounds(640, 410, 20, 60);

        jLivro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLivro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLivro1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLivro1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLivro1MouseExited(evt);
            }
        });
        getContentPane().add(jLivro1);
        jLivro1.setBounds(640, 410, 20, 60);

        jLivro1Aberto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/VTM1.png"))); // NOI18N
        getContentPane().add(jLivro1Aberto);
        jLivro1Aberto.setBounds(470, 100, 800, 680);

        jComputador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComputador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComputadorMouseClicked(evt);
            }
        });
        getContentPane().add(jComputador);
        jComputador.setBounds(320, 270, 140, 110);
        getContentPane().add(jSenha);
        jSenha.setBounds(140, 480, 240, 20);

        jContinuar.setForeground(new java.awt.Color(51, 255, 51));
        jContinuar.setText("CONTINUAR");
        jContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jContinuarMouseClicked(evt);
            }
        });
        getContentPane().add(jContinuar);
        jContinuar.setBounds(220, 530, 80, 30);

        jSairPC.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jSairPC.setForeground(new java.awt.Color(0, 204, 0));
        jSairPC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSairPC.setText("SAIR");
        jSairPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSairPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSairPCMouseClicked(evt);
            }
        });
        getContentPane().add(jSairPC);
        jSairPC.setBounds(220, 610, 70, 40);

        jFundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/TELASENHA.png"))); // NOI18N
        getContentPane().add(jFundo1);
        jFundo1.setBounds(70, 140, 400, 507);

        jCronometro.setBackground(new java.awt.Color(0, 0, 0));
        jCronometro.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jCronometro.setForeground(new java.awt.Color(0, 204, 0));
        jCronometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCronometro.setText("--------");
        jCronometro.setToolTipText("");
        jCronometro.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jCronometro.setOpaque(true);
        getContentPane().add(jCronometro);
        jCronometro.setBounds(1140, 20, 120, 50);

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/FUNDO_SALA_PROFESSOR.png"))); // NOI18N
        getContentPane().add(jFundo);
        jFundo.setBounds(0, 0, 1280, 787);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jDicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDicaMouseEntered
        this.jDicaTexto.setVisible(true);
    }//GEN-LAST:event_jDicaMouseEntered

    private void jDicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDicaMouseExited
        this.jDicaTexto.setVisible(false);
    }//GEN-LAST:event_jDicaMouseExited

    private void jProximoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProximoMouseClicked
        this.contador++;  
        ImageIcon();
    }//GEN-LAST:event_jProximoMouseClicked

    private void jVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVoltarMouseClicked
        this.contador--;
        ImageIcon();
    }//GEN-LAST:event_jVoltarMouseClicked

    private void jVirarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVirarMouseClicked
        this.contador++;
        ImageIcon();
    }//GEN-LAST:event_jVirarMouseClicked

    private void jLivro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLivro1MouseClicked
        this.jLivro1Aberto.setVisible(true);
        this.jProximo.setVisible(true);
        this.jFecharLivro.setVisible(true);
        if(this.contador >=1 && this.contador <=5){
            this.jVoltar.setVisible(true);
        }
        if(this.contador == 5){
            this.jVirar.setVisible(true);
            this.jProximo.setVisible(false);
        }
        this.limitador = 1;
    }//GEN-LAST:event_jLivro1MouseClicked

    private void jFecharLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFecharLivroMouseClicked
        this.jLivro1Aberto.setVisible(false);
        this.jProximo.setVisible(false);
        this.jVirar.setVisible(false);
        this.jVoltar.setVisible(false);
        this.jFecharLivro.setVisible(false);
        this.limitador = 0;
    }//GEN-LAST:event_jFecharLivroMouseClicked

    private void jComputadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComputadorMouseClicked
        this.jFundo1.setVisible(true);
        this.jSenha.setVisible(true);
        this.jContinuar.setVisible(true);
        this.jSairPC.setVisible(true);
        this.limitador = 1;
    }//GEN-LAST:event_jComputadorMouseClicked

    private void jContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jContinuarMouseClicked
        String sen1 = this.jSenha.getText();
        if(sen1.equalsIgnoreCase(pass.getSenha1())){
            pass.passagem++;
            ImageIcon2();
            this.jSenha.setText("");
        }else if(sen1.equalsIgnoreCase(pass.getSenha2())){
            pass.passagem++;
            ImageIcon2();
            this.jSenha.setText("");
        }else if(sen1.equalsIgnoreCase(pass.getSenha3())){
            pass.passagem++;
            ImageIcon2();
            this.jSenha.setText("");
        }else if(sen1.equalsIgnoreCase(pass.getSenha4())){
            pass.passagem++;
            ImageIcon2();
            this.jSenha.setText("");
            new loadingGif().setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Errado!");
        }

        
    }//GEN-LAST:event_jContinuarMouseClicked

    private void jSairPCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairPCMouseClicked
        this.jSenha.setVisible(false);
        this.jContinuar.setVisible(false);
        this.jFundo1.setVisible(false);
        this.jSairPC.setVisible(false);
        this.limitador = 0;
    }//GEN-LAST:event_jSairPCMouseClicked

    private void jLivro1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLivro1MouseEntered
        if(this.limitador == 0){
        
        }this.jLivro1Margem.setVisible(true);
    }//GEN-LAST:event_jLivro1MouseEntered

    private void jLivro1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLivro1MouseExited
        this.jLivro1Margem.setVisible(false);
    }//GEN-LAST:event_jLivro1MouseExited

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      String sen1 = this.jSenha.getText();
        if(sen1.equalsIgnoreCase(pass.getSenha1())){
            pass.passagem++;
            ImageIcon2();
            this.jSenha.setText("");
        }else if(sen1.equalsIgnoreCase(pass.getSenha2())){
            pass.passagem++;
            ImageIcon2();
            this.jSenha.setText("");
        }else if(sen1.equalsIgnoreCase(pass.getSenha3())){
            pass.passagem++;
            ImageIcon2();
            this.jSenha.setText("");
        }else if(sen1.equalsIgnoreCase(pass.getSenha4())){
            pass.passagem++;
            ImageIcon2();
            this.jSenha.setText("");
            new loadingGif().setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Errado!");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jComputador;
    private javax.swing.JLabel jContinuar;
    private javax.swing.JLabel jCronometro;
    private javax.swing.JLabel jDica;
    private javax.swing.JLabel jDicaTexto;
    private javax.swing.JLabel jFecharLivro;
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jFundo1;
    private javax.swing.JLabel jLivro1;
    private javax.swing.JLabel jLivro1Aberto;
    private javax.swing.JLabel jLivro1Margem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel jProximo;
    private javax.swing.JLabel jSairPC;
    private javax.swing.JTextField jSenha;
    private javax.swing.JLabel jVirar;
    private javax.swing.JLabel jVoltar;
    // End of variables declaration//GEN-END:variables


}
