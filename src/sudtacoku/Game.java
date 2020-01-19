package sudtacoku;

//imports
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Game extends javax.swing.JFrame {
    
    //initiate random object for random number generation
    Random rand = new Random();
    
    //stores current randnum (for whole program).
    int number;
    
    //Upon click, acquires randnum temporarily (done to allow switching of number without affecting 
    //game play sequence).
    int randNum;
    
    //Drag functionality for bar (same as sudTac start page)
    int xMouse;
    int yMouse;
    
    //stores sum required to win.
    int goalsum = Settings.goalsum;
    
    //2D array to store board values (row, column - 0 to 2)
    int[][] gameArray = {{0,0,0},{0,0,0},{0,0,0}};
    
    //designate player turns (even - player 2, odd - player 1)
    int turnCount = 1;
    
    
    //instantiate new game
    public Game() {
        initComponents();
        getNum();
        turnL.setText(Settings.player1name + "'s Turn!");
        turnL.setForeground(Color.decode(Settings.player1color));
        gSumL.setText("Goalsum: " + goalsum);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        FrameDrag1 = new javax.swing.JLayeredPane();
        CloseX = new javax.swing.JLabel();
        MiniM = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Canvas = new javax.swing.JPanel();
        box0_0 = new javax.swing.JLabel();
        box0_1 = new javax.swing.JLabel();
        box0_2 = new javax.swing.JLabel();
        box1_0 = new javax.swing.JLabel();
        box1_1 = new javax.swing.JLabel();
        box1_2 = new javax.swing.JLabel();
        box2_0 = new javax.swing.JLabel();
        box2_1 = new javax.swing.JLabel();
        box2_2 = new javax.swing.JLabel();
        cNumL = new javax.swing.JLabel();
        turnL = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        gSumL = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BackB = new javax.swing.JLabel();

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

        jLayeredPane1.setLayer(FrameDrag1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FrameDrag1)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FrameDrag1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Canvas.setBackground(new java.awt.Color(35, 39, 42));

        box0_0.setBackground(new java.awt.Color(44, 47, 51));
        box0_0.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        box0_0.setForeground(new java.awt.Color(255, 255, 255));
        box0_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box0_0.setText(" ");
        box0_0.setToolTipText("");
        box0_0.setOpaque(true);
        box0_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box0_0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                box0_0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                box0_0MouseExited(evt);
            }
        });

        box0_1.setBackground(new java.awt.Color(44, 47, 51));
        box0_1.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        box0_1.setForeground(new java.awt.Color(255, 255, 255));
        box0_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box0_1.setText(" ");
        box0_1.setToolTipText("");
        box0_1.setOpaque(true);
        box0_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box0_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                box0_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                box0_1MouseExited(evt);
            }
        });

        box0_2.setBackground(new java.awt.Color(44, 47, 51));
        box0_2.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        box0_2.setForeground(new java.awt.Color(255, 255, 255));
        box0_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box0_2.setText(" ");
        box0_2.setToolTipText("");
        box0_2.setOpaque(true);
        box0_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box0_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                box0_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                box0_2MouseExited(evt);
            }
        });

        box1_0.setBackground(new java.awt.Color(44, 47, 51));
        box1_0.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        box1_0.setForeground(new java.awt.Color(255, 255, 255));
        box1_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box1_0.setText(" ");
        box1_0.setToolTipText("");
        box1_0.setOpaque(true);
        box1_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box1_0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                box1_0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                box1_0MouseExited(evt);
            }
        });

        box1_1.setBackground(new java.awt.Color(44, 47, 51));
        box1_1.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        box1_1.setForeground(new java.awt.Color(255, 255, 255));
        box1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box1_1.setText(" ");
        box1_1.setToolTipText("");
        box1_1.setOpaque(true);
        box1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box1_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                box1_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                box1_1MouseExited(evt);
            }
        });

        box1_2.setBackground(new java.awt.Color(44, 47, 51));
        box1_2.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        box1_2.setForeground(new java.awt.Color(255, 255, 255));
        box1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box1_2.setText(" ");
        box1_2.setToolTipText("");
        box1_2.setOpaque(true);
        box1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box1_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                box1_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                box1_2MouseExited(evt);
            }
        });

        box2_0.setBackground(new java.awt.Color(44, 47, 51));
        box2_0.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        box2_0.setForeground(new java.awt.Color(255, 255, 255));
        box2_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box2_0.setText(" ");
        box2_0.setToolTipText("");
        box2_0.setOpaque(true);
        box2_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box2_0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                box2_0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                box2_0MouseExited(evt);
            }
        });

        box2_1.setBackground(new java.awt.Color(44, 47, 51));
        box2_1.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        box2_1.setForeground(new java.awt.Color(255, 255, 255));
        box2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box2_1.setText(" ");
        box2_1.setToolTipText("");
        box2_1.setOpaque(true);
        box2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box2_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                box2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                box2_1MouseExited(evt);
            }
        });

        box2_2.setBackground(new java.awt.Color(44, 47, 51));
        box2_2.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        box2_2.setForeground(new java.awt.Color(255, 255, 255));
        box2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box2_2.setText(" ");
        box2_2.setToolTipText("");
        box2_2.setOpaque(true);
        box2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box2_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                box2_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                box2_2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout CanvasLayout = new javax.swing.GroupLayout(Canvas);
        Canvas.setLayout(CanvasLayout);
        CanvasLayout.setHorizontalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CanvasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CanvasLayout.createSequentialGroup()
                        .addComponent(box1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CanvasLayout.createSequentialGroup()
                        .addComponent(box0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CanvasLayout.createSequentialGroup()
                        .addComponent(box2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CanvasLayout.setVerticalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CanvasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cNumL.setBackground(new java.awt.Color(255, 255, 255));
        cNumL.setFont(new java.awt.Font("AvenirNext LT Pro Regular", 0, 14)); // NOI18N
        cNumL.setForeground(new java.awt.Color(255, 255, 255));
        cNumL.setText("Current Number:   ");

        turnL.setBackground(new java.awt.Color(255, 255, 255));
        turnL.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        turnL.setForeground(new java.awt.Color(255, 255, 255));
        turnL.setText("Player 1's Turn!");

        jButton1.setBackground(new java.awt.Color(114, 137, 218));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gSumL.setBackground(new java.awt.Color(255, 255, 255));
        gSumL.setFont(new java.awt.Font("AvenirNext LT Pro Regular", 0, 18)); // NOI18N
        gSumL.setForeground(new java.awt.Color(255, 255, 255));
        gSumL.setText("GoalSum:   ");

        BackB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackB.setForeground(new java.awt.Color(255, 255, 255));
        BackB.setText("Back");
        BackB.setToolTipText("");
        BackB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackBMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(turnL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cNumL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gSumL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackB)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(gSumL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(cNumL)
                        .addGap(39, 39, 39)
                        .addComponent(turnL)
                        .addGap(82, 82, 82)
                        .addComponent(jButton1))
                    .addComponent(Canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(BackB)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Styling and functionality for to bar widgets (Refer to sudtac page for details)
    private void CloseXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseXMouseClicked
        //<editor-fold defaultstate="collapsed" desc="TopBar Code">
        systemExit();
    }//GEN-LAST:event_CloseXMouseClicked

    private void CloseXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseXMouseEntered
        CloseX.setOpaque(true);
        CloseX.setForeground(Color.RED);
    }//GEN-LAST:event_CloseXMouseEntered

    private void CloseXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseXMouseExited
        CloseX.setForeground(Color.white);
        CloseX.setOpaque(false);
    }//GEN-LAST:event_CloseXMouseExited

    private void MiniMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_MiniMMouseClicked

    private void MiniMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMMouseEntered
        MiniM.setForeground(Color.BLUE);
        MiniM.setOpaque(true);
    }//GEN-LAST:event_MiniMMouseEntered

    private void MiniMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMMouseExited
        MiniM.setForeground(Color.white);
        MiniM.setOpaque(false);
    }//GEN-LAST:event_MiniMMouseExited

    private void FrameDrag1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDrag1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setOpacity((float)0.8);
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_FrameDrag1MouseDragged

    private void FrameDrag1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDrag1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_FrameDrag1MousePressed

    private void FrameDrag1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDrag1MouseReleased
        setOpacity((float)1.0);
        //</editor-fold>
    }//GEN-LAST:event_FrameDrag1MouseReleased

    
    //Checks for win and generates new rand number.
    private void getNum(){
        showWin(); //Checks for win or draw event
       
        number = rand.nextInt(goalsum/3 + 1) + 1; //New number generation
 
        cNumL.setText("Current Number: " + String.valueOf(number)); //Sets current num text on right to actual current num.
    }
    
    
    //Checks for current turn
    private String turn(int a){
        String font;
        turnCount++; // updates to new turn
        
        //Odd turncount is player 1 turn, update to player 2 turn on sidebar
        if (a%2 != 0){
            font = Settings.player1color;
            turnL.setText(Settings.player2name + "'s Turn!");
            turnL.setForeground(Color.decode(Settings.player2color));
        }
        
        //Even turncount is player 2 turn, update to player 1 turn on sidebar
        else{
            font = Settings.player2color;
            turnL.setText(Settings.player1name + "'s Turn!");
            turnL.setForeground(Color.decode(Settings.player1color));
        }
        
        return font; //returns current player font for drawing
    }
    
    
    //*Main game logic under this fold*
    
    //transposes array such that 2nd input becomes first (inverse - for vertical checks)
    private int[][] transpose(int[][] matrix){
    //<editor-fold defaultstate="collapsed" desc="Main Game Logic">
        int m = matrix.length;
        int n = matrix[0].length;

        //create new array to return
        int[][] transposedMatrix = new int[n][m];

        //loops through original array, input inversed data into new array
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        //System.out.println(Arrays.deepToString(transposedMatrix)); //prints array for debug
        return transposedMatrix; 
    }
   
    //highlights winning streak upon given characteristic (row, column, diagonal) and number of char (so row 1, 2..)
    private void HighlightHelper(int a, char b){
        
        switch (b){
        
    
        //horizontal highlights
        case 'r':
            
            if (a==0){Highlight(box0_0, box0_1, box0_2);} //row 1
            
            else if (a==1){Highlight(box1_0, box1_1, box1_2);} //row2
            
            else{Highlight(box2_0, box2_1, box2_2);} //row3
            
            break;
    
        
        
        //vertical highlights
        case 'c':
            
            if (a==0){Highlight(box0_0, box1_0, box2_0);} //column 1
            
            else if (a==1){Highlight(box0_1, box1_1, box2_1);} //column 2
            
            else{Highlight(box0_2, box1_2, box2_2);} //column 3
            
            break;
            

        //diagonal highlights
        case 'd':
            
            if (a==0){Highlight(box0_0, box1_1, box2_2);} //left to right
            
            else{Highlight(box0_2, box1_1, box2_0);} //right to left
            
            break;
       
        default:
            System.out.println("This shouldn't happen but an error occured!");
        }
    }
            
    //Highlight method, changes highlighted sequence foreground to yellow
    private void Highlight (javax.swing.JLabel a,javax.swing.JLabel b, javax.swing.JLabel c){
        a.setForeground(Color.YELLOW);
        b.setForeground(Color.YELLOW);
        c.setForeground(Color.YELLOW);
    }
    
    //Checks for win event
    private boolean checkWin(){
        //initiate return variable to signify win event
        boolean win = false;
        
        int sum;
        int row;
        int column;
        
        //horizontal check
        for(int i=0; i<gameArray[0].length; i++){
            sum=0;
            
            //sums each row
            for (int j=0; j<gameArray[0].length; j++){
                sum+=gameArray[i][j];
                
                //Returns win event if sum is equal to goalsum at any point
                if(sum==goalsum){
                    win = true;
                    row=i; //store row to pass to highlight
                    System.out.println("Winner");
                    
                    //Highlights winstreak
                    HighlightHelper(row, 'r');
                    
                    //Prints winning row in output shell
                    for(int x=0; x<gameArray[0].length; x++ ){
                        System.out.println(row + " " + x);
                    }
                    
                    break;
                }
            }
        }
       
        //vertical check (if no horizontal win)
        for(int i=0; i<gameArray[0].length; i++){
            sum=0;
            
            //sums each column
            for (int j=0; j<gameArray[0].length; j++){
                sum+=transpose(gameArray)[i][j];
                
                //Returns win event if sum is equal to goalsum at any point
                if(sum==goalsum){
                    win = true;
                    column=i; //store column to pass to highlight
                    System.out.println("Winner");
                    
                    //Highlights winstreak
                    HighlightHelper(column, 'c');
                    
                    //Prints winning column in output shell
                    for(int x=0; x<gameArray[0].length; x++ ){
                        System.out.println(x + " " + column);
                    }
                    
                    break;
                }
            }
        }
        
        //diagonal check (if no vertical/horizontal)
        //sums from left to right
        if((gameArray[0][0]+gameArray[1][1]+gameArray[2][2]==goalsum)){
            win = true;
            System.out.println("Winner");
            
            HighlightHelper(0, 'd'); //left corner for 0
        }
        
        //sums from right to left
        else if((gameArray[0][2]+gameArray[1][1]+gameArray[2][0]==goalsum)){
            win = true;
            
            HighlightHelper(2, 'd'); //right corner for 2
        }
        
        return win;
    }
    
    //Checks for draw in case of no win event
    private boolean checkDraw(){
        boolean full = true;
        
        //loops through entire array
         for(int i=0; i<gameArray[0].length; i++){
             
            for (int j=0; j<gameArray[0].length; j++){
                
                //if an index position equals 0, the array has not been filled
                if (gameArray[i][j] == 0){
                    
                    full = false;
                }
            }
         }
        return full;
        //</editor-fold>
    }
    
    
    //Resets game sequence
    private void reset(){
        //<editor-fold defaultstate="collapsed" desc="Reset">
        
        //Erase all box texts
        box0_0.setText("");
        box0_1.setText("");
        box0_2.setText("");
        box1_0.setText("");
        box1_1.setText("");
        box1_2.setText("");
        box2_0.setText("");
        box2_1.setText("");
        box2_2.setText("");
        
        //Reset turncount to 1
        turnCount = 1;
        
        //Reset to player 1 turn
        turnL.setText(Settings.player1name + "'s Turn!");
        turnL.setForeground(Color.decode(Settings.player1color));
        
        //Reset array.
        for(int i=0; i<3; i++){
            
            for (int j=0; j<3; j++){
                gameArray[i][j]=0;
            }
        }
//</editor-fold>
    }
    
    
    //Locks game, (no events)
    private void lock(){
        
        /*Fills array without drawing, no more clicks will register 
        as array is no longer empty*/
        for(int i=0; i<gameArray[0].length; i++){
            
            for (int j=0; j<gameArray[0].length; j++){
                gameArray[i][j]=1;
            }
        }
    }
    
    
    //Shows winstreak and notifies player in case of gameEvent
    private void showWin(){
        //turn switches before check
        
        //Player 1 win event, checks for win
        if (checkWin() && turnCount%2==0){ 
            System.out.println(Settings.player1name + " wins!"); //notify winner in output shell
            JOptionPane.showMessageDialog(null, Settings.player1name + " wins!"); //notify winner in pane
            lock(); //locks game until reset
            //reset();
        }
        
        //Player 2 win event
        else if (checkWin()){
            System.out.println(Settings.player2name + " wins!"); //notify winner in output shell
            JOptionPane.showMessageDialog(null, Settings.player2name + " wins!");//notify winner in pane
            lock(); //locks game until reset
            //reset();
        }
        
        //In case of no win event, check if array is full - if so, tie.
        else if(checkDraw()){
            System.out.println("Tie!"); //Notify tie in output shell
            JOptionPane.showMessageDialog(null, "Draw"); //Notify tie in pane
            lock(); //locks game until reset
        }
        
        //no event
        else{
            ;
        }
    }
   
    
    //Box click events (ALL same so refer to first).
    private void box0_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box0_0MouseClicked
        //<editor-fold defaultstate="collapsed" desc="boxClickEvents">
       
        /*If game array is empty for corresponding box index, draws current
        number in box and places value in array index*/
        if (gameArray[0][0] == 0){
            randNum = number;
            
            box0_0.setText(String.valueOf(randNum));            //draws number in box
            box0_0.setForeground(Color.decode(turn(turnCount))); //colors num to player according color
            
            gameArray[0][0] = randNum; //place num in array index
            System.out.println(Arrays.deepToString(gameArray)); //prints array for debug
            getNum(); //acquire new number
        }
    }//GEN-LAST:event_box0_0MouseClicked

    private void box0_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box0_1MouseClicked
        
        if (gameArray[0][1] == 0){
            randNum = number;
            
            box0_1.setText(String.valueOf(randNum));
            box0_1.setForeground(Color.decode(turn(turnCount)));
            
            gameArray[0][1] = randNum;
            System.out.println(Arrays.deepToString(gameArray));
            getNum();
        }
    }//GEN-LAST:event_box0_1MouseClicked

    private void box0_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box0_2MouseClicked
        
        if (gameArray[0][2] == 0){
            randNum = number;
            
            box0_2.setText(String.valueOf(randNum));
            box0_2.setForeground(Color.decode(turn(turnCount)));
            
            gameArray[0][2] = randNum;
            System.out.println(Arrays.deepToString(gameArray));
            getNum();
        }
    }//GEN-LAST:event_box0_2MouseClicked

    private void box1_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box1_0MouseClicked
        
        if (gameArray[1][0] == 0){
            randNum = number;
            
            box1_0.setText(String.valueOf(randNum));
            box1_0.setForeground(Color.decode(turn(turnCount)));
            
            gameArray[1][0] = randNum;
            System.out.println(Arrays.deepToString(gameArray));
            getNum();
        }
    }//GEN-LAST:event_box1_0MouseClicked

    private void box1_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box1_1MouseClicked
        
        if (gameArray[1][1] == 0){
            randNum = number;
            
            box1_1.setText(String.valueOf(randNum));
            box1_1.setForeground(Color.decode(turn(turnCount)));
            
            gameArray[1][1] = randNum;
            System.out.println(Arrays.deepToString(gameArray));
            getNum();
        }
    }//GEN-LAST:event_box1_1MouseClicked

    private void box1_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box1_2MouseClicked
        
        if (gameArray[1][2] == 0){
            randNum = number;
            
            box1_2.setText(String.valueOf(randNum));
            box1_2.setForeground(Color.decode(turn(turnCount)));
            
            gameArray[1][2] = randNum;
            System.out.println(Arrays.deepToString(gameArray));
            getNum();
        }
    }//GEN-LAST:event_box1_2MouseClicked

    private void box2_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box2_0MouseClicked
        
        if (gameArray[2][0] == 0){
            randNum = number;
            
            box2_0.setText(String.valueOf(randNum));
            box2_0.setForeground(Color.decode(turn(turnCount)));
            
            gameArray[2][0] = randNum;
            System.out.println(Arrays.deepToString(gameArray));
            getNum();
        }
    }//GEN-LAST:event_box2_0MouseClicked

    private void box2_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box2_1MouseClicked
        
        if (gameArray[2][1] == 0){
            randNum = number;
            
            box2_1.setText(String.valueOf(randNum));
            box2_1.setForeground(Color.decode(turn(turnCount)));
            
            gameArray[2][1] = randNum;
            System.out.println(Arrays.deepToString(gameArray));
            getNum();
        }
    }//GEN-LAST:event_box2_1MouseClicked

    private void box2_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box2_2MouseClicked
        
        if (gameArray[2][2] == 0){
            randNum = number;
            
            box2_2.setText(String.valueOf(randNum));
            box2_2.setForeground(Color.decode(turn(turnCount)));
            
            gameArray[2][2] = randNum;
            System.out.println(Arrays.deepToString(gameArray));
            getNum();
        }
    }//GEN-LAST:event_box2_2MouseClicked
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reset();
        //</editor-fold>
    }//GEN-LAST:event_jButton1ActionPerformed

    
   //Box styling, highlights box to white upon hover.
    private void box0_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box0_0MouseEntered
        //<editor-fold defaultstate="collapsed" desc="boxEnterEvent">
        box0_0.setBackground(Color.white);
    }//GEN-LAST:event_box0_0MouseEntered

    private void box0_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box0_1MouseEntered
        box0_1.setBackground(Color.white);
    }//GEN-LAST:event_box0_1MouseEntered

    private void box0_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box0_2MouseEntered
        box0_2.setBackground(Color.white);
    }//GEN-LAST:event_box0_2MouseEntered

    private void box1_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box1_0MouseEntered
        box1_0.setBackground(Color.white);
    }//GEN-LAST:event_box1_0MouseEntered

    private void box1_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box1_1MouseEntered
        box1_1.setBackground(Color.white);
    }//GEN-LAST:event_box1_1MouseEntered

    private void box1_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box1_2MouseEntered
        box1_2.setBackground(Color.white);
    }//GEN-LAST:event_box1_2MouseEntered

    private void box2_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box2_0MouseEntered
        box2_0.setBackground(Color.white);
    }//GEN-LAST:event_box2_0MouseEntered

    private void box2_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box2_1MouseEntered
       box2_1.setBackground(Color.white);
    }//GEN-LAST:event_box2_1MouseEntered

    private void box2_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box2_2MouseEntered
        box2_2.setBackground(Color.white);
        //</editor-fold>
    }//GEN-LAST:event_box2_2MouseEntered

    
    //Box styling, reset box colour upion mouse exit.
    private void box0_0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box0_0MouseExited
        //<editor-fold defaultstate="collapsed" desc="boxExitEvent">
        box0_0.setBackground(Color.decode("#2C2F33"));
    }//GEN-LAST:event_box0_0MouseExited

    private void box0_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box0_1MouseExited
        box0_1.setBackground(Color.decode("#2C2F33"));
    }//GEN-LAST:event_box0_1MouseExited

    private void box0_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box0_2MouseExited
        box0_2.setBackground(Color.decode("#2C2F33"));
    }//GEN-LAST:event_box0_2MouseExited

    private void box1_0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box1_0MouseExited
        box1_0.setBackground(Color.decode("#2C2F33"));
    }//GEN-LAST:event_box1_0MouseExited

    private void box1_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box1_1MouseExited
        box1_1.setBackground(Color.decode("#2C2F33"));
    }//GEN-LAST:event_box1_1MouseExited

    private void box1_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box1_2MouseExited
        box1_2.setBackground(Color.decode("#2C2F33"));
    }//GEN-LAST:event_box1_2MouseExited

    private void box2_0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box2_0MouseExited
        box2_0.setBackground(Color.decode("#2C2F33"));
    }//GEN-LAST:event_box2_0MouseExited

    private void box2_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box2_1MouseExited
        box2_1.setBackground(Color.decode("#2C2F33"));
    }//GEN-LAST:event_box2_1MouseExited

    private void box2_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box2_2MouseExited
        box2_2.setBackground(Color.decode("#2C2F33"));
        //</editor-fold>
    }//GEN-LAST:event_box2_2MouseExited

    
    //Back button styling and functionality
    
    //Returns to start opage
    private void BackBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBMouseClicked
        // TODO add your handling code here:
        SudTacOku Info = new SudTacOku();   //opens start page
        Info.setVisible(true);

        systemExit(); //closes game page
    }//GEN-LAST:event_BackBMouseClicked

    
    //Hover styling
    private void BackBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBMouseEntered
        // TODO add your handling code here:
        BackB.setForeground(Color.red);
    }//GEN-LAST:event_BackBMouseEntered

    private void BackBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBMouseExited
        // TODO add your handling code here:
        BackB.setForeground(Color.white);
    }//GEN-LAST:event_BackBMouseExited
    
    
    //Closes current page
    public void systemExit(){
        WindowEvent winCloseing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winCloseing);
    }
    
    
    //Runs game page
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackB;
    private javax.swing.JPanel Canvas;
    private javax.swing.JLabel CloseX;
    private javax.swing.JLayeredPane FrameDrag1;
    private javax.swing.JLabel MiniM;
    private javax.swing.JLabel box0_0;
    private javax.swing.JLabel box0_1;
    private javax.swing.JLabel box0_2;
    private javax.swing.JLabel box1_0;
    private javax.swing.JLabel box1_1;
    private javax.swing.JLabel box1_2;
    private javax.swing.JLabel box2_0;
    private javax.swing.JLabel box2_1;
    private javax.swing.JLabel box2_2;
    private javax.swing.JLabel cNumL;
    private javax.swing.JLabel gSumL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel turnL;
    // End of variables declaration//GEN-END:variables
}
