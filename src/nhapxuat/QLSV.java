/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhapxuat;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLSV {
    ArrayList<Stu> stuL = new ArrayList<>();
    
    private void xuatTT(){
        for (Stu stu : stuL) {
            System.out.println(stu);
        }
    }
}
