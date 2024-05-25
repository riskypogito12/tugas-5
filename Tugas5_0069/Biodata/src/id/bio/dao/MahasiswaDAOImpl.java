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
import id.bio.model.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

public class MahasiswaDAOImpl implements MahasiswaDAO{
@Override
public boolean insert (Mahasiswa m) {
String sql = "INSERT INTO mahasiswa values (?, ?, ?)";
try {
PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement (sql);
// Statement st = DatabaseMySQL.getConnection().prepareStatement (sql);
statement.setString(1, m.getStambuk());
statement.setString(2, m.getNama());
statement.setInt(3, Integer.parseInt(m.getProdi().getId()));
int row = statement.executeUpdate();
if (row > 0) {
return true;
}
statement.close();
} catch (Exception ex) {
Logger.getLogger (Mahasiswa.class.getName()).log(Level. SEVERE, null, ex);
}
return false;
}
@Override
public boolean update (Mahasiswa m) {
String sql = "UPDATE mahasiswa set nama=?,prodi=? where nim=?";
try {
PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement (sql);
statement.setString(1, m.getNama());
statement.setInt(2, Integer.parseInt(m.getProdi ().getId()));
statement.setString(3, m.getStambuk());
int row = statement.executeUpdate();
if (row > 0) {
return true;
}
statement.close();
} catch (Exception ex) {
Logger.getLogger (Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
}
return false;
}
@Override
public boolean delete (Mahasiswa m) {
String sql = "delete from mahasiswa where nim=?";
try {
PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement (sql);
statement.setString(1, m.getStambuk());
int row = statement.executeUpdate();
if (row > 0) {
return true;
}
statement.close();
} catch (Exception ex) {
Logger.getLogger (Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
}
return false;
}
@Override
public List<Mahasiswa> getAllMahasiswa () {
List <Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
String sql = "Select * from mahasiswa inner join jurusan on jurusan.id=mahasiswa.prodi";
try {
if (DatabaseMySQL.getConnection()==null) {
return null;
}else{
PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement (sql);
ResultSet rs = statement.executeQuery();
while (rs.next()) {
Mahasiswa p = new Mahasiswa (
rs.getString(1), rs.getString(2), new Jurusan(rs.getString(3),rs.getString(4))
);
mahasiswa.add(p);
}
statement.close();
}
} catch (Exception ex) {
Logger.getLogger (Mahasiswa.class.getName()).log(Level. SEVERE, null, ex);
}
return mahasiswa;
}
@Override
public Mahasiswa getByID (String nim) {
throw new UnsupportedOperationException ("Not supported yet."); //To change body of generated
}
@Override
public List<Mahasiswa> getByName (String name) {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated
}
}