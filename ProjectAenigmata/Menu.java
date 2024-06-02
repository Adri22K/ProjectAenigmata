package Telas;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.net.URL;
import javazoom.jl.player.Player;


public class Menu extends javax.swing.JFrame {

    
    
   
    public Menu() {

        Som.play("Start-game.wav");
        initComponents();
        
        
        URL caminhoIcone = getClass().getResource("/IMGsIcon/LOGOTITULO.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
        
        
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jIniciar = new javax.swing.JLabel();
        jScore = new javax.swing.JLabel();
        jCreditos = new javax.swing.JLabel();
        jSair = new javax.swing.JLabel();
        jNomeJogo = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stollde - v 1.0");
        setMaximumSize(new java.awt.Dimension(1280, 787));
        setMinimumSize(new java.awt.Dimension(1280, 787));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 787));
        setResizable(false);
        getContentPane().setLayout(null);

        jIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsMenu/BOTAOINICIAR.png"))); // NOI18N
        jIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIniciarMouseClicked(evt);
            }
        });
        getContentPane().add(jIniciar);
        jIniciar.setBounds(310, 230, 160, 70);

        jScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsMenu/BOTAOSCORE.png"))); // NOI18N
        jScore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScoreMouseClicked(evt);
            }
        });
        getContentPane().add(jScore);
        jScore.setBounds(1000, 610, 160, 70);

        jCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsMenu/BOTAOCREDITOS.png"))); // NOI18N
        jCreditos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCreditosMouseClicked(evt);
            }
        });
        getContentPane().add(jCreditos);
        jCreditos.setBounds(1010, 220, 160, 70);

        jSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsMenu/BOTAOSAIR.png"))); // NOI18N
        jSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSairMouseClicked(evt);
            }
        });
        getContentPane().add(jSair);
        jSair.setBounds(290, 620, 160, 70);

        jNomeJogo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jNomeJogo.setForeground(new java.awt.Color(204, 204, 204));
        jNomeJogo.setText("ænigmata");
        getContentPane().add(jNomeJogo);
        jNomeJogo.setBounds(540, 30, 210, 50);

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsMenu/MENU.png"))); // NOI18N
        getContentPane().add(jFundo);
        jFundo.setBounds(0, 0, 1280, 787);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseClicked
        SairCondicao saircondicao = SairCondicao.getInstancia();
        saircondicao.setVisible(true);
    }//GEN-LAST:event_jSairMouseClicked

    private void jCreditosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCreditosMouseClicked
        Creditos creditos = Creditos.getInstancia();
        creditos.setVisible(true);
    }//GEN-LAST:event_jCreditosMouseClicked

    private void jScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScoreMouseClicked
        Score score = Score.getInstancia();
        score.setVisible(true);
    }//GEN-LAST:event_jScoreMouseClicked

    private void jIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIniciarMouseClicked
        Som.stop();
        new loadingInicio().setVisible(true);
        dispose();
    }//GEN-LAST:event_jIniciarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCreditos;
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jIniciar;
    private javax.swing.JLabel jNomeJogo;
    private javax.swing.JLabel jSair;
    private javax.swing.JLabel jScore;
    // End of variables declaration//GEN-END:variables
}
