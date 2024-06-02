package Telas;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

public class CreditosFinais extends javax.swing.JFrame {

     public CreditosFinais() {
       
         Som.play("Start-game.wav");
         initComponents();
        
        URL caminhoIcone = getClass().getResource("/IMGsIcon/LOGOTITULO.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo); 
        
        new Thread(){
            public void run(){
                int x = jCreditos.getLocation().x;
                int y = 800;
                
                while(true){
                y--;
                if (y < -600){
                    y = 800;
                }
                jCreditos.setLocation(x, y);
                    try{
                        sleep(10);
                    }catch (Exception e){
                    }
                }
            }
        }.start();
    }
     
     

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCreditos = new javax.swing.JLabel();
        jContinuar = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 787));
        setMinimumSize(new java.awt.Dimension(1280, 787));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 787));
        setResizable(false);
        getContentPane().setLayout(null);

        jCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/CREDITOSFINAIS.png"))); // NOI18N
        jCreditos.setToolTipText("");
        jCreditos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jCreditos);
        jCreditos.setBounds(420, 0, 440, 790);

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

        jFundo.setBackground(new java.awt.Color(0, 0, 0));
        jFundo.setMaximumSize(new java.awt.Dimension(1280, 787));
        jFundo.setMinimumSize(new java.awt.Dimension(1280, 787));
        jFundo.setOpaque(true);
        jFundo.setPreferredSize(new java.awt.Dimension(1280, 787));
        getContentPane().add(jFundo);
        jFundo.setBounds(0, 0, 1280, 787);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jContinuarMouseClicked
        new ColetaDados().setVisible(true);
        dispose();
        Som.stop();
    }//GEN-LAST:event_jContinuarMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jContinuar;
    private javax.swing.JLabel jCreditos;
    private javax.swing.JLabel jFundo;
    // End of variables declaration//GEN-END:variables
}
