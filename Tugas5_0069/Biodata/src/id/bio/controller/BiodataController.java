/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.bio.controller;
import id.bio.dao.MahasiswaDAO;
import id.bio.dao.MahasiswaDAOImpl;
import id.bio.model.CrudState;
import id.bio.model.Mahasiswa;
import java.util.List;
import java.util.Observable;
/**
 *
 * @author Muhammad Ilyas
 */

public class BiodataController extends Observable {
private MahasiswaDAO dao = new MahasiswaDAOImpl();
private CrudState crudState;
public void setDao (MahasiswaDAO dao) {
this.dao = dao;
}
public List<Mahasiswa> getAllMahasiswa () {
return dao.getAllMahasiswa();
}
public void manipulate (Mahasiswa m, CrudState c) {
boolean result = false;
switch (c) {
case INSERT:
result = dao.insert(m);
break;
case UPDATE:
result = dao.update(m);
break;
case DELETE:
result = dao.delete(m);
break;
}
setChanged();
if (result) {
notifyObservers (m);
}else{
notifyObservers();
}
}
public CrudState getCrudState () {
return crudState;
}
}