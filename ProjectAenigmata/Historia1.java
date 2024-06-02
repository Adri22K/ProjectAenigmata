package Telas;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

public class Historia1 extends javax.swing.JFrame {

    int contador = 0;
    
    public Historia1() {
        initComponents();
        this.jProfessor.setVisible(false);
        this.jTextoProfessor.setVisible(false);
        
        URL caminhoIcone = getClass().getResource("/IMGsIcon/LOGOTITULO.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jContinuar = new javax.swing.JLabel();
        jTextoProfessor = new javax.swing.JLabel();
        jProfessor = new javax.swing.JLabel();
        jHistoria1 = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stollde - v 1.0");
        setMaximumSize(new java.awt.Dimension(1280, 787));
        setMinimumSize(new java.awt.Dimension(1280, 787));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 787));
        setResizable(false);
        getContentPane().setLayout(null);

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
        jContinuar.setBounds(1090, 730, 180, 40);

        jTextoProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/TEXTO_PROFESSOR.png"))); // NOI18N
        getContentPane().add(jTextoProfessor);
        jTextoProfessor.setBounds(360, 650, 510, 110);

        jProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/Professor sorrindo muito.png"))); // NOI18N
        getContentPane().add(jProfessor);
        jProfessor.setBounds(-60, 270, 460, 520);

        jHistoria1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/FOLHA_H1.png"))); // NOI18N
        getContentPane().add(jHistoria1);
        jHistoria1.setBounds(560, -40, 560, 820);

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/ESCOLA_FUNDO.png"))); // NOI18N
        getContentPane().add(jFundo);
        jFundo.setBounds(0, 0, 1280, 787);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jContinuarMouseClicked
        contador++;
        if(contador == 1){
            this.jProfessor.setVisible(true);
            this.jTextoProfessor.setVisible(true);
        }else{
            new Historia2().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jContinuarMouseClicked
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jContinuar;
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jHistoria1;
    private javax.swing.JLabel jProfessor;
    private javax.swing.JLabel jTextoProfessor;
    // End of variables declaration//GEN-END:variables
}
