package com.Rumus_Matematika;

import com.Rumus_Matematika.lib.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RumusDasar rm = new RumusDasar();
        int pilihan = -1;
        System.out.println("============================================");
        System.out.println("= Menu rumus Matematika dan Data Mahasiswa =");
        System.out.println("============================================");
        System.out.println("= 1.                                       =");
        System.out.println("============================================");
        System.out.print("Pilihan anda ? > ");
        
        while(pilihan < 0 ){
            pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    //kasih kondisi di sini 
                    break;
                default:
                    System.out.println("pilihan tidak di temukan ");
                    pilihan = -1;
                    break;
            }
        }
        
    }
}
