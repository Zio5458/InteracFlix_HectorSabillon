
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class Principal extends javax.swing.JFrame {

    //prueba
    private int posicion = 0;
    private int sum = 1;
    private int currentClip = 0;

    private String mensajes[] = {"m1", "m2", "m3", "m4", "m5", "m6", "m7"};
    //metodo establecido
    private boolean luigi = false;
    private static String usuario;
    private boolean muted = false;
    private final JFXPanel jfxpanel = new JFXPanel();
    private MediaPlayer mp;
    private final JFXPanel mario = new JFXPanel();
    private MediaPlayer mp_mario;
    private final String d = "./src//Clips1/";
    private ArrayList<File> clips;
    private boolean isPlaying = false;
    private boolean primera = true;
    private ArrayList<File> clips_L;
    private ArrayList<File> clips_M;
    private boolean isLuigi;
    private boolean first = true;

    public Principal(String usuario) {
        /*mp_mario.dispose();
        storyPlay(clips, mensajes);*/
        initComponents();
        setVisible(false);
        setVisible(true);
        crearEscena();
        setLocationRelativeTo(null);
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(jfxpanel, BorderLayout.CENTER);
        files();
        clipDistribution();
        opcion1.setVisible(false);
        opcion2.setVisible(false);
    }

    public void storyPlay(ArrayList<File> clips, String mensajes[]) {
        if (isLuigi){
            playMario(clips_L.get(posicion));
        } else {
            playMario(clips_M.get(posicion));
        }
        //playMario(clips.get(posicion));
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                mp_mario.setOnEndOfMedia(() -> {
                    currentClip++;
                    if (currentClip < 3) {
                        opcion1.setText(mensajes[posicion]);
                        opcion2.setText(mensajes[posicion + 1]);
                        enable();

                        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play.png")));
                    }
                });
            }

        });

    }

    public void skip() {

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                currentClip++;
                if (currentClip < 3) {
                    opcion1.setText(mensajes[posicion]);
                    opcion2.setText(mensajes[posicion + 1]);
                    enable();

                    play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play.png")));
                }

            }

        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Player_M = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        PlayerPanel = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        skip = new javax.swing.JLabel();
        undo = new javax.swing.JLabel();
        reload = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        opcion1 = new javax.swing.JButton();
        opcion2 = new javax.swing.JButton();
        play = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        imagen_perfil = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        cerrar_sesion = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tmmvlabel = new javax.swing.JLabel();

        Player_M.setUndecorated(true);
        Player_M.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PlayerPanel.setBackground(new java.awt.Color(51, 51, 51));
        PlayerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l1.setText("Presione el boton");
        PlayerPanel.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        l3.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 0));
        l3.setText("L");
        PlayerPanel.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        l2.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 0, 51));
        l2.setText("P");
        PlayerPanel.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

        l4.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        l4.setForeground(new java.awt.Color(51, 255, 0));
        l4.setText("A");
        PlayerPanel.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, -1, -1));

        l5.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        l5.setForeground(new java.awt.Color(0, 51, 255));
        l5.setText("Y");
        PlayerPanel.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, -1, -1));

        l6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l6.setText("Para comenzar");
        PlayerPanel.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, -1, -1));

        jPanel5.add(PlayerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        skip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/skip.png"))); // NOI18N
        skip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        skip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                skipMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                skipMouseEntered(evt);
            }
        });
        jPanel5.add(skip, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 720, -1, -1));

        undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo.png"))); // NOI18N
        undo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(undo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 720, -1, -1));

        reload.setForeground(new java.awt.Color(255, 255, 255));
        reload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reload.png"))); // NOI18N
        reload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reloadMouseClicked(evt);
            }
        });
        jPanel5.add(reload, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 740, 100, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit-png.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 740, -1, -1));

        opcion1.setBackground(new java.awt.Color(0, 0, 255));
        opcion1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        opcion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcion1.setEnabled(false);
        opcion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcion1MouseClicked(evt);
            }
        });
        jPanel5.add(opcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 730, 210, 80));

        opcion2.setBackground(new java.awt.Color(255, 0, 0));
        opcion2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        opcion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcion2.setEnabled(false);
        opcion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcion2MouseClicked(evt);
            }
        });
        jPanel5.add(opcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 730, 210, 80));

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play.png"))); // NOI18N
        play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playMouseClicked(evt);
            }
        });
        jPanel5.add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 730, 80, 80));

        Player_M.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 820));

        jPopupMenu1.setBackground(new java.awt.Color(204, 0, 51));
        jPopupMenu1.setForeground(new java.awt.Color(0, 0, 0));

        imagen_perfil.setBackground(new java.awt.Color(204, 0, 51));
        imagen_perfil.setForeground(new java.awt.Color(0, 0, 0));
        imagen_perfil.setText("Cambiar Imagen de Perfil");
        imagen_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen_perfilActionPerformed(evt);
            }
        });
        jPopupMenu1.add(imagen_perfil);
        jPopupMenu1.add(jSeparator1);

        cerrar_sesion.setText("jMenuItem1");
        cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sesionActionPerformed(evt);
            }
        });
        jPopupMenu1.add(cerrar_sesion);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -37, -1, 100));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 630, 360));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rojo_m.jpeg"))); // NOI18N

        userLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_icon.png"))); // NOI18N
        userLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userLabelMouseEntered(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("The Mario Bros. Movie");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("2023");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nintendo, Illumination");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Universal Pictures");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Mutear Trailer");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Disponible Ahora:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(376, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/m_thumbnail.jpg"))); // NOI18N

        tmmvlabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tmmvlabel.setForeground(new java.awt.Color(255, 255, 255));
        tmmvlabel.setText("The Super Mario Bros. Movie - The Videogame");
        tmmvlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tmmvlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmmvlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tmmvlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tmmvlabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tmmvlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(1081, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(tmmvlabel)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userLabel)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLabelMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_userLabelMouseEntered

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (muted) {
            mp.setVolume(0.2);
            muted = false;
            jButton1.setText("Mutear Trailer");
            jButton1.setBackground(Color.red);
        } else {
            mp.setVolume(0);
            muted = true;
            jButton1.setBackground(Color.gray);
            jButton1.setText("Muteado");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void tmmvlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmmvlabelMouseEntered
        tmmvlabel.setForeground(Color.red);
    }//GEN-LAST:event_tmmvlabelMouseEntered

    private void tmmvlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmmvlabelMouseExited
        tmmvlabel.setForeground(Color.white);
    }//GEN-LAST:event_tmmvlabelMouseExited

    private void tmmvlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmmvlabelMouseClicked
        mp.pause();
        mp.setVolume(0);

        Player_M.pack();
        Player_M.setModal(true);
        Player_M.setLocationRelativeTo(this);
        PlayerPanel.setLayout(new BorderLayout());
        PlayerPanel.add(mario, BorderLayout.CENTER);
        Player_M.setVisible(true);
        /*storyPlay(clips, mensajes);
        mp_mario.pause();*/
    }//GEN-LAST:event_tmmvlabelMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        currentClip = 0;
        posicion = 0;
        sum = 1;
        mp_mario.dispose();
        Player_M.dispose();

        disable();

        mp.play();

        if (muted) {
            mp.setVolume(0);
        } else {
            mp.setVolume(0.2);
        }
        isPlaying = false;
        primera = true;

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play.png")));

    }//GEN-LAST:event_jLabel2MouseClicked

    private void opcion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcion1MouseClicked
        disable();
        if (first){
            first = false;
            isLuigi = false;
        }
        posicion += sum;
        sum++;

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play.png")));
        if (isLuigi){
            storyPlay(clips_L, mensajes);
        } else {
            storyPlay(clips_M, mensajes);
        }
        //storyPlay(clips, mensajes);

    }//GEN-LAST:event_opcion1MouseClicked

    private void playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseClicked
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                if (isPlaying && !primera) {
                    mp_mario.pause();
                    play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play.png")));
                    isPlaying = false;
                } else if (!isPlaying && !primera) {
                    mp_mario.play();
                    mp_mario.setRate(1.0);
                    play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pause.jpg")));
                    isPlaying = true;
                }
                if (primera) {
                    primera = false;
                    isPlaying = true;
                    playMario(new File("./src/Clips1/clip1.mp4"));
                    play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pause.jpg")));
                }
                l1.setVisible(false);
                l3.setVisible(false);
                l2.setVisible(false);
                l4.setVisible(false);
                l5.setVisible(false);
                l6.setVisible(false);
            }

        });

    }//GEN-LAST:event_playMouseClicked

    private void opcion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcion2MouseClicked
        disable();
        posicion += (sum + 1);
        sum++;
        if (first){
            first = false;
            isLuigi = true;
        }
        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play.png")));
        if (isLuigi){
            storyPlay(clips_L, mensajes);
        } else {
            storyPlay(clips_M, mensajes);
        }
        //storyPlay(clips, mensajes);

    }//GEN-LAST:event_opcion2MouseClicked

    private void skipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skipMouseClicked
        mp_mario.dispose();
        skip();
    }//GEN-LAST:event_skipMouseClicked

    private void skipMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skipMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_skipMouseEntered

    private void reloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reloadMouseClicked
        mp_mario.dispose();
        if (first){
            Platform.runLater(new Runnable() {
            @Override
            public void run() {
                playMario(new File("./src/Clips1/clip1.mp4"));
                play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pause.jpg")));
                mp_mario.setStopTime(Duration.seconds(92.0));
                mp_mario.setOnEndOfMedia(() -> {
                        opcion1.setText(mensajes[posicion]);
                        opcion2.setText(mensajes[posicion + 1]);
                        enable();
                        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play.png")));
                });
            }

        });
            
        } else {
            if (isLuigi){
                storyPlay(clips_L, mensajes);
            } else {
                storyPlay(clips_M, mensajes);
            }
        }
        //storyPlay(clips, mensajes);
    }//GEN-LAST:event_reloadMouseClicked

    private void imagen_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen_perfilActionPerformed
        
    }//GEN-LAST:event_imagen_perfilActionPerformed

    private void cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sesionActionPerformed
        this.dispose();
        Loading loading = new Loading();
    }//GEN-LAST:event_cerrar_sesionActionPerformed
/*
    public String setTextOp1() {
        switch (choice) {
            case 0: {
                return "Investigar";
            }
            case 1: {
                return "Punto de Vista Mario";
            }
            case 2: {
                return "Correr hasta donde llegue";
            }
            default: {
                return "";
            }
        }
    }

    public String setTextOp2() {
        switch (choice) {
            case 0: {
                return "Ignorar";
            }
            case 1: {
                return "Punto de Vista Luigi";
            }
            case 2: {
                return "Buscar refugio";
            }
            default: {
                return "";
            }
        }
    }
*/
    public void disable() {
        opcion1.setEnabled(false);
        opcion2.setEnabled(false);
        opcion1.setVisible(false);
        opcion2.setVisible(false);
    }

    public void enable() {
        opcion1.setEnabled(true);
        opcion2.setEnabled(true);
        opcion1.setVisible(true);
        opcion2.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal(usuario).setVisible(true);
            }
        });
    }

    private void crearEscena() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                File trailer_m = new File("./src/Clips1/trailerM.mp4");
                mp = new MediaPlayer(new Media(trailer_m.toURI().toString()));
                jfxpanel.setScene(new Scene(new Group(new MediaView(mp))));
                mp.setCycleCount(1);
                mp.setVolume(0.2);
                mp.play();
            }
        });

    }

    private void files() {
        File directorio = new File(d);
        File[] archivos = directorio.listFiles();
        clips = new ArrayList(Arrays.asList(archivos));
        for (int i = 0; i < clips.size(); i++) {
            if (clips.get(i).getName().equals("trailerM.mp4")) {
                clips.remove(i);
            }
        }
    }

    private void clipDistribution(){
        clips_L = new ArrayList();
        clips_L.add(new File("./src/Clips1/clipLuigi1.mp4"));
        clips_L.add(new File("./src/Clips1/clipLuigi2A.mp4"));
        clips_L.add(new File("./src/Clips1/clipLuigi2B.mp4"));
        clips_L.add(new File("./src/Clips1/clipLuigi3A.mp4"));
        clips_L.add(new File("./src/Clips1/clipLuigi3B.mp4"));
        clips_L.add(new File("./src/Clips1/clipLuigi3C.mp4"));
        clips_L.add(new File("./src/Clips1/clipLuigi3D.mp4"));
    }
    
    private void playMario(File clip) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                mp_mario = new MediaPlayer(new Media(clip.toURI().toString()));
                mario.setScene(new Scene(new Group(new MediaView(mp_mario))));
                mp_mario.setCycleCount(1);
                mp_mario.setVolume(0.2);
                mp_mario.play();
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PlayerPanel;
    private javax.swing.JDialog Player_M;
    private javax.swing.JMenuItem cerrar_sesion;
    private javax.swing.JMenuItem imagen_perfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JButton opcion1;
    private javax.swing.JButton opcion2;
    private javax.swing.JButton play;
    private javax.swing.JLabel reload;
    private javax.swing.JLabel skip;
    private javax.swing.JLabel tmmvlabel;
    private javax.swing.JLabel undo;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
