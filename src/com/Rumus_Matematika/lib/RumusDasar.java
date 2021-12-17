package com.Rumus_Matematika.lib;
public class RumusDasar {
    // tulisakan rumus yang mau di impelemntaiskan di sini 
    public int persegi(int sisi){
        int hasil = kali(sisi,sisi);
        return hasil;
    }

    private int tambah(int val1 , int val2){
        int hasil = val1 + val2;
        return hasil;
    }
    private int kurang(int val1, int val2){
        int hasil = val1 - val2;
        return hasil;
    }
    private int bagi(int val1,int val2){
        int hasil = val1 / val2;
        return hasil;
    }
    private int kali(int val1 , int val2){
        int hasil = val1 * val2;
        return hasil;
    }

    // overloading method
    private float tambah(float val1 , float val2){
        float hasil = val1 + val2;
        return hasil;
    }
    private float kurang(float val1, float val2){
        float hasil = val1 - val2;
        return hasil;
    }
    private float bagi(float val1,float val2){
        float hasil = val1 / val2;
        return hasil;
    }
    private float kali(float val1 , float val2){
        float hasil = val1 * val2;
        return hasil;
    }
}
