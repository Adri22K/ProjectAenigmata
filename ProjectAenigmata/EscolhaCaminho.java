package Telas;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;

public class EscolhaCaminho extends javax.swing.JFrame {

    int contador = 0;
    
    public EscolhaCaminho() {
        initComponents();
        
        this.jEscolha1.setVisible(false);
        this.jEscolha2.setVisible(false);
        
        URL caminhoIcone = getClass().getResource("/IMGsIcon/LOGOTITULO.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo); 
    }
    
    public void ImageIcon(){
        
        if(contador == 1){
            ImageIcon img = new ImageIcon(getClass().getResource("/IMGsGame/FALAPROFESSOR2.png"));

            this.jFala.setIcon(img);
        }else if(contador == 2){
            this.jFala.setVisible(false);
            this.jContinuar.setVisible(false);
            this.jEscolha1.setVisible(true);
            this.jEscolha2.setVisible(true);
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProfessor = new javax.swing.JLabel();
        jFala = new javax.swing.JLabel();
        jContinuar = new javax.swing.JLabel();
        jEscolha1 = new javax.swing.JLabel();
        jEscolha2 = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 787));
        setMinimumSize(new java.awt.Dimension(1280, 787));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/Professor pistolinha.png"))); // NOI18N
        getContentPane().add(jProfessor);
        jProfessor.setBounds(-60, 270, 460, 520);

        jFala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/FALAPROFESSOR1.png"))); // NOI18N
        getContentPane().add(jFala);
        jFala.setBounds(350, 570, 800, 140);

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

        jEscolha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/ESCOLHA1.png"))); // NOI18N
        jEscolha1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jEscolha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEscolha1MouseClicked(evt);
            }
        });
        getContentPane().add(jEscolha1);
        jEscolha1.setBounds(380, 560, 300, 140);

        jEscolha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/ESCOLHA2.png"))); // NOI18N
        jEscolha2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jEscolha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEscolha2MouseClicked(evt);
            }
        });
        getContentPane().add(jEscolha2);
        jEscolha2.setBounds(720, 560, 300, 140);

        jFundo.setBackground(new java.awt.Color(51, 51, 51));
        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/FUNDO_SALA_PROFESSOR.png"))); // NOI18N
        jFundo.setOpaque(true);
        getContentPane().add(jFundo);
        jFundo.setBounds(0, 0, 1280, 787);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jContinuarMouseClicked
        this.contador++;
        ImageIcon();
    }//GEN-LAST:event_jContinuarMouseClicked

    private void jEscolha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEscolha1MouseClicked
        new Delatou().setVisible(true);
        dispose();
    }//GEN-LAST:event_jEscolha1MouseClicked

    private void jEscolha2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEscolha2MouseClicked
        new Juntou().setVisible(true);
        dispose();
    }//GEN-LAST:event_jEscolha2MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jContinuar;
    private javax.swing.JLabel jEscolha1;
    private javax.swing.JLabel jEscolha2;
    private javax.swing.JLabel jFala;
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jProfessor;
    // End of variables declaration//GEN-END:variables
}
