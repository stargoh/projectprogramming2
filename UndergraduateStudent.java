/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Star Goh
 */
public class UndergraduateStudent extends Student {

public static String type, supervsName; //supervsName = supervisor name

   
    public UndergraduateStudent(int m, String n, double cw, double fm, String grd, String type, String sv) {
        super(m, n, cw, fm, grd,type,sv);
        this.type = type;
        this.supervsName = sv;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static String getSupervsName() {
        return supervsName;
    }

    public void setSupervsName(String supervsName) {
        this.supervsName = supervsName;
    }
    
   
  
}
