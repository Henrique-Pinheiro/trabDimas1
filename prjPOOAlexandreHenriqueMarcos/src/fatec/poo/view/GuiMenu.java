/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

/**
 *
 * @author 0030481713039
 */
public class GuiMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public GuiMenu() {
        initComponents();
    }
    
//    GuiTurma guiTurma = new GuiTurma();
//    GuiCurso guiCurso = new GuiCurso();
//    GuiInstrutor guiInstrutor = new GuiInstrutor();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mItemCurso = new javax.swing.JMenuItem();
        mItemTurma = new javax.swing.JMenuItem();
        mItemInstrutor = new javax.swing.JMenuItem();
        mItemAluno = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mItemAlocInstrutor = new javax.swing.JMenuItem();
        mItemMatricula = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho POO");

        jMenu1.setText("Cadastros");

        mItemCurso.setText("Curso");
        mItemCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemCursoActionPerformed(evt);
            }
        });
        jMenu1.add(mItemCurso);

        mItemTurma.setText("Turma");
        mItemTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemTurmaActionPerformed(evt);
            }
        });
        jMenu1.add(mItemTurma);

        mItemInstrutor.setText("Instrutor");
        mItemInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemInstrutorActionPerformed(evt);
            }
        });
        jMenu1.add(mItemInstrutor);

        mItemAluno.setText("Aluno");
        mItemAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(mItemAluno);
        jMenu1.add(jSeparator1);

        jMenuItem5.setText("Sair");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operações");

        mItemAlocInstrutor.setText("Alocar Instrutor");
        mItemAlocInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemAlocInstrutorActionPerformed(evt);
            }
        });
        jMenu2.add(mItemAlocInstrutor);

        mItemMatricula.setText("Efetuar Matrícula");
        jMenu2.add(mItemMatricula);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemCursoActionPerformed
        GuiCurso guiCurso = new GuiCurso();
        guiCurso.show(true);
    }//GEN-LAST:event_mItemCursoActionPerformed

    private void mItemTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemTurmaActionPerformed
        GuiTurma guiTurma = new GuiTurma();
        guiTurma.show(true);
    }//GEN-LAST:event_mItemTurmaActionPerformed

    private void mItemInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemInstrutorActionPerformed
        GuiInstrutor guiInstrutor = new GuiInstrutor();
        guiInstrutor.show(true);
    }//GEN-LAST:event_mItemInstrutorActionPerformed

    private void mItemAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemAlunoActionPerformed
        GuiAluno guiAluno = new GuiAluno();
        guiAluno.show(true);
    }//GEN-LAST:event_mItemAlunoActionPerformed

    private void mItemAlocInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemAlocInstrutorActionPerformed

    }//GEN-LAST:event_mItemAlocInstrutorActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mItemAlocInstrutor;
    private javax.swing.JMenuItem mItemAluno;
    private javax.swing.JMenuItem mItemCurso;
    private javax.swing.JMenuItem mItemInstrutor;
    private javax.swing.JMenuItem mItemMatricula;
    private javax.swing.JMenuItem mItemTurma;
    // End of variables declaration//GEN-END:variables
}
