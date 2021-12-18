package com.Rumus_Matematika;

import java.util.Scanner;
import com.Rumus_Matematika.lib.*;

class TampilanMenu {
    protected static Scanner scan = new Scanner(System.in);
    protected static RumusBangunDatar rbd = new RumusBangunDatar();

    static void TampilanUtama() {
        System.out.println("============================================");
        System.out.println("= Menu rumus Matematika dan Data Mahasiswa =");
        System.out.println("============================================");
        System.out.println("= 1.Bangun Datar                           =");
        System.out.println("= 2.Bangun Ruang                           =");
        System.out.println("============================================");
        System.out.println("= q.quit                                   =");
        System.out.println("============================================");
        System.out.print("pilihan Anda  : ");
    }

    static void TampilanBanungDatar() {
        System.out.println("============================================");
        System.out.println("= Menu rumus Matematika dan Data Mahasiswa =");
        System.out.println("============================================");
        System.out.println("= 1.Persegi                                =");
        System.out.println("= 2.Persegi Panjang                        =");
        System.out.println("= 3.Segitiga                               =");
        System.out.println("= 4.Lingkaran                              =");
        System.out.println("= 5.Jajar Genjang                          =");
        System.out.println("= 6.Belah Ketupat                          =");
        System.out.println("= 7.Trapesium                              =");
        System.out.println("= 8.Layang-layang                          =");
        System.out.println("============================================");
        System.out.println("= b.back                                   =");
        System.out.println("============================================");
        System.out.print("pilihan Anda  : ");

    }

    static void footer() {
        System.out.println("============================================");
        System.out.println("= b.back                                   =");
        System.out.println("= q.quit                                   =");
        System.out.println("============================================");
        System.out.print("pilihan Anda  : ");
    }

    static void tampilanPersegi() {
        System.out.println("============================================");
        System.out.println("= Menu rumus Matematika dan Data Mahasiswa =");
        System.out.println("============================================");
        System.out.println("=                Persegi                   =");
        System.out.print("= Masukan nilai sisi : ");
        double sisi = scan.nextDouble();
        double LuasPersegi = rbd.LuasPersegi(sisi);
        double KelilingPersegi = rbd.KelilingPersegi(sisi);
        System.out.println("= Luas Persegi adalah " + LuasPersegi + " atau " + (int) LuasPersegi);
        System.out.println("= Keliling Persegi adalah " + KelilingPersegi + " atau " + (int) KelilingPersegi);
        footer();
    }

    static void tampilanPersegiPanjang() {
        System.out.println("============================================");
        System.out.println("= Menu rumus Matematika dan Data Mahasiswa =");
        System.out.println("============================================");
        System.out.println("=              Persegi Panjang             =");
        System.out.print("= Masukan nilai panjang : ");
        double panjang = scan.nextDouble();
        System.out.print("= Masukan nilai lebar   : ");
        double lebar = scan.nextDouble();

        double LuasPersegiPanjang = rbd.luasPersegiPanjang(panjang, lebar);
        double KelilingPersegiPanjang = rbd.KelilingPersegiPanjang(panjang, lebar);

        System.out.println("= Luas Persegi Panjang adalah " + LuasPersegiPanjang + " atau " + (int) LuasPersegiPanjang);
        System.out.println("= Keliling Persegi Panjang adalah " + KelilingPersegiPanjang + " atau "
                + (int) KelilingPersegiPanjang);
        footer();
    }

    static void tampilanSegitiga() {
        System.out.println("============================================");
        System.out.println("= Menu rumus Matematika dan Data Mahasiswa =");
        System.out.println("============================================");
        System.out.println("=                 Segitiga                 =");
        System.out.print("= Masukan nilai Alas : ");
        double alas = scan.nextDouble();
        System.out.print("= Masukan nilai Tinggi   : ");
        double tinggi = scan.nextDouble();
        System.out.print("= Masukan nilai Miring   : ");
        double miring = scan.nextDouble();

        double LuasSegitiga = rbd.luasSegitiga(alas, tinggi);
        double KelilingSegitiga = rbd.KelilingSegitiga(alas, tinggi, miring);

        System.out.println("= Luas Segitiga adalah " + LuasSegitiga + " atau " + (int) LuasSegitiga);
        System.out.println("= Keliling Segitiga adalah " + KelilingSegitiga + " atau " + (int) KelilingSegitiga);
        footer();
    }

    static void tampilanLingkaran() {
        System.out.println("============================================");
        System.out.println("= Menu rumus Matematika dan Data Mahasiswa =");
        System.out.println("============================================");
        System.out.println("=                Lingkaran                 =");
        System.out.print("= Masukan nilai Jari-Jari : ");
        double r = scan.nextDouble();
        double LuasLingkaran = rbd.luasLingkaran(r);
        double KelilingLingkaran = rbd.KelilingLingkaran(r);

        System.out.println("= Luas Lingkaran adalah " + LuasLingkaran + " atau " + (int) LuasLingkaran);
        System.out.println("= Keliling Lingkaran adalah " + KelilingLingkaran + " atau " + (int) KelilingLingkaran);
        footer();
    }

    static void tampilanJajarGenjang() {
        System.out.println("============================================");
        System.out.println("= Menu rumus Matematika dan Data Mahasiswa =");
        System.out.println("============================================");
        System.out.println("=              Jajar Genjang               =");
        System.out.print("= Masukan nilai Alas : ");
        double alas = scan.nextDouble();
        System.out.print("= Masukan nilai Tinggi   : ");
        double tinggi = scan.nextDouble();
        System.out.print("= Masukan nilai Miring   : ");
        double miring = scan.nextDouble();
        double LuasJajarGenjang = rbd.luasjajarGenjang(alas, tinggi);
        double KeliJajarGenjang = rbd.KelilingJajarGenjang(alas, miring);

        System.out.println("= Luas Jajar Genjang adalah " + LuasJajarGenjang + " atau " + (int) LuasJajarGenjang);
        System.out.println("= Keliling Jajar Genjang adalah " + KeliJajarGenjang + " atau " + (int) KeliJajarGenjang);
        footer();
    }

    static void tampilanBelahKetupat() {
        System.out.println("============================================");
        System.out.println("= Menu rumus Matematika dan Data Mahasiswa =");
        System.out.println("============================================");
        System.out.println("=              Belah Ketupat              =");
        System.out.print("= Masukan nilai sisi : ");
        double sisi = scan.nextDouble();
        System.out.print("= Masukan nilai diagonal 1   : ");
        double d1 = scan.nextDouble();
        System.out.print("= Masukan nilai diagonal 2   : ");
        double d2 = scan.nextDouble();
        double LuasBelahKetupat = rbd.luasSegitiga(d1, d2);
        double KelilingBelahKetupat = rbd.KelilingPersegi(sisi);

        System.out.println("= Luas Belah Ketupat adalah " + LuasBelahKetupat + " atau " + (int) LuasBelahKetupat);
        System.out.println(
                "= Keliling Belah Ketupat adalah " + KelilingBelahKetupat + " atau " + (int) KelilingBelahKetupat);
        footer();
    }

    static void tampilanTrapesium() {
        System.out.println("============================================");
        System.out.println("= Menu rumus Matematika dan Data Mahasiswa =");
        System.out.println("============================================");
        System.out.println("=              Trapesium              =");
        System.out.print("= Masukan nilai atas : ");
        double atas = scan.nextDouble();
        System.out.print("= Masukan nilai bawah   : ");
        double bawah = scan.nextDouble();
        System.out.print("= Masukan nilai miring   : ");
        double miring = scan.nextDouble();
        System.out.print("= Masukan nilai tinggi   : ");
        double tinggi = scan.nextDouble();
        double LuasTrapesium = rbd.luasTrapesium(atas, bawah, tinggi);
        double KelilingTrapesium = rbd.KelilingTrapesium(atas, bawah, tinggi, miring);

        System.out.println("= Luas Trapesium adalah " + LuasTrapesium + " atau " + (int) LuasTrapesium);
        System.out.println("= Keliling Trapesium adalah " + KelilingTrapesium + " atau " + (int) KelilingTrapesium);
        footer();
    }

    static void tampilanLayang() {
        System.out.println("============================================");
        System.out.println("= Menu rumus Matematika dan Data Mahasiswa =");
        System.out.println("============================================");
        System.out.println("=               Layang-Layang              =");
        System.out.print("= Masukan nilai Diagonal 1  : ");
        double d1 = scan.nextDouble();
        System.out.print("= Masukan nilai Diagonal 2   : ");
        double d2 = scan.nextDouble();
        System.out.print("= Masukan nilai sisi 1  : ");
        double s1 = scan.nextDouble();
        System.out.print("= Masukan nilai sisi 1  : ");
        double s2 = scan.nextDouble();
        double LuasLayang = rbd.luasSegitiga(d1, d2);
        double KelilingLayang = rbd.KelilingJajarGenjang(s1, s2);
        System.out.println("= Luas Layang-Layang adalah " + LuasLayang + " atau " + (int) LuasLayang);
        System.out.println("= Keliling Layang-Layang adalah " + KelilingLayang + " atau " + (int) KelilingLayang);
        footer();
    }

}
