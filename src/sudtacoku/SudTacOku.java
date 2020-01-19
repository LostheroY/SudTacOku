package sudtacoku;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class SudTacOku extends javax.swing.JFrame {
    
    //Local variables for drag functionality
    int xMouse;
    int yMouse;
    
    public SudTacOku() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        LayeredTopBar = new javax.swing.JLayeredPane();
        FrameDrag1 = new javax.swing.JLayeredPane();
        CloseX = new javax.swing.JLabel();
        MiniM = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        MenuSplash = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SettingsB = new javax.swing.JLabel();
        StartGameB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanelMain.setBackground(new java.awt.Color(44, 47, 51));

        FrameDrag1.setBackground(new java.awt.Color(35, 39, 42));
        FrameDrag1.setForeground(new java.awt.Color(35, 39, 42));
        FrameDrag1.setOpaque(true);
        FrameDrag1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FrameDrag1MouseDragged(evt);
            }
        });
        FrameDrag1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrameDrag1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FrameDrag1MouseReleased(evt);
            }
        });

        CloseX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CloseX.setForeground(new java.awt.Color(255, 255, 255));
        CloseX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseX.setText("X");
        CloseX.setAutoscrolls(true);
        CloseX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseXMouseExited(evt);
            }
        });

        MiniM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MiniM.setForeground(new java.awt.Color(255, 255, 255));
        MiniM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MiniM.setText("-");
        MiniM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MiniMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MiniMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MiniMMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Uni Sans Heavy CAPS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Sud Tac Oku");

        FrameDrag1.setLayer(CloseX, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FrameDrag1.setLayer(MiniM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FrameDrag1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout FrameDrag1Layout = new javax.swing.GroupLayout(FrameDrag1);
        FrameDrag1.setLayout(FrameDrag1Layout);
        FrameDrag1Layout.setHorizontalGroup(
            FrameDrag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameDrag1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MiniM, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CloseX, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        FrameDrag1Layout.setVerticalGroup(
            FrameDrag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CloseX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameDrag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(MiniM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        LayeredTopBar.setLayer(FrameDrag1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayeredTopBarLayout = new javax.swing.GroupLayout(LayeredTopBar);
        LayeredTopBar.setLayout(LayeredTopBarLayout);
        LayeredTopBarLayout.setHorizontalGroup(
            LayeredTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FrameDrag1)
        );
        LayeredTopBarLayout.setVerticalGroup(
            LayeredTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FrameDrag1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLayeredPane2.setOpaque(true);

        MenuSplash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudtacoku/Images/DestinySplashEdited.jpg"))); // NOI18N
        MenuSplash.setOpaque(true);

        jLayeredPane2.setLayer(MenuSplash, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(MenuSplash, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuSplash, javax.swing.GroupLayout.PREFERRED_SIZE, 534, Short.MAX_VALUE)
        );

        jPanel1.setOpaque(false);

        SettingsB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SettingsB.setForeground(new java.awt.Color(255, 255, 255));
        SettingsB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SettingsB.setText("Settings");
        SettingsB.setToolTipText("");
        SettingsB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingsBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingsBMouseExited(evt);
            }
        });

        StartGameB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StartGameB.setForeground(new java.awt.Color(255, 255, 255));
        StartGameB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StartGameB.setText("Start Game");
        StartGameB.setToolTipText("");
        StartGameB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartGameBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StartGameBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StartGameBMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SettingsB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StartGameB, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StartGameB, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(SettingsB, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LayeredTopBar)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(LayeredTopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Reset frame opacity once not being dragged
    private void FrameDrag1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDrag1MouseReleased
        setOpacity((float)1.0);
    }//GEN-LAST:event_FrameDrag1MouseReleased

    
    //Acquires mouse cords upon click on topbar
    private void FrameDrag1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDrag1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_FrameDrag1MousePressed

    
    //Drags frame, accordign to initial position
    private void FrameDrag1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDrag1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        //Transparent frame upon drag
        setOpacity((float)0.8);
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_FrameDrag1MouseDragged

    
    //Resets minimize button appearance once not hovered
    private void MiniMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMMouseExited
        MiniM.setForeground(Color.white);
        MiniM.setOpaque(false);
    }//GEN-LAST:event_MiniMMouseExited

    
    //Highlights minimize button
    private void MiniMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMMouseEntered
        MiniM.setForeground(Color.BLUE);
        MiniM.setOpaque(true);
    }//GEN-LAST:event_MiniMMouseEntered

    
    //Minimize frame upon minimize button click
    private void MiniMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_MiniMMouseClicked

    
    //Resets exit button appearance once not hovered
    private void CloseXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseXMouseExited
        CloseX.setForeground(Color.white);
        CloseX.setBackground(Color.decode("#2C2F33"));
        CloseX.setOpaque(false);
    }//GEN-LAST:event_CloseXMouseExited

    
    //Highlights close button
    private void CloseXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseXMouseEntered
        CloseX.setOpaque(true);
        CloseX.setBackground(Color.RED);
    }//GEN-LAST:event_CloseXMouseEntered

    
    //Close frame upon exit button click
    private void CloseXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseXMouseClicked
        systemExit();
    }//GEN-LAST:event_CloseXMouseClicked

    
    //The below is the same, highlighting labels upon mouse hover
    
    private void StartGameBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartGameBMouseEntered
        StartGameB.setForeground(Color.decode("#7289DA"));
    }//GEN-LAST:event_StartGameBMouseEntered

    
    private void StartGameBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartGameBMouseExited
        StartGameB.setForeground(Color.white);
    }//GEN-LAST:event_StartGameBMouseExited

    
    //Opens game page upon start label click
    private void StartGameBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartGameBMouseClicked
        systemExit();               //Close startup page.
        
        Game Info = new Game();     //Opens game page.
        Info.setVisible(true);
    }//GEN-LAST:event_StartGameBMouseClicked

    private void SettingsBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsBMouseEntered
        SettingsB.setForeground(Color.decode("#7289DA"));
    }//GEN-LAST:event_SettingsBMouseEntered

    
    private void SettingsBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsBMouseExited
        SettingsB.setForeground(Color.white);
    }//GEN-LAST:event_SettingsBMouseExited

    
    //Opens settings page upon settings label click.    
    private void SettingsBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsBMouseClicked
        systemExit();                       //Close startup page.
        
        Settings Info = new Settings();     //Opens settings page.
        Info.setVisible(true);
    }//GEN-LAST:event_SettingsBMouseClicked

    
    //Close current frame
    public void systemExit(){
        WindowEvent winCloseing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winCloseing);
    }
   
    
    //Main method, initiates program through start page run.
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
            java.util.logging.Logger.getLogger(SudTacOku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudTacOku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudTacOku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudTacOku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudTacOku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseX;
    private javax.swing.JLayeredPane FrameDrag1;
    private javax.swing.JLayeredPane LayeredTopBar;
    private javax.swing.JLabel MenuSplash;
    private javax.swing.JLabel MiniM;
    private javax.swing.JLabel SettingsB;
    private javax.swing.JLabel StartGameB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMain;
    // End of variables declaration//GEN-END:variables
}
