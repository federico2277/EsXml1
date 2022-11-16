package com.example;

import java.util.ArrayList;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
public class Studenti {

    @JacksonXmlElementWrapper(useWrapping = false)
    private ArrayList <Studente> studente;

    public Studenti(ArrayList Studenti) {
        this.studente = Studenti;
    }

    public ArrayList<Studente> getStudenti() {
        return studente;
    }

    public void setStudenti(ArrayList<Studente> studenti) {
        studenti = studente;
    }

    public Studenti() {
        
    }

    public void addStudenti(Studente s){

        studente.add(s);

    }

}
