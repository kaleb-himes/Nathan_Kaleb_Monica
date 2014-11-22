/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nathan_kaleb_monica;

import java.awt.event.KeyEvent;

/**
 *
 * @author khimes
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popularLabel = new javax.swing.JLabel();
        recentLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();
        Artists = new javax.swing.JTextField();
        searchBut = new javax.swing.JButton();
        Song = new javax.swing.JTextField();
        Years = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SearchSize = new javax.swing.JTextField();
        Minus = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        displayPanel = new javax.swing.JPanel();
        resultScroll = new javax.swing.JScrollPane();
        Songs = new javax.swing.JTextArea();
        recentScroll = new javax.swing.JScrollPane();
        artist = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        year = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Recent = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(800, 500));

        popularLabel.setText("Artist");

        recentLabel.setText("Songs");

        resultLabel.setText("Year");

        searchPanel.setMaximumSize(new java.awt.Dimension(500, 210));
        searchPanel.setMinimumSize(new java.awt.Dimension(500, 210));
        searchPanel.setPreferredSize(new java.awt.Dimension(500, 210));

        Artists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistsActionPerformed(evt);
            }
        });
        Artists.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ArtistsKeyPressed(evt);
            }
        });

        searchBut.setText("Search");
        searchBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButMouseClicked(evt);
            }
        });
        searchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButActionPerformed(evt);
            }
        });

        Song.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SongKeyPressed(evt);
            }
        });

        Years.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YearsKeyPressed(evt);
            }
        });

        jLabel1.setText("Artist");

        jLabel2.setText("Song");

        jLabel3.setText("Year");

        SearchSize.setEditable(false);
        SearchSize.setText("10");
        SearchSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchSizeActionPerformed(evt);
            }
        });

        Minus.setText("<");
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });

        Plus.setText(">");
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });

        jLabel5.setText("# Results");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(Artists, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Song, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Years, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel2)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(searchBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(SearchSize, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(32, 32, 32))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Artists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBut)
                    .addComponent(Song, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Years, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Minus)
                    .addComponent(Plus)
                    .addComponent(SearchSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        displayPanel.setMaximumSize(new java.awt.Dimension(500, 298));
        displayPanel.setMinimumSize(new java.awt.Dimension(500, 298));
        displayPanel.setPreferredSize(new java.awt.Dimension(500, 298));

        Songs.setEditable(false);
        Songs.setFocusable(false);
        Songs.setMinimumSize(new java.awt.Dimension(250, 300));
        Songs.setName(""); // NOI18N
        resultScroll.setViewportView(Songs);

        artist.setEditable(false);
        artist.setColumns(20);
        artist.setFocusable(false);
        recentScroll.setViewportView(artist);

        year.setEditable(false);
        jScrollPane1.setViewportView(year);

        Recent.setEditable(false);
        Recent.setColumns(20);
        Recent.setTabSize(0);
        jScrollPane2.setViewportView(Recent);

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recentScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(resultScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(recentScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jLabel4.setText("Recent Search");

        jMenu1.setText("File");

        jMenuItem1.setText("Quit");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(popularLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(recentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(popularLabel)
                    .addComponent(recentLabel)
                    .addComponent(resultLabel)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArtistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistsActionPerformed

    }//GEN-LAST:event_ArtistsActionPerformed

    private void searchButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButMouseClicked
        executeSearch();
    }//GEN-LAST:event_searchButMouseClicked

    private void ArtistsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ArtistsKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            /* Save whatever was typed in the search area to the search area */
            Artists.setText(Artists.getText());
            Song.setText(Song.getText());
            Years.setText(Years.getText());
            /* Transfer focus to the search button for user gratification */
            searchBut.requestFocusInWindow();
            /* Execute some sql query based on the user input */
            executeSearch();
        }
    }//GEN-LAST:event_ArtistsKeyPressed

    private void searchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButActionPerformed

    private void SongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SongKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            /* Save whatever was typed in the search area to the search area */
            Artists.setText(Artists.getText());
            Song.setText(Song.getText());
            Years.setText(Years.getText());
            /* Transfer focus to the search button for user gratification */
            searchBut.requestFocusInWindow();
            /* Execute some sql query based on the user input */
            executeSearch();
        }
    }//GEN-LAST:event_SongKeyPressed

    private void YearsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YearsKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            /* Save whatever was typed in the search area to the search area */
            Artists.setText(Artists.getText());
            Song.setText(Song.getText());
            Years.setText(Years.getText());
            /* Transfer focus to the search button for user gratification */
            searchBut.requestFocusInWindow();
            /* Execute some sql query based on the user input */
            executeSearch();
        }
    }//GEN-LAST:event_YearsKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
        int size = Integer.parseInt(SearchSize.getText());
        if (size > 9) {
            size = size - 10;
            String strI = "" + size;
            GUI.SearchSize.setText(strI);
        } else {
            GUI.SearchSize.setText("0");
        }
    }//GEN-LAST:event_MinusActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        int size = Integer.parseInt(SearchSize.getText());
        size = size + 10;
        String strI = "" + size;
        GUI.SearchSize.setText(strI);
    }//GEN-LAST:event_PlusActionPerformed

    private void SearchSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchSizeActionPerformed

    private void executeSearch() {
        update();
    }

    public static void update() {
        artist.setText("");
        Songs.setText("");
        year.setText("");
        if(Artists.getText().equals("") && Song.getText().equals("") && Years.getText().equals("")){
            System.out.println();
        }
        else if (Artists.getText().equals("") && Song.getText().equals("")) {
            Recent.append(Years.getText() + "\n");
            UpdateYear.update_year();
        }
        else if (Years.getText().equals("") && Song.getText().equals("")) {
            Recent.append(Artists.getText() + "\n");
            UpdateArtist.update_artist();
        }
        else if (Years.getText().equals("") && Artists.getText().equals("")) {
            Recent.append(Song.getText() + "\n");
            UpdateSong.update_song();
        }
        else if (Years.getText().equals("")) {
            Recent.append(Artists.getText() +", "+ Song.getText()+"\n");
            UpdateArtistSong.update_artistsong();
        }
        else if (Songs.getText().equals("")) {
            Recent.append(Artists.getText() +", "+ Years.getText()+"\n");
            UpdateArtistYear.update_artistyear();
        }
        else if (Artists.getText().equals("")) {
            Recent.append(Songs.getText() +", "+ Years.getText()+"\n");
            UpdateSongYear.update_songyear();
        }
        else{
            Recent.append(Artists.getText()+", "+Songs.getText() +", "+ Years.getText()+"\n");
            UpdateArtistSongYear.update_artistsongyear();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Artists;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Plus;
    public static javax.swing.JTextArea Recent;
    public static javax.swing.JTextField SearchSize;
    public static javax.swing.JTextField Song;
    public static javax.swing.JTextArea Songs;
    public static javax.swing.JTextField Years;
    public static javax.swing.JTextArea artist;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel popularLabel;
    private javax.swing.JLabel recentLabel;
    private javax.swing.JScrollPane recentScroll;
    private javax.swing.JLabel resultLabel;
    public static javax.swing.JScrollPane resultScroll;
    private javax.swing.JButton searchBut;
    private javax.swing.JPanel searchPanel;
    public static javax.swing.JTextArea year;
    // End of variables declaration//GEN-END:variables
}
