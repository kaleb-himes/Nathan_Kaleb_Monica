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
import static nathan_kaleb_monica.GUI.Years;

/**
 *
 * @author Nathan
 */
public class UpdateSong {
    public static void update_song() {
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

                Statement st = connection.createStatement();
                String so = Song.getText();
                int result = Integer.parseInt(SearchSize.getText());
                Song.setText("");
                ResultSet res = st.executeQuery("Select * From Track_year  Where song_title='" + so + "'limit "+result+"");//artist_name='someartist'

                while (res.next()) {

                    String artist_name = res.getString("artist_name");
                    String song_title = res.getString("song_title");
                    int years = res.getInt("year");

                    System.out.println(song_title);
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
