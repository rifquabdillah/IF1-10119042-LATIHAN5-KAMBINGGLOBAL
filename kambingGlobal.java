/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

/**
 *
 * @author Stks
 */
public class kambingGlobal {
//variable jumlahKambing menjadi variable instance

int jumlahKambing = 88;
//method untuk menampilkan jumlah kambing
public void getJumlahKambing(){
    System.out.println("Jumlah kambing: " + jumlahKambing);
}

public void tambahKambing(){
    jumlahKambing = jumlahKambing + 5;
    System.out.println("jumlah kambing setelah ditambah: " +jumlahKambing);
}
public static void main(String[] args){
    kambingGlobal kambingSusu = new kambingGlobal();
    
    //menampilkan jumlah kambing yang ada saat program pertama x berjalan
    kambingSusu.getJumlahKambing();
    
    //menambah satu kambing
    kambingSusu.tambahKambing();
    
    //menampilkan jumlah kambing yang ada
    kambingSusu.getJumlahKambing();
}
}
