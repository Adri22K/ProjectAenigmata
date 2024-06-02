package Telas;


public class SairCondicao extends javax.swing.JFrame {


    public SairCondicao() {
        initComponents();
    }
    
    private static final SairCondicao INSTANCIA = new SairCondicao();

public static SairCondicao getInstancia() {
return INSTANCIA;
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTexto = new javax.swing.JLabel();
        jSair = new javax.swing.JLabel();
        jFicar = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 300));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        jTexto.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTexto.setForeground(new java.awt.Color(255, 255, 255));
        jTexto.setText("Deseja mesmo sair?");
        getContentPane().add(jTexto);
        jTexto.setBounds(180, 90, 150, 20);

        jSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsSair/BOTAOSAIRCOND_SIM.png"))); // NOI18N
        jSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSairMouseClicked(evt);
            }
        });
        getContentPane().add(jSair);
        jSair.setBounds(140, 150, 100, 50);

        jFicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsSair/BOTAOSAIRCOND_NAO.png"))); // NOI18N
        jFicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jFicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFicarMouseClicked(evt);
            }
        });
        getContentPane().add(jFicar);
        jFicar.setBounds(280, 150, 100, 50);

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsSair/FUNDO.png"))); // NOI18N
        getContentPane().add(jFundo);
        jFundo.setBounds(0, 0, 500, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jSairMouseClicked

    private void jFicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFicarMouseClicked
        dispose();
    }//GEN-LAST:event_jFicarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jFicar;
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jSair;
    private javax.swing.JLabel jTexto;
    // End of variables declaration//GEN-END:variables
}
