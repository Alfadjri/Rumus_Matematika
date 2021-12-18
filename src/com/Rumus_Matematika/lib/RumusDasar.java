package com.Rumus_Matematika.lib;
public class RumusDasar {
    // tulisakan rumus yang mau di impelemntaiskan di sini 
    
    // menggunakan modifire  default karena function ini tidak boleh keluar dari  packagenya 

    double tambah(double val1 , double val2){
        double hasil = val1 + val2;
        return hasil;
    }
    double kurang(double val1, double val2){
        double hasil = val1 - val2;
        return hasil;
    }
    double bagi(double val1,double val2){
        double hasil = val1 / val2;
        return hasil;
    }
    double kali(double val1 , double val2){
        double hasil = val1 * val2;
        return hasil;
    }

    // overloading variable

    double tambah(double val1 , double val2,double val3){
        double hasil = val1 + val2 + val3;
        return hasil;
    }
    double tambah(double val1 , double val2,double val3,double val4){
        double hasil = val1 + val2 + val3 + val4;
        return hasil;
    }

    double kali(double val1 , double val2,double val3){
        double hasil = val1 * val2 * val3;
        return hasil;
    }
}
