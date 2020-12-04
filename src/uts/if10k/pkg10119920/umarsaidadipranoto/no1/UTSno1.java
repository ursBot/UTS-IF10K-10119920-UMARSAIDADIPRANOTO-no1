/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119920.umarsaidadipranoto.no1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Age {
    
    private int yearBirth;
    private int yearNow;
    private String red = "\u001b[31m";
    
    public Age(int yearNow) {
        this.yearNow = yearNow;
    }
    
    public int getYearBirth() {
        return yearBirth;
    }
    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur() {
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur) {
        String keterangan;
        
        if (umur >= 0 && umur <= 5) {
            keterangan = "LAGI LUCU-LUCU NYA";
        } else if (umur > 5 && umur <= 10) {
            keterangan = "MASIH ANAK-ANAK";
        } else if (umur > 10 && umur <= 13) {
            keterangan = "MASIH REMADJA";
        } else if (umur > 13 && umur <= 19) {
            keterangan = "ALAY";
        } else if (umur > 19 && umur <= 29) {
            keterangan = "LAGI GALAU NYARI JODOH";
        } else if (umur > 29 && umur <= 35) {
            keterangan = "LAGI SIBUK NYARI UANG";
        } else if (umur > 35 && umur <= 150) {
            keterangan = "SUDAH TUA";
        } else {
            keterangan = "TIDAK TERDETEKSI DI KEHIDUPAN";
        }
        
        return red + keterangan;
    }
    
}

public class UTSno1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Date d = new Date();
        Age a = new Age(d.getYear() + 1900);
        
        int yearBirth;
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        yearBirth = input.nextInt();
        a.setYearBirth(yearBirth);
        
        System.out.println();
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + a.getYearBirth());
        System.out.println("Hari ini tahun : " + a.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + a.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu " + a.tandanyaKamu(a.hitungUmur()));
    }
}