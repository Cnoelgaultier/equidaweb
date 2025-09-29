package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cheval {

    private int id;
    private String nom;
    private LocalDate dateNaissance;
    private String codeSire; 
    private double  taille;
    private double poids;
    private Cheval chevalPere;
    private Cheval chevalMere;

    private Race race;
    private ArrayList<Lot> lesLots;
    private ArrayList<ChevalCourse> lesChevauxcourses;
    private ArrayList<Course> lesCourses;
    private ArrayList<Participer> lesParticipants; 

    public ArrayList<ChevalCourse> getLesChevauxcourses() {
        return lesChevauxcourses;
    }

    public void setLesChevauxcourses(ArrayList<ChevalCourse> lesChevauxcourses) {
        this.lesChevauxcourses = lesChevauxcourses;
    }
    

    public Cheval() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public Race getRace() {
        return race;
    }
    public void setRace(Race race) {
        this.race = race;
    }

    public ArrayList<Lot> getLesLots() {
        return lesLots;
    }

    public String getCodeSire() {
        return codeSire;
    }

    public void setCodeSire(String codeSire) {
        this.codeSire = codeSire;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }
       

    public void setLesLots(ArrayList<Lot> lesLots) {
        this.lesLots = lesLots;
    }
    
    
    public void addLot(Lot unLot){
        if (lesLots ==null){
            lesLots = new ArrayList<Lot>();
            
        }
        lesLots.add(unLot);
    }

    public Cheval getChevalPere() {
        return chevalPere;
    }

    public void setChevalPere(Cheval chevalPere) {
        this.chevalPere = chevalPere;
    }

    public Cheval getChevalMere() {
        return chevalMere;
    }

    public void setChevalMere(Cheval chevalMere) {
        this.chevalMere = chevalMere;
    }
    
    public void addChevalCourse(ChevalCourse unChevalCourse){
        if(lesChevauxcourses ==null){
            lesChevauxcourses = new ArrayList<ChevalCourse>();
        }
        lesChevauxcourses.add(unChevalCourse);
    }

    public ArrayList<Course> getLesCourses() {
        return lesCourses;
    }

    public void setLesCourses(ArrayList<Course> lesCourses) {
        this.lesCourses = lesCourses;
    }
    
    public void addCourse(Course uneCourse)
    {
        if(lesCourses ==null){
            lesCourses = new ArrayList<Course>();
        }
        lesCourses.add(uneCourse);
    }

    public ArrayList<Participer> getLesParticipants() {
        return lesParticipants;
    }

    public void setLesParticipants(ArrayList<Participer> lesParticipants) {
        this.lesParticipants = lesParticipants;
    }
    
    public void addParticipant(Participer unParticipant)
    {
        if(lesParticipants == null){
            lesParticipants = new ArrayList<Participer>();
            
        }
        lesParticipants.add(unParticipant); 
    }
    
    
    
}
