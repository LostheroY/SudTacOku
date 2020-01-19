
package sudtacoku;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Settings extends javax.swing.JFrame {
    
    static int goalsum = 10;

    int xMouse;
    int yMouse;
    
    boolean colour7 = true;
    boolean colour6 = true;
    
    Color panelBG = new Color(38,38,38);
    Color panelHL = new Color(64,64,64);
    Color panelHG = new Color(102,102,102);
    
    static String player1color = "#FF0000";
    static String player2color = "#0000FF";        
    
    static String player1name = "Player 1";
    static String player2name = "Player 2";

    
    public Settings() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanelMain = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        FrameDrag1 = new javax.swing.JLayeredPane();
        CloseX = new javax.swing.JLabel();
        MiniM = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sidepane = new javax.swing.JPanel();
        info = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        sum = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        BackB = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        greenplayer1 = new javax.swing.JButton();
        greenplayer2 = new javax.swing.JButton();
        orangeplayer1 = new javax.swing.JButton();
        purpleplayer2 = new javax.swing.JButton();
        player2 = new javax.swing.JTextField();
        redplayer1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        player1 = new javax.swing.JTextField();
        blueplayer1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        blueplayer2 = new javax.swing.JButton();
        redplayer2 = new javax.swing.JButton();
        purpleplayer1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        orangeplayer2 = new javax.swing.JButton();
        player1namebutton = new javax.swing.JButton();
        player2namebutton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        goalsumbutton = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Player 1 name:");
        jLabel3.setToolTipText("");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
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

        sidepane.setBackground(new java.awt.Color(38, 38, 38));
        sidepane.setPreferredSize(new java.awt.Dimension(250, 57));

        info.setBackground(new java.awt.Color(38, 38, 38));
        info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoMouseExited(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Player's Information");

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sum.setBackground(new java.awt.Color(38, 38, 38));
        sum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sumMouseExited(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Goal Sum");

        javax.swing.GroupLayout sumLayout = new javax.swing.GroupLayout(sum);
        sum.setLayout(sumLayout);
        sumLayout.setHorizontalGroup(
            sumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sumLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sumLayout.setVerticalGroup(
            sumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jPanel3.setBackground(new java.awt.Color(34, 34, 34));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 29)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Settings");

        jSeparator3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jSeparator3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jSeparator3.setPreferredSize(new java.awt.Dimension(1000, 1000));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidepaneLayout = new javax.swing.GroupLayout(sidepane);
        sidepane.setLayout(sidepaneLayout);
        sidepaneLayout.setHorizontalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidepaneLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(sidepaneLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(BackB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidepaneLayout.setVerticalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepaneLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackB)
                .addGap(14, 14, 14))
        );

        jPanel1.setBackground(new java.awt.Color(44, 47, 51));
        jPanel1.setForeground(new java.awt.Color(44, 47, 51));

        greenplayer1.setBackground(new java.awt.Color(0, 255, 51));
        greenplayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenplayer1ActionPerformed(evt);
            }
        });

        greenplayer2.setBackground(new java.awt.Color(0, 255, 51));
        greenplayer2.setPreferredSize(new java.awt.Dimension(55, 22));
        greenplayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenplayer2ActionPerformed(evt);
            }
        });

        orangeplayer1.setBackground(new java.awt.Color(255, 153, 0));
        orangeplayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeplayer1ActionPerformed(evt);
            }
        });

        purpleplayer2.setBackground(new java.awt.Color(204, 0, 204));
        purpleplayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purpleplayer2ActionPerformed(evt);
            }
        });

        player2.setBackground(new java.awt.Color(44, 47, 51));
        player2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        player2.setForeground(new java.awt.Color(204, 204, 204));
        player2.setBorder(null);
        player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2ActionPerformed(evt);
            }
        });

        redplayer1.setBackground(new java.awt.Color(255, 0, 0));
        redplayer1.setBorderPainted(false);
        redplayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redplayer1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Player's Information");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Player 1");
        jLabel4.setToolTipText("");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player 2 ");
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        player1.setBackground(new java.awt.Color(44, 47, 51));
        player1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        player1.setForeground(new java.awt.Color(204, 204, 204));
        player1.setBorder(null);

        blueplayer1.setBackground(new java.awt.Color(0, 51, 255));
        blueplayer1.setPreferredSize(new java.awt.Dimension(55, 22));
        blueplayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueplayer1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Choose a name:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Choose a color:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Choose a color:");

        blueplayer2.setBackground(new java.awt.Color(0, 0, 255));
        blueplayer2.setPreferredSize(new java.awt.Dimension(55, 22));
        blueplayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueplayer2ActionPerformed(evt);
            }
        });

        redplayer2.setBackground(new java.awt.Color(255, 0, 0));
        redplayer2.setPreferredSize(new java.awt.Dimension(55, 22));
        redplayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redplayer2ActionPerformed(evt);
            }
        });

        purpleplayer1.setBackground(new java.awt.Color(204, 0, 204));
        purpleplayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purpleplayer1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Choose a name:");

        orangeplayer2.setBackground(new java.awt.Color(255, 153, 0));
        orangeplayer2.setPreferredSize(new java.awt.Dimension(55, 22));
        orangeplayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeplayer2ActionPerformed(evt);
            }
        });

        player1namebutton.setBackground(new java.awt.Color(114, 137, 218));
        player1namebutton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        player1namebutton.setForeground(new java.awt.Color(255, 255, 255));
        player1namebutton.setText("Enter");
        player1namebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1namebuttonActionPerformed(evt);
            }
        });

        player2namebutton.setBackground(new java.awt.Color(114, 137, 218));
        player2namebutton.setForeground(new java.awt.Color(255, 255, 255));
        player2namebutton.setText("Enter");
        player2namebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2namebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 370, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(redplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(redplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(115, 115, 115)
                                                .addComponent(orangeplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(player2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(purpleplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(purpleplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(player2namebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(orangeplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(player1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel13)
                                                .addComponent(jSeparator1))
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addComponent(player1namebutton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(greenplayer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(greenplayer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 436, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(blueplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {player1namebutton, player2namebutton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player1namebutton))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(greenplayer1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(redplayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(blueplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(orangeplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(purpleplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player2namebutton)
                    .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(greenplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(redplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orangeplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purpleplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(44, 47, 51));
        jPanel2.setForeground(new java.awt.Color(44, 47, 51));
        jPanel2.setToolTipText("");
        jPanel2.setPreferredSize(new java.awt.Dimension(790, 490));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 255));
        jLabel15.setText("Goal Sum");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("What would you like the goal sum to be? (5-15)");

        jTextField1.setBackground(new java.awt.Color(44, 47, 51));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);
        jTextField1.setDisabledTextColor(new java.awt.Color(44, 47, 51));
        jTextField1.setEnabled(false);

        goalsumbutton.setBackground(new java.awt.Color(114, 137, 218));
        goalsumbutton.setForeground(new java.awt.Color(255, 255, 255));
        goalsumbutton.setText("Enter");
        goalsumbutton.setEnabled(false);
        goalsumbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goalsumbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addComponent(goalsumbutton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goalsumbutton))
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(sidepane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                    .addGap(250, 250, 250)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidepane, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE))))
            .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))
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
      
    //Frame control events, same as in Game and Main Page. Refer to SudTacOku for functionality
    private void FrameDrag1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDrag1MouseReleased
        //<editor-fold defaultstate="collapsed" desc="Frame Control">
        setOpacity((float)1.0);
    }//GEN-LAST:event_FrameDrag1MouseReleased

    private void FrameDrag1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDrag1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_FrameDrag1MousePressed

    private void FrameDrag1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDrag1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setOpacity((float)0.8);
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_FrameDrag1MouseDragged

    private void MiniMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMMouseExited
        MiniM.setForeground(Color.white);
        MiniM.setOpaque(false);
    }//GEN-LAST:event_MiniMMouseExited

    private void MiniMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMMouseEntered
        MiniM.setForeground(Color.BLUE);
        MiniM.setOpaque(true);
    }//GEN-LAST:event_MiniMMouseEntered

    private void MiniMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_MiniMMouseClicked

    private void CloseXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseXMouseExited
        CloseX.setForeground(Color.white);
        CloseX.setOpaque(false);
    }//GEN-LAST:event_CloseXMouseExited

    private void CloseXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseXMouseEntered
        CloseX.setOpaque(true);
        CloseX.setForeground(Color.RED);
    }//GEN-LAST:event_CloseXMouseEntered

    private void CloseXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseXMouseClicked
        systemExit();
        //</editor-fold>
    }//GEN-LAST:event_CloseXMouseClicked

    private void player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player2ActionPerformed

    private void redplayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redplayer1ActionPerformed
        // check if the other player choose this color. if so then show error panel. if not then change player's variable for color with the new color. 
        if (player2color.equals("#FF0000")){
            JOptionPane.showMessageDialog(null,"Sorry " + player2name + " already took this color.","Color Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            player1color="#FF0000";
        }
    }//GEN-LAST:event_redplayer1ActionPerformed

    private void infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseEntered
        // once the mouse hovers over the label 'Player's information' change the color of the label and the text
        if (colour7){
        jLabel7.setForeground(Color.decode("#7289DA"));
        info.setBackground(panelHL);
        }
    }//GEN-LAST:event_infoMouseEntered

    private void infoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseExited
        // once the mouse stops hovering over the 'Player's information' return the colors back to normal
        if (colour7){
            info.setBackground(panelBG);
        }
        jLabel7.setForeground(Color.white);
    }//GEN-LAST:event_infoMouseExited

    private void infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseClicked
        // Once the 'Player's information' label is clicked
        colour7 = false;
        colour6 = true;
        setColor(info); // change the color of the Player's information label
        resetColor(sum); // set the goal sum label back to its normal color
        
        jPanel1.setVisible(true); // make the player's information panel visible
        jPanel2.setVisible(false); // make the goal sum panel invisible
        
    }//GEN-LAST:event_infoMouseClicked

    private void sumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumMouseClicked
        // Once the 'goal sum' label is clicked
        colour6 = false;
        colour7=true;
        setColor(sum);// change the color of the goal sum label
        resetColor(info);// set the player's information label back to its normal color
        
        // enable the goal sum button and the textfield on the goal sum panel
        jTextField1.setEnabled(true);
        goalsumbutton.setEnabled(true);
        
        jPanel1.setVisible(false);// make the player's information panel invisible
        jPanel2.setVisible(true);// make the goal sum panel visible
       
    }//GEN-LAST:event_sumMouseClicked

    private void sumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumMouseEntered
        // once the mouse hovers over the label 'Goal sum' change the color of the label and the text
        if (colour6){
        jLabel8.setForeground(Color.decode("#7289DA"));
        sum.setBackground(panelHL);
        }
    }//GEN-LAST:event_sumMouseEntered

    private void sumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumMouseExited
        // once the mouse stops hovering over the 'Goal sum' return the colors back to normal
          if (colour6){
            sum.setBackground(panelBG);
          }
          jLabel8.setForeground(Color.white);
    }//GEN-LAST:event_sumMouseExited

    private void player1namebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1namebuttonActionPerformed
        // once the enter button has been pressed for the player 1 
        if (!(player1.getText().equals(""))){ // check if the textfield isn't empty.
            player1name = player1.getText();//if it isn't then change the variable to whatever is inside the textfield and clear the textfiield
            player1.setText(null);
        }
        else {// if it is empty show an error panel
            JOptionPane.showMessageDialog(null,"Sorry that is not a valid input","User Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_player1namebuttonActionPerformed

    private void player2namebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2namebuttonActionPerformed
        // once the enter button has been pressed for the player 2
        if (!(player2.getText().equals(""))){// check if the textfield isn't empty.
            player2name = player2.getText();//if it isn't then change the variable to whatever is inside the textfield and clear the textfiield
            player2.setText(null);
        }
        else {// if it is empty show an error panel
            JOptionPane.showMessageDialog(null,"Sorry that is not a valid input","User Error",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_player2namebuttonActionPerformed

    private void goalsumbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goalsumbuttonActionPerformed
        // once the goal sum button is clicked 
        try{ // check for two conditions, wether if the value in the textfield is a number and if it is in the range
            if (Integer.parseInt(jTextField1.getText()) >= 5 && Integer.parseInt(jTextField1.getText()) <= 15 ){
                goalsum = Integer.parseInt(jTextField1.getText());//taking the value in the textfield and changing it to a number
                jTextField1.setText(null);
            }
            
            else{
                throw new NumberFormatException("Out of range");//if the value isn't in between the range show error
            }
        }
        catch (NumberFormatException e){ //if the value iin the textfield isn't a number show an error panel
            JOptionPane.showMessageDialog(null,"Sorry thats not a valid number","Number Error",JOptionPane.ERROR_MESSAGE);
            jTextField1.setText(null);
        }
    }//GEN-LAST:event_goalsumbuttonActionPerformed

    private void orangeplayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeplayer1ActionPerformed
        //<editor-fold defaultstate="collapsed" desc="Color Events">
        // check if the other player choose this color. if so then show error panel. if not then change player's variable for color with the new color.
        if (player2color.equals("#FF8F00")){
            JOptionPane.showMessageDialog(null,"Sorry " + player2name + " already took this color.","Color Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            player1color="#FF8F00";
        }
    }//GEN-LAST:event_orangeplayer1ActionPerformed

    private void purpleplayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleplayer1ActionPerformed
        // check if the other player choose this color. if so then show error panel. if not then change player's variable for color with the new color.
        if (player2color.equals("#EC00FF")){
            JOptionPane.showMessageDialog(null,"Sorry " + player2name + " already took this color.","Color Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            player1color="#EC00FF";
        }    
    }//GEN-LAST:event_purpleplayer1ActionPerformed

    private void greenplayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenplayer1ActionPerformed
        // check if the other player choose this color. if so then show error panel. if not then change player's variable for color with the new color.
        if (player2color.equals("#08FF00")){
            JOptionPane.showMessageDialog(null,"Sorry " + player2name + " already took this color.","Color Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
         player1color="#08FF00";
        }
    }//GEN-LAST:event_greenplayer1ActionPerformed

    private void blueplayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueplayer1ActionPerformed
        // check if the other player choose this color. if so then show error panel. if not then change player's variable for color with the new color.
        if (player2color.equals("#004DFF")){
            JOptionPane.showMessageDialog(null,"Sorry " + player2name + " already took this color.","Color Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            player1color="#004DFF";
        }
    }//GEN-LAST:event_blueplayer1ActionPerformed

    private void redplayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redplayer2ActionPerformed
        // check if the other player choose this color. if so then show error panel. if not then change player's variable for color with the new color.
        if (player1color.equals("#FF0000")){
            JOptionPane.showMessageDialog(null,"Sorry " + player1name + " already took this color.","Color Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            player2color="#FF0000";
        }
    }//GEN-LAST:event_redplayer2ActionPerformed

    private void orangeplayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeplayer2ActionPerformed
        // check if the other player choose this color. if so then show error panel. if not then change player's variable for color with the new color.
        if (player1color.equals("#FF8F00")){
            JOptionPane.showMessageDialog(null,"Sorry " + player1name + " already took this color.","Color Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            player2color="#FF8F00";
        }
    }//GEN-LAST:event_orangeplayer2ActionPerformed

    private void purpleplayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleplayer2ActionPerformed
        // check if the other player choose this color. if so then show error panel. if not then change player's variable for color with the new color.
        if (player1color.equals("#EC00FF")){
            JOptionPane.showMessageDialog(null,"Sorry " + player1name + " already took this color.","Color Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            player2color="#EC00FF";
        }
    }//GEN-LAST:event_purpleplayer2ActionPerformed

    private void greenplayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenplayer2ActionPerformed
        // check if the other player choose this color. if so then show error panel. if not then change player's variable for color with the new color.
        if (player1color.equals("#08FF00")){
            JOptionPane.showMessageDialog(null,"Sorry " + player1name + " already took this color.","Color Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            player2color="#08FF00";
        }
    }//GEN-LAST:event_greenplayer2ActionPerformed

    private void blueplayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueplayer2ActionPerformed
        // check if the other player choose this color. if so then show error panel. if not then change player's variable for color with the new color.
        if (player1color.equals("#004DFF")){
            JOptionPane.showMessageDialog(null,"Sorry " + player1name + " already took this color.","Color Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            player2color="#004DFF";
        }
        //</editor-fold>
    }//GEN-LAST:event_blueplayer2ActionPerformed

    private void BackBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBMouseEntered
        // when the mouse hover's over the 'back' text change its color to red
         BackB.setForeground(Color.red);
    }//GEN-LAST:event_BackBMouseEntered

    private void BackBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBMouseExited
        // once the mouse stops hovering return the color back to normal for the 'back'
        BackB.setForeground(Color.white);
    }//GEN-LAST:event_BackBMouseExited

    private void BackBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBMouseClicked
        // once 'back' is clicked close the settings jframe and open the main menu jframe
        SudTacOku Info = new SudTacOku();   
        Info.setVisible(true);
        
        systemExit();
    }//GEN-LAST:event_BackBMouseClicked

    //changes the color to a different thing
    void setColor (JPanel panel){
        panel.setBackground(panelHG);
    }
    //to change the color back to normal
    void resetColor (JPanel panel){
        panel.setBackground(panelBG);
    }
    
    public void systemExit(){
        WindowEvent winCloseing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winCloseing);
    }
    
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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackB;
    private javax.swing.JLabel CloseX;
    private javax.swing.JLayeredPane FrameDrag1;
    private javax.swing.JLabel MiniM;
    private javax.swing.JButton blueplayer1;
    private javax.swing.JButton blueplayer2;
    private javax.swing.JButton goalsumbutton;
    private javax.swing.JButton greenplayer1;
    private javax.swing.JButton greenplayer2;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton orangeplayer1;
    private javax.swing.JButton orangeplayer2;
    private javax.swing.JTextField player1;
    private javax.swing.JButton player1namebutton;
    private javax.swing.JTextField player2;
    private javax.swing.JButton player2namebutton;
    private javax.swing.JButton purpleplayer1;
    private javax.swing.JButton purpleplayer2;
    private javax.swing.JButton redplayer1;
    private javax.swing.JButton redplayer2;
    private javax.swing.JPanel sidepane;
    private javax.swing.JPanel sum;
    // End of variables declaration//GEN-END:variables
}
