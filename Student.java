/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author Star Goh
 */
public class Student {
public static int counter = 0;
     public static ArrayList<Student> student = new ArrayList<Student>();;//Array & constructor
    private String name, grade, type, SVName;
    private int matricno;
    private double cwMark; //course work mark
    private double finalMark;
    
    //private String SVName; //supervisor name
    

    public Student(int m, String n, double cw, double fm, String grade, String type, String SVName) {
        this.name = n;
        this.matricno = m;
        this.cwMark = cw;
        this.finalMark = fm;
        this.grade = grade;
        this.type = type;
        this.SVName = SVName;
        
        //SVName = sv;
        
    }

    public String getSVName() {
        return SVName;
    }

    public void setSVName(String SVName) {
        this.SVName = SVName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public void newSVName(String sv){
//        this.SVName = sv;
//    }
    public void newName(String n) {
        this.name = n;
    }

    public void newMatric(int m) {
        this.matricno = m;
    }

    public void setCwMark(double cw) {
        this.cwMark = cw;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
   

    public void setFinalMark(double fm) {
        this.finalMark = fm;
    }

    public int getMatric() {
        return matricno;

    }
    
    

    public String getName() {
        return name;
    }

    public double getcwMark() {
        return cwMark;
    }


    public double getFinalMark() {
        return finalMark;

    }
    
    
//    public String getSVName(){
//        return SVName;
//    }

    public String getGrade() {
        return grade;
    }

    
}
