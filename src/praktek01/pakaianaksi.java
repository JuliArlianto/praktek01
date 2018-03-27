/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author ijul
 */
public class pakaianaksi {
    public static void main(String[] args) {
        
    Pakaian Baju = new Pakaian();
    Pakaian Celana = new Pakaian();
    Pakaian Sepatu = new Pakaian();
    
    Baju.Warna = "Biru";
    Baju.Ukuran = "XL";
    Baju.Bahan = "Cotton";
    Baju.Tipe = "Oblong";
    Baju.Merk = "Cressida";
    
    Celana.Warna = "Hitam";
    Celana.Ukuran = "33";
    Celana.Bahan = "Jeans";
    Celana.Tipe = "Joger";
    Celana.Merk = "Emba";
    
    Sepatu.Warna = "Hitam";
    Sepatu.Ukuran = "42";
    Sepatu.Bahan = "Kulit";
    Sepatu.Tipe = "Sneaker";
    Sepatu.Merk = "Adidas";
    
    Baju.tampildata();
    Celana.tampildata();
    Sepatu.tampildata();
    }
    
}
