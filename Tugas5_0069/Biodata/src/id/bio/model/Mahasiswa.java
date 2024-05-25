/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.bio.model;

/**
 *
 * @author Muhammad Ilyas
 */
public class Mahasiswa {
private String stambuk, nama;
private Jurusan prodi;
public Mahasiswa (String stambuk, String nama, Jurusan prodi) {
this.stambuk = stambuk;
this.nama = nama;
this.prodi = prodi;
}
public Mahasiswa (String stambuk) {
this.stambuk = stambuk;
}
public String getStambuk () {
return stambuk;
}
public void setStambuk (String stambuk) {
this.stambuk = stambuk;
}
public String getNama () {
return nama;
}
public void setNama (String nama) {
this.nama = nama;
}
public Jurusan getProdi () {
return prodi;
}
public void setProdi (Jurusan prodi) {
this.prodi = prodi;
}
}