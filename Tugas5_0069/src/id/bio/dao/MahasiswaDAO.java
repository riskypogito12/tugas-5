/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.bio.dao;

/**
 *
 * @author Muhammad Ilyas
 */
import id.bio.model.Mahasiswa;
import java.util.List;

public interface MahasiswaDAO {
public boolean insert (Mahasiswa m);
public boolean update (Mahasiswa m);
public boolean delete (Mahasiswa m);
public List<Mahasiswa> getAllMahasiswa();
public Mahasiswa getByID (String nim);
public List<Mahasiswa> getByName (String name);
}