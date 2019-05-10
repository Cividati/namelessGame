package namelessgame.Ui;

import java.util.List;
import java.util.ArrayList;
import namelessgame.Exception.GameIdNotFound;
import namelessgame.Game.Player;

/**
 *
 * @author sin
 */
public class loadGameFrame extends javax.swing.JFrame {

    /**
     * Creates new form loadGameFrame
     */
    public loadGameFrame() {
        initComponents();
        
        String displayChars = "";
        
        for (Player player : newGameFrame.playerList) {
            displayChars += "Nickname: " + player.getName();
            
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name1 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        Char4 = new javax.swing.JButton();
        Char1 = new javax.swing.JButton();
        Char2 = new javax.swing.JButton();
        Char3 = new javax.swing.JButton();
        Char5 = new javax.swing.JButton();
        Char6 = new javax.swing.JButton();
        Char7 = new javax.swing.JButton();
        Char8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        name1.setFont(new java.awt.Font("OscineW04-Light", 0, 24)); // NOI18N
        name1.setForeground(new java.awt.Color(51, 51, 51));
        name1.setText("Your games:");
        getContentPane().add(name1);
        name1.setBounds(130, 30, 130, 40);

        deleteButton.setFont(new java.awt.Font("OscineW04-Light", 0, 24)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton);
        deleteButton.setBounds(1030, 390, 100, 50);

        loadButton.setFont(new java.awt.Font("OscineW04-Light", 0, 24)); // NOI18N
        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loadButton);
        loadButton.setBounds(890, 390, 100, 50);

        id.setFont(new java.awt.Font("OscineW04-Light", 0, 24)); // NOI18N
        id.setForeground(new java.awt.Color(51, 51, 51));
        id.setText("Game id:");
        getContentPane().add(id);
        id.setBounds(900, 320, 90, 40);

        BackButton.setFont(new java.awt.Font("OscineW04-Light", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(1140, 670, 100, 30);

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        getContentPane().add(idField);
        idField.setBounds(990, 320, 50, 40);
        getContentPane().add(Char4);
        Char4.setBounds(50, 430, 210, 80);
        getContentPane().add(Char1);
        Char1.setBounds(50, 100, 210, 80);
        getContentPane().add(Char2);
        Char2.setBounds(50, 210, 210, 80);
        getContentPane().add(Char3);
        Char3.setBounds(50, 320, 210, 80);
        getContentPane().add(Char5);
        Char5.setBounds(350, 100, 210, 80);
        getContentPane().add(Char6);
        Char6.setBounds(350, 210, 210, 80);
        getContentPane().add(Char7);
        Char7.setBounds(350, 320, 210, 80);
        getContentPane().add(Char8);
        Char8.setBounds(350, 430, 210, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PATTERN-BRANCO.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1270, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        int gameId;
        
        try
        {
            gameId = Integer.parseInt(idField.getText());
            
            // find game id (exception thrown in the method)
        }
        catch(NumberFormatException | GameIdNotFound e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, "Invalid game id.", "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            return;
        }
        
        System.out.println("Loading into game...");
    }//GEN-LAST:event_loadButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.dispose();
        
        menuFrame menuBack = new menuFrame();
        menuBack.setVisible(true);
        menuBack.setSize(1280, 720);
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(loadGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loadGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loadGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loadGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loadGameFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton Char1;
    private javax.swing.JButton Char2;
    private javax.swing.JButton Char3;
    private javax.swing.JButton Char4;
    private javax.swing.JButton Char5;
    private javax.swing.JButton Char6;
    private javax.swing.JButton Char7;
    private javax.swing.JButton Char8;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loadButton;
    private javax.swing.JLabel name1;
    // End of variables declaration//GEN-END:variables
}
