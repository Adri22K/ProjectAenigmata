package Telas;

public class Creditos extends javax.swing.JFrame {

    public Creditos() {
        initComponents();
        }

    private static final Creditos INSTANCIA = new Creditos();

public static Creditos getInstancia() {
return INSTANCIA;
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTexto = new javax.swing.JLabel();
        jSetaVoltar = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Créditos");
        setMaximumSize(new java.awt.Dimension(616, 417));
        setMinimumSize(new java.awt.Dimension(616, 417));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(626, 417));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        jTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsCreditos/TEXTO_CREDITOS.png"))); // NOI18N
        getContentPane().add(jTexto);
        jTexto.setBounds(130, 130, 380, 160);

        jSetaVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGerais/SETA_SAIDA.png"))); // NOI18N
        jSetaVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSetaVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSetaVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(jSetaVoltar);
        jSetaVoltar.setBounds(10, 20, 50, 40);

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsCreditos/CREDITOS.png"))); // NOI18N
        getContentPane().add(jFundo);
        jFundo.setBounds(0, 0, 626, 417);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSetaVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSetaVoltarMouseClicked
        dispose();
    }//GEN-LAST:event_jSetaVoltarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jSetaVoltar;
    private javax.swing.JLabel jTexto;
    // End of variables declaration//GEN-END:variables
}
