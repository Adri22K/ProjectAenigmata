package Telas;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

public class Historia2 extends javax.swing.JFrame {

    public Historia2() {
        initComponents();
        
        URL caminhoIcone = getClass().getResource("/IMGsIcon/LOGOTITULO.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jHistoria2 = new javax.swing.JLabel();
        jTopSecret = new javax.swing.JLabel();
        jContinuar = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 787));
        setMinimumSize(new java.awt.Dimension(1280, 787));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 787));
        getContentPane().setLayout(null);

        jHistoria2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/FOLHA_H2.png"))); // NOI18N
        getContentPane().add(jHistoria2);
        jHistoria2.setBounds(540, 20, 570, 710);

        jTopSecret.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/PASTA_TOPSECRET.png"))); // NOI18N
        getContentPane().add(jTopSecret);
        jTopSecret.setBounds(100, 290, 430, 300);

        jContinuar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jContinuar.setForeground(new java.awt.Color(255, 255, 255));
        jContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/BOTAO_CONTINUAR.png"))); // NOI18N
        jContinuar.setText("Continuar...");
        jContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jContinuarMouseClicked(evt);
            }
        });
        getContentPane().add(jContinuar);
        jContinuar.setBounds(1080, 720, 180, 40);

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/ESCOLA_FUNDO_ESCURO.png"))); // NOI18N
        getContentPane().add(jFundo);
        jFundo.setBounds(0, 0, 1280, 787);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jContinuarMouseClicked
        new Biblioteca().setVisible(true);
        dispose();
    }//GEN-LAST:event_jContinuarMouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jContinuar;
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jHistoria2;
    private javax.swing.JLabel jTopSecret;
    // End of variables declaration//GEN-END:variables
}
