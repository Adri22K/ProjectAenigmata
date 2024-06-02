package Telas;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;

public class ColetaDados extends javax.swing.JFrame {

    Jogador jog = new Jogador();
    
    public ColetaDados() {
        initComponents();
        
        URL caminhoIcone = getClass().getResource("/IMGsIcon/LOGOTITULO.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jData = new javax.swing.JTextField();
        jNome = new javax.swing.JTextField();
        jEnviarDados = new javax.swing.JLabel();
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

        jData.setBorder(null);
        jData.setOpaque(false);
        getContentPane().add(jData);
        jData.setBounds(450, 250, 560, 30);

        jNome.setBorder(null);
        jNome.setOpaque(false);
        getContentPane().add(jNome);
        jNome.setBounds(450, 144, 560, 30);

        jEnviarDados.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jEnviarDados.setForeground(new java.awt.Color(255, 255, 255));
        jEnviarDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jEnviarDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEnviarDadosMouseClicked(evt);
            }
        });
        getContentPane().add(jEnviarDados);
        jEnviarDados.setBounds(600, 350, 150, 60);

        jFundo.setBackground(new java.awt.Color(102, 102, 102));
        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGame/COLETA_DADOS.png"))); // NOI18N
        jFundo.setOpaque(true);
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

    private void jEnviarDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEnviarDadosMouseClicked
        if(this.jNome.getText().trim().length() < 1 || this.jData.getText().trim().length() < 1){
            JOptionPane.showMessageDialog(null,"Insira os dados por favor!");
        }else{
                jog.setNome(this.jNome.getText());
                jog.setData(this.jData.getText());

                JOptionPane.showMessageDialog(null,"Dados recebidos, obrigado!");

                this.jNome.setText("");
                this.jData.setText("");

                new Menu().setVisible(true);
                dispose();
        }
    }//GEN-LAST:event_jEnviarDadosMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
                if(this.jNome.getText().trim().length() < 1 || this.jData.getText().trim().length() < 1){
            JOptionPane.showMessageDialog(null,"Insira os dados por favor!");
        }else{
                jog.setNome(this.jNome.getText());
                jog.setData(this.jData.getText());

                JOptionPane.showMessageDialog(null,"Dados recebidos, obrigado!");

                this.jNome.setText("");
                this.jData.setText("");

                new Menu().setVisible(true);
                dispose();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jData;
    private javax.swing.JLabel jEnviarDados;
    private javax.swing.JLabel jFundo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jNome;
    // End of variables declaration//GEN-END:variables
}
