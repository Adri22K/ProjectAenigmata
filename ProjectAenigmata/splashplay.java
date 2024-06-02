
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


public class splashplay extends javax.swing.JFrame {


    public splashplay() {
        
        
        URL caminhoIcone = getClass().getResource("/IMGsIcon/LOGOTITULO.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);




        //cor da barra de progresso 
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(splashplay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(splashplay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(splashplay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(splashplay.class.getName()).log(Level.SEVERE, null, ex);
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
                            dicas.setText("DICA: Os livros podem te ajudar em TUDO!");
                        }else if (progress.getValue()==10) {
                            condicao.setText("Iniciando.");
                            dicas.setText("DICA: Os livros podem te ajudar em TUDO!");
                        } else if (progress.getValue()==20) {
                            condicao.setText("Iniciando..");
                            dicas.setText("DICA: Os livros podem te ajudar em TUDO!");
                        }else if (progress.getValue()==33) {
                            condicao.setText("Pense antes de responder...");
                            dicas.setText("DICA: As vezes pesquisar na internet não faz mal");
                        } else if (progress.getValue()==40) {
                            condicao.setText("Pense antes de responder.");
                            dicas.setText("DICA: As vezes pesquisar na internet não faz mal");
                        } else if (progress.getValue()==50) {
                            condicao.setText("Pense antes de responder..");
                            dicas.setText("DICA: As vezes pesquisar na internet não faz mal");
                        } 
                        else if (progress.getValue()==56) {
                            condicao.setText("Boa sorte.");
                            dicas.setText("DICA: Procure no cenário, podem haver coisas escondidas");
                        } else if (progress.getValue()==65) {
                            condicao.setText("Boa sorte..");
                            dicas.setText("DICA: Procure no cenário, podem haver coisas escondidas");
                        } else if (progress.getValue()==80) {
                            condicao.setText("Boa sorte...");
                            dicas.setText("DICA: Procure no cenário, podem haver coisas escondidas");
                        } else if (progress.getValue()==99) {
                            condicao.setText("Concluido");
                        }  else if (progress.getValue()==100) {
                            dispose();
                            
                            new Menu().setVisible(true);
                         
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

        dicas = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        jStatus = new javax.swing.JLabel();
        condicao = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stollde - v 1.0");
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 760));
        setMinimumSize(new java.awt.Dimension(1280, 760));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 760));
        setResizable(false);
        getContentPane().setLayout(null);

        dicas.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        dicas.setForeground(new java.awt.Color(255, 255, 255));
        dicas.setText("DICA: Os livros podem te ajudar em TUDO!");
        getContentPane().add(dicas);
        dicas.setBounds(340, 60, 740, 29);

        progress.setBackground(new java.awt.Color(167, 0, 216));
        progress.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        progress.setForeground(new java.awt.Color(167, 0, 216));
        progress.setToolTipText("");
        progress.setBorderPainted(false);
        progress.setEnabled(false);
        progress.setFocusable(false);
        progress.setName(""); // NOI18N
        progress.setStringPainted(true);
        getContentPane().add(progress);
        progress.setBounds(180, 650, 920, 20);

        jStatus.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jStatus.setForeground(new java.awt.Color(255, 255, 255));
        jStatus.setText("Status:");
        getContentPane().add(jStatus);
        jStatus.setBounds(180, 670, 60, 20);

        condicao.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        condicao.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(condicao);
        condicao.setBounds(240, 670, 210, 20);

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsSplash/ROG Wallpaper Design, Pixel Jeff.gif"))); // NOI18N
        getContentPane().add(jFundo);
        jFundo.setBounds(-180, -380, 1910, 1280);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(splashplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splashplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splashplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splashplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splashplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel condicao;
    private javax.swing.JLabel dicas;
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jStatus;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
