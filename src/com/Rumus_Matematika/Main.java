package com.Rumus_Matematika;
import java.util.Scanner;

public class Main {
    protected static Scanner scan = new Scanner(System.in);
    protected static TampilanMenu tp = new TampilanMenu();
    protected static String input;

    public static void main(String[] args) {
        String select;
        do{
            clear();
            tp.TampilanBanungDatar();
            select = scan.next();
            switch (select) {
                case "1":
                    clear();
                    persegi();
                    break;
                case "2":
                    clear();
                    persegiPanjang();
                    break;
                case "3":
                    clear();
                    Segitiga();
                    break;
                case "4":
                    clear();
                    Lingkaran();
                    break;
                case "5":
                    clear();
                    JajarGenjang();
                    break;
                case "6":
                    clear();
                    BelahKetupat();
                    break;
                case "7":
                    clear();
                    Trapesium();
                    break;
                case "8":
                    clear();
                    LayangLayang();
                break; 
                case "q":
                    select = "q";
                break;
            }   
        }while( select  != "q");
    }
    private static void persegi(){
        clear();
        tp.tampilanPersegi();
        pilihanFooter();
    }
    private static void persegiPanjang(){
        clear();
        tp.tampilanPersegiPanjang();
        pilihanFooter();
    }
    private static void Segitiga(){
        clear();
        tp.tampilanSegitiga();
        pilihanFooter();
    }
    private static void Lingkaran(){
        clear();
        tp.tampilanLingkaran();
        pilihanFooter();
    }
    private static void JajarGenjang(){
        clear();
        tp.tampilanJajarGenjang();
        pilihanFooter();
    }
    private static void BelahKetupat(){
        clear();
        tp.tampilanBelahKetupat();
        pilihanFooter();
    }
    private static void Trapesium(){
        clear();
        tp.tampilanTrapesium();
        pilihanFooter();
    }
    private static void LayangLayang(){
        clear();
        tp.tampilanLayang();
        pilihanFooter();
    }
    private static void pilihanFooter(){
        do{
            input = scan.nextLine();
            switch(input){
                case "q":
                    System.exit(1);
                break;
                case "b":
                    input = "b";
                break;
            }
        }while(!input.equals("b"));
    }
    public static void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
}
