/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author DIL-SOFT 02
 */
public class Spare_Part {
    
    public static void main (String[] args){
        new Spare_Parts_Details().setVisible(true);
        new User_Login().setVisible(true);
        new Admin_Login().setVisible(true);
        new Technician_Details().setVisible(true);
        new Home().setVisible(true);
        new Stock_Details().setVisible(true);
        
        new View.View_Spare_Parts_Details().setVisible(true);
        new View.View_Stock_table().setVisible(true);
        new View.View_Technician_Details().setVisible(true);
    }
}
