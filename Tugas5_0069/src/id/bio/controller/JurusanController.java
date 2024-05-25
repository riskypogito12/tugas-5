/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.bio.controller;

/**
 *
 * @author Muhammad Ilyas
 */
import id.bio.dao.JurusanDAO;
import id.bio.dao.JurusanDAOImpl;
import id.bio.model. Jurusan;
import java.util.List;

public class JurusanController {
private JurusanDAO dao = new JurusanDAOImpl();
public List<Jurusan> getAllData() {
return dao.getAllJurusan();
}

}