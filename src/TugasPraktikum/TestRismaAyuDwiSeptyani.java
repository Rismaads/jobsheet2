package TugasPraktikum;


import TugasPraktikum.RismaAyuDwiSeptyani;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risma
 */
public class TestRismaAyuDwiSeptyani {
     public static void main(String[] args){
      RismaAyuDwiSeptyani biodata = new  RismaAyuDwiSeptyani();
    biodata.setnamaAyah("Sutarjo");
    biodata.setnamaIbu("Widayanah");
    biodata.setnamaSendiri("Risma");
    biodata.setnamaSaudara("Fandy");
    biodata.setalamat("jln.Danau Buyan G7A.17");
    biodata.sethobi("Berolahraga");
    biodata.setcitacita("Bekerja di Perusaaan ternama dan membahagiakan keluarga");
    biodata.setumur(16);
     
    
    System.out.println("namaAyah    :" + biodata.getnamaAyah());
    System.out.println("namaIbu     : " + biodata.getnamaIbu());
    System.out.println("namaSendiri : " + biodata.getnamaSendiri());
    System.out.println("namaSaudara : " + biodata.getnamaSendiri());
    System.out.println("alamat      : " + biodata.getalamat());
    System.out.println("hobi        : " + biodata.gethobi());
    System.out.println("citacita    : " + biodata.getcitacita());
    System.out.println("umur        : " + biodata.getumur());
     }
}
