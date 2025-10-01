/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Cheval;
import model.Course;
        

/**
 *
 * @author sio2
 */
public class Participer {
    
    private Cheval cheval;
    private Course course; 
    private Double temps;
    private int positions;

    public Participer() {
    }

    public Participer(Cheval cheval, Course course) {
        this.cheval = cheval;
        this.course = course;
    }

    public Cheval getCheval() {
        return cheval;
    }

    public void setCheval(Cheval cheval) {
        this.cheval = cheval;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Double getTemps() {
        return temps;
    }

    public void setTemps(Double temps) {
        this.temps = temps;
    }

    public int getPositions() {
        return positions;
    }

    public void setPositions(int positions) {
        this.positions = positions;
    }
    
    
    
    
    
    
}
