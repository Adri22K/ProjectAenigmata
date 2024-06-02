package Telas;

import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.net.URL;
import javax.swing.JOptionPane;

public class loadingGif extends javax.swing.JFrame {

    public loadingGif() {
        initComponents();
        
        URL caminhoIcone = getClass().getResource("/IMGsIcon/LOGOTITULO.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo); 
        
        new Thread (){
            public void run(){
                for (int i=0; i<=100; i ++){
                    try {
                        
                        sleep (50);
                        progress.setValue(i);
                        
                        if (progress.getValue()==100) {                                                                         
                            new EscolhaCaminho().setVisible(true);
                            dispose();
                        }
                }catch(InterruptedException ex){
                                JOptionPane.showMessageDialog(null,"Erro no carregamento");
                                }
            }
            
        }

    }.start();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFundo = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 770));
        setMinimumSize(new java.awt.Dimension(1280, 770));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 770));
        setResizable(false);
        getContentPane().setLayout(null);

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsSplash/loadingGif.gif"))); // NOI18N
        jFundo.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jFundo.setMaximumSize(new java.awt.Dimension(1280, 787));
        jFundo.setMinimumSize(new java.awt.Dimension(1280, 787));
        jFundo.setPreferredSize(new java.awt.Dimension(1280, 787));
        getContentPane().add(jFundo);
        jFundo.setBounds(0, 0, 1280, 770);
        getContentPane().add(progress);
        progress.setBounds(40, 700, 146, 12);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jFundo;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
