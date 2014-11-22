/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nathan_kaleb_monica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static nathan_kaleb_monica.GUI.Artists;
import static nathan_kaleb_monica.GUI.Recent;
import static nathan_kaleb_monica.GUI.SearchSize;
import static nathan_kaleb_monica.GUI.Song;
import static nathan_kaleb_monica.GUI.Songs;
import static nathan_kaleb_monica.GUI.Years;

/**
 *
 * @author Nathan
 */
public class UpdateData {

    public static void update_data() {
        System.out.println("-------- MySQL JDBC Connection Testing ------------");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }

        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/SongData", "nathan", "");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            try {
                String art = null, song = null;
                int year = 0;
                Statement st = connection.createStatement();
                if (Artists.getText().equals("")) {
                    System.out.println("No Artist");
                } else {
                    art = Artists.getText();
                    Recent.append(Artists.getText() + " ");
                }

                if (Songs.getText().equals("")) {
                    System.out.println("No Song");
                } else {
                    song = Artists.getText();
                    Recent.append(Song.getText() + " ");
                }

                if (Years.getText().equals("")) {
                    System.out.println("No Year");
                } else {
                    year = Integer.parseInt(Years.getText());
                    Recent.append(Years.getText() + " ");
                }
                Recent.append("\n");
                int result = Integer.parseInt(SearchSize.getText());
                Artists.setText("");
                Song.setText("");
                Years.setText("");

                GUI.year.setText("");
                GUI.artist.setText("");
                GUI.Songs.setText("");
                //ResultSet res = st.executeQuery("Select * From Track_year Where (artist_name like'%" + art + "%' or artist_name like'" + art + "%' ) or (song_title like'%" + song + "%' or song_title like'" + song + "%' ) or year = '" + year + "'limit " + result + "");//artist_name='someartist'
                ResultSet res = st.executeQuery("Select * From Track_year Where artist_name ='" + art + "'or song_title= '" + song + "'or year = '" + year + "'limit " + result + "");//artist_name='someartist'
                while (res.next()) {

                    String artist_name = res.getString("artist_name");
                    String song_title = res.getString("song_title");
                    int years = res.getInt("year");
                    GUI.year.append(years + "\n");
                    GUI.artist.append(artist_name + "\n");
                    GUI.Songs.append(song_title + "\n");

                }
            } catch (SQLException ex) {
                // Logger.getLogger(UpdateResults.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
