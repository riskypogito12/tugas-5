/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.bio.dao;

/**
 *
 * @author Muhammad Ilyas
 */
import id.bio.database.DatabaseMySQL;
import id.bio.model.Jurusan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class JurusanDAOImpl implements JurusanDAO {
public boolean insert (Jurusan j) {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose
}
public boolean update (Jurusan j) {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose
}
public boolean delete (Jurusan j) {
throw new UnsupportedOperationException ("Not supported yet."); //To change body of generated methods, choose
}
public List<Jurusan> getAllJurusan () {
List<Jurusan> categories = new ArrayList<Jurusan>();
String sql = "Select * from jurusan";
try {
if (DatabaseMySQL.getConnection()==null) { return null;
}else{
PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement (sql);
ResultSet rs =
statement.executeQuery();
while (rs.next()) {
Jurusan c = new Jurusan ( rs.getString(1), rs.getString(2) );
categories.add(c);
}
statement.close();
}
} catch (Exception ex) { }
return categories;
}
public Jurusan getByID (String id) { throw new UnsupportedOperationException("Not supported yet."); } //To char
@Override
public List<Jurusan> getByName (String name) { throw new UnsupportedOperationException("Not supported yet."); } 
}