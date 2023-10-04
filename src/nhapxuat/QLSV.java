/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhapxuat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLSV {
    ArrayList<Stu> stuL = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private void nhapTT(){
        while(true){
            stuL.add(new Stu(ShortInp("ten"), Integer.parseInt(ShortInp("Tuoi"))));
            boolean check = false;
            System.out.println("Nhan space de thoat !");
            if(sc.nextLine().equals(" ")){
                break;
            }
        }
    }
    private void xuatTT(){
        for (Stu stu : stuL) {
            System.out.println(stu);
        }
    }
    private String ShortInp(String x){
        System.out.print("Nhap vao " + x +" : ");
        return sc.nextLine();
    }
    public static void main(String[] args) {
        QLSV ql = new QLSV();
        ql.nhapTT();
        ql.xuatTT();
        read();
    }

    public static void read(){
        System.out.println("hi ....");
    }
    
    public static void abc(){
        System.out.println("hoan ga");
    }

    public static void db(){
        System.out.println("hoan hkt");
    }
}
