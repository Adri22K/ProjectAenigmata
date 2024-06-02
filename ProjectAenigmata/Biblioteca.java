package Telas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JOptionPane;

public class Biblioteca extends javax.swing.JFrame implements ActionListener{

        Tranca tranc = new Tranca();
        javax.swing.Timer timer = new javax.swing.Timer(1000, this);
        int c = 420;
        int limitador = 0;
        
    public Biblioteca() {
        timer.start();
        initComponents();
        
        //DICA
        this.jDicaTexto.setVisible(false);
        
        //LIVRO EASTER EGG
        this.jLivroEasteregg.setVisible(false);
        this.jSairEaster.setVisible(false);
        
        
        //LIVRO SENHA
        this.jLivroSenha.setVisible(false);
        this.jSairLS.setVisible(false);
        
        //TRANCA
        this.jSenha.setVisible(false);
        this.jEnviar.setVisible(false);
        this.jFundo1.setVisible(false);
        this.jSairTranc.setVisible(false);
        
        this.jEasterMargem.setVisible(false);
        this.jLivroMargem.setVisible(false);
        
        //icone
        URL caminhoIcone = getClass().getResource("/IMGsIcon/LOGOTITULO.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
        
        
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
    
         



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSairTranc = new javax.swing.JLabel();
        jSenha = new javax.swing.JPasswordField();
        jEnviar = new javax.swing.JLabel();
        jFundo1 = new javax.swing.JLabel();
        jSairLS = new javax.swing.JLabel();
        jLivroSenha = new javax.swing.JLabel();
        jSairEaster = new javax.swing.JLabel();
        jLivroEasteregg = new javax.swing.JLabel();
        jTranca = new javax.swing.JLabel();
        jDica = new javax.swing.JLabel();
        jDicaTexto = new javax.swing.JLabel();
        jCronometro = new javax.swing.JLabel();
        jEasterMargem = new javax.swing.JLabel();
        jEasterEgg = new javax.swing.JLabel();
        jLivroMargem = new javax.swing.JLabel();
        jLivro = new javax.swing.JLabel();
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
        setResizable(false);
        getContentPane().setLayout(null);

        jSairTranc.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jSairTranc.setForeground(new java.awt.Color(0, 204, 0));
        jSairTranc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSairTranc.setText("SAIR");
        jSairTranc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSairTranc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSairTrancMouseClicked(evt);
            }
        });
        getContentPane().add(jSairTranc);
        jSairTranc.setBounds(590, 490, 80, 30);

        jSenha.setBackground(new java.awt.Color(102, 102, 102));
        jSenha.setForeground(new java.awt.Color(0, 255, 0));
        jSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 0)));
        getContentPane().add(jSenha);
        jSenha.setBounds(580, 300, 100, 16);

        jEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEnviarMouseClicked(evt);
            }
        });
        getContentPane().add(jEnviar);
        jEnviar.setBounds(590, 340, 80, 50);

        jFundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/FUNDO_TRANCA.png"))); // NOI18N
        getContentPane().add(jFundo1);
        jFundo1.setBounds(530, 230, 200, 300);

        jSairLS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSairLS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSairLSMouseClicked(evt);
            }
        });
        getContentPane().add(jSairLS);
        jSairLS.setBounds(870, 210, 40, 30);

        jLivroSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/LIVRO_SENHA.png"))); // NOI18N
        getContentPane().add(jLivroSenha);
        jLivroSenha.setBounds(320, 200, 620, 440);

        jSairEaster.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSairEaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSairEasterMouseClicked(evt);
            }
        });
        getContentPane().add(jSairEaster);
        jSairEaster.setBounds(770, 230, 40, 50);

        jLivroEasteregg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/LIVRO_EASTEREGG.png"))); // NOI18N
        jLivroEasteregg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLivroEastereggMouseClicked(evt);
            }
        });
        getContentPane().add(jLivroEasteregg);
        jLivroEasteregg.setBounds(370, 180, 460, 440);

        jTranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/TRANCA.png"))); // NOI18N
        jTranca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTranca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTrancaMouseClicked(evt);
            }
        });
        getContentPane().add(jTranca);
        jTranca.setBounds(590, 330, 40, 60);

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

        jDicaTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/DICA_TEXTO.png"))); // NOI18N
        getContentPane().add(jDicaTexto);
        jDicaTexto.setBounds(60, 0, 500, 110);

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

        jEasterMargem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/MARGEM_DEITADA.png"))); // NOI18N
        getContentPane().add(jEasterMargem);
        jEasterMargem.setBounds(150, 590, 70, 20);

        jEasterEgg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jEasterEgg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEasterEggMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jEasterEggMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jEasterEggMouseExited(evt);
            }
        });
        getContentPane().add(jEasterEgg);
        jEasterEgg.setBounds(151, 590, 70, 20);

        jLivroMargem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/MARGEM_EMPE.png"))); // NOI18N
        getContentPane().add(jLivroMargem);
        jLivroMargem.setBounds(980, 330, 20, 60);

        jLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLivroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLivroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLivroMouseExited(evt);
            }
        });
        getContentPane().add(jLivro);
        jLivro.setBounds(980, 330, 20, 60);

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/BIBLIOTECA.png"))); // NOI18N
        getContentPane().add(jFundo);
        jFundo.setBounds(0, 0, 1280, 787);

        jMenuBar1.setMaximumSize(new java.awt.Dimension(1, 1));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(1, 1));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(1, 1));

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

    private void jTrancaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTrancaMouseClicked
        this.jFundo1.setVisible(true);
        this.jSenha.setVisible(true);
        this.jEnviar.setVisible(true);
        this.jSairTranc.setVisible(true);
        this.limitador = 1;
    }//GEN-LAST:event_jTrancaMouseClicked

    private void jLivroEastereggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLivroEastereggMouseClicked
      
    }//GEN-LAST:event_jLivroEastereggMouseClicked

    private void jSairEasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairEasterMouseClicked
        this.jLivroEasteregg.setVisible(false);
        this.jSairEaster.setVisible(false);
        this.limitador = 0;
    }//GEN-LAST:event_jSairEasterMouseClicked

    private void jSairLSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairLSMouseClicked
        this.jLivroSenha.setVisible(false);
        this.jSairLS.setVisible(false);
        this.limitador = 0;
    }//GEN-LAST:event_jSairLSMouseClicked

    private void jEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEnviarMouseClicked
        tranc.setSenhaV(this.jSenha.getText());
        if(tranc.getSenhaV().equalsIgnoreCase(tranc.getSenha())){
            new SalaProfessor().setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"ERRADO, TENTE NOVAMENTE");
            this.jSenha.setText("");
        }
    }//GEN-LAST:event_jEnviarMouseClicked

    private void jSairTrancMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairTrancMouseClicked
        this.jSenha.setVisible(false);
        this.jEnviar.setVisible(false);
        this.jFundo1.setVisible(false);
        this.jSairTranc.setVisible(false);
        this.jSenha.setText("");
        this.limitador = 0;
    }//GEN-LAST:event_jSairTrancMouseClicked

    private void jEasterEggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEasterEggMouseClicked
        this.jLivroEasteregg.setVisible(true);
        this.jSairEaster.setVisible(true);
        this.limitador = 1;
    }//GEN-LAST:event_jEasterEggMouseClicked

    private void jLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLivroMouseClicked
        this.jLivroSenha.setVisible(true);
        this.jSairLS.setVisible(true);
        this.limitador = 1;
    }//GEN-LAST:event_jLivroMouseClicked

    private void jEasterEggMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEasterEggMouseEntered
        if(this.limitador == 0){
            this.jEasterMargem.setVisible(true);
        }
    }//GEN-LAST:event_jEasterEggMouseEntered

    private void jEasterEggMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEasterEggMouseExited
        this.jEasterMargem.setVisible(false);
    }//GEN-LAST:event_jEasterEggMouseExited

    private void jLivroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLivroMouseEntered
        if(this.limitador == 0){
            this.jLivroMargem.setVisible(true);
        }
    }//GEN-LAST:event_jLivroMouseEntered

    private void jLivroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLivroMouseExited
        this.jLivroMargem.setVisible(false);
    }//GEN-LAST:event_jLivroMouseExited

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        tranc.setSenhaV(this.jSenha.getText());
        if(tranc.getSenhaV().equalsIgnoreCase(tranc.getSenha())){
            new SalaProfessor().setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"ERRADO, TENTE NOVAMENTE");
            this.jSenha.setText("");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCronometro;
    private javax.swing.JLabel jDica;
    private javax.swing.JLabel jDicaTexto;
    private javax.swing.JLabel jEasterEgg;
    private javax.swing.JLabel jEasterMargem;
    private javax.swing.JLabel jEnviar;
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jFundo1;
    private javax.swing.JLabel jLivro;
    private javax.swing.JLabel jLivroEasteregg;
    private javax.swing.JLabel jLivroMargem;
    private javax.swing.JLabel jLivroSenha;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel jSairEaster;
    private javax.swing.JLabel jSairLS;
    private javax.swing.JLabel jSairTranc;
    private javax.swing.JPasswordField jSenha;
    private javax.swing.JLabel jTranca;
    // End of variables declaration//GEN-END:variables



   
}
