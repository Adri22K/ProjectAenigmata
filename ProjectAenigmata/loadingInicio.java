package Telas;

import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class loadingInicio extends javax.swing.JFrame {

    public loadingInicio() {
        
        URL caminhoIcone = getClass().getResource("/IMGsIcon/LOGOTITULO.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);

        //cor da barra de progresso 
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loadingInicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(loadingInicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(loadingInicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(loadingInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        initComponents();
        
        
        //barra de progresso + texto alterado 
        new Thread (){
            public void run(){
                for (int i=0; i<=100; i ++){
                    try {
                        
                        sleep (100);
                        progress.setValue(i);
                        
                        if (progress.getValue()<=1) {
                            condicao.setText("Iniciando...");
                        }else if (progress.getValue()==10) {
                            condicao.setText("Iniciando.");
                        } else if (progress.getValue()==20) {
                            condicao.setText("Iniciando..");
                        }else if (progress.getValue()==33) {
                            condicao.setText("Pense antes de responder...");
                        } else if (progress.getValue()==40) {
                            condicao.setText("Pense antes de responder.");
                        } else if (progress.getValue()==50) {
                            condicao.setText("Pense antes de responder..");
                        } 
                        else if (progress.getValue()==56) {
                            condicao.setText("Boa sorte.");
                        } else if (progress.getValue()==65) {
                            condicao.setText("Boa sorte..");
                        } else if (progress.getValue()==80) {
                            condicao.setText("Boa sorte...");
                        } else if (progress.getValue()==99) {
                            condicao.setText("Concluido");
                        }  else if (progress.getValue()==100) {
                            new Historia1().setVisible(true);
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

        condicao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loading...");
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1280, 787));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        condicao.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        condicao.setForeground(new java.awt.Color(255, 255, 255));
        condicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                condicaoMouseClicked(evt);
            }
        });
        getContentPane().add(condicao);
        condicao.setBounds(350, 720, 230, 20);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Status:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 720, 60, 20);

        progress.setBackground(new java.awt.Color(167, 0, 216));
        progress.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        progress.setForeground(new java.awt.Color(167, 0, 216));
        progress.setBorder(null);
        progress.setBorderPainted(false);
        progress.setEnabled(false);
        progress.setStringPainted(true);
        getContentPane().add(progress);
        progress.setBounds(290, 690, 750, 20);

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/loadingGame.jpg"))); // NOI18N
        jFundo.setText(" ");
        getContentPane().add(jFundo);
        jFundo.setBounds(0, 0, 1280, 790);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void condicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_condicaoMouseClicked
    }//GEN-LAST:event_condicaoMouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel condicao;
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
