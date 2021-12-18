package com.Rumus_Matematika.lib;

import java.lang.Math;

public class RumusBangunDatar {
    protected final RumusDasar rd = new RumusDasar();
    protected final static double v = 3.14;

    public double LuasPersegi(double sisi) {
        double hasil = rd.kali(sisi, sisi);
        return hasil;
    }

    public double luasPersegiPanjang(double panjang, double lebar) {
        double hasil = rd.kali(panjang, lebar);
        return hasil;
    }

    // belah ketupat ,Segitiga dan layang-layang bentuk rumusanya sama
    public double luasSegitiga(double alas, double tinggi) {
        double hasil = rd.bagi(luasPersegiPanjang(alas, tinggi), 2);
        return hasil;
    }

    public double luasLingkaran(double r) {
        double hasil = (double) rd.kali(v, Math.pow(r, 2));
        return hasil;
    }

    public double luasjajarGenjang(double alas, double tinggi) {
        double hasil = luasPersegiPanjang(alas, tinggi);
        return hasil;
    }

    public double luasTrapesium(double a, double b, double t) {
        double hasil = rd.bagi(rd.kali(rd.tambah(a, b), t), 2);
        return hasil;
    }

    // Keliling
    // belah ketupat sama dengan Persegi
    public double KelilingPersegi(double sisi) {
        double hasil = rd.kali(4, sisi);
        return hasil;
    }

    public double KelilingPersegiPanjang(double panjang, double lebar) {
        double hasil = rd.kali(2, rd.tambah(panjang, lebar));
        return hasil;
    }

    public double KelilingSegitiga(double alas,double tinggi, double miring) {
        double hasil = rd.tambah(alas, tinggi, miring);
        return hasil;
    }

    public double KelilingLingkaran(double r) {
        double hasil = rd.kali(2, v, r);
        return hasil;
    }

    // keliling belah ketupat itu sama dengan jajar genjang
    public double KelilingJajarGenjang(double alas, double mirring) {
        double hasil = rd.kali(2, rd.tambah(alas, mirring));
        return hasil;
    }

    public double KelilingTrapesium(double alas, double tinggi, double miring, double atas) {
        double hasil = rd.tambah(alas, tinggi, miring, atas);
        return hasil;
    }
}
