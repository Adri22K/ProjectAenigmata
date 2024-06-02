package Telas;

public class Score extends javax.swing.JFrame {

    public Score() {
        initComponents();
    }

    private static final Score INSTANCIA = new Score();

    public static Score getInstancia() {
    return INSTANCIA;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JName = new javax.swing.JLabel();
        jTime = new javax.swing.JLabel();
        jTitleS = new javax.swing.JLabel();
        jPlayer = new javax.swing.JLabel();
        jScorePlayer = new javax.swing.JLabel();
        jDia = new javax.swing.JLabel();
        jData = new javax.swing.JLabel();
        jFinalTitle = new javax.swing.JLabel();
        jFinalEsc = new javax.swing.JLabel();
        jSetaVoltar = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pontuação");
        setMaximumSize(new java.awt.Dimension(626, 417));
        setMinimumSize(new java.awt.Dimension(626, 417));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(626, 417));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        JName.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        JName.setForeground(new java.awt.Color(255, 255, 255));
        JName.setText("Nome");
        getContentPane().add(JName);
        JName.setBounds(110, 170, 50, 22);

        jTime.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jTime.setForeground(new java.awt.Color(255, 255, 255));
        jTime.setText("Tempo");
        getContentPane().add(jTime);
        jTime.setBounds(220, 170, 60, 22);

        jTitleS.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        jTitleS.setForeground(new java.awt.Color(255, 255, 255));
        jTitleS.setText("Score");
        getContentPane().add(jTitleS);
        jTitleS.setBounds(280, 120, 60, 24);

        jPlayer.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jPlayer.setForeground(new java.awt.Color(204, 204, 204));
        jPlayer.setText("Joãozinho");
        getContentPane().add(jPlayer);
        jPlayer.setBounds(110, 220, 80, 19);

        jScorePlayer.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jScorePlayer.setForeground(new java.awt.Color(204, 204, 204));
        jScorePlayer.setText("08/04/21");
        getContentPane().add(jScorePlayer);
        jScorePlayer.setBounds(330, 220, 70, 14);

        jDia.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jDia.setForeground(new java.awt.Color(204, 204, 204));
        jDia.setText("50s");
        getContentPane().add(jDia);
        jDia.setBounds(220, 220, 34, 14);

        jData.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jData.setForeground(new java.awt.Color(255, 255, 255));
        jData.setText("Data");
        getContentPane().add(jData);
        jData.setBounds(340, 170, 40, 20);

        jFinalTitle.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jFinalTitle.setForeground(new java.awt.Color(255, 255, 255));
        jFinalTitle.setText("Final");
        getContentPane().add(jFinalTitle);
        jFinalTitle.setBounds(450, 170, 70, 22);

        jFinalEsc.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jFinalEsc.setForeground(new java.awt.Color(255, 255, 255));
        jFinalEsc.setText("Bom/Ruim");
        getContentPane().add(jFinalEsc);
        jFinalEsc.setBounds(450, 210, 80, 22);

        jSetaVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsGerais/SETA_SAIDA.png"))); // NOI18N
        jSetaVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSetaVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSetaVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(jSetaVoltar);
        jSetaVoltar.setBounds(10, 20, 50, 40);

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGsScore/SCORE.png"))); // NOI18N
        getContentPane().add(jFundo);
        jFundo.setBounds(0, 0, 626, 417);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSetaVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSetaVoltarMouseClicked
        dispose();
    }//GEN-LAST:event_jSetaVoltarMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JName;
    private javax.swing.JLabel jData;
    private javax.swing.JLabel jDia;
    private javax.swing.JLabel jFinalEsc;
    private javax.swing.JLabel jFinalTitle;
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jPlayer;
    private javax.swing.JLabel jScorePlayer;
    private javax.swing.JLabel jSetaVoltar;
    private javax.swing.JLabel jTime;
    private javax.swing.JLabel jTitleS;
    // End of variables declaration//GEN-END:variables
}
