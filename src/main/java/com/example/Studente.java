package com.example;
import java.time.LocalDate;
public class Studente {
    
    private String cognome;
    private String nome;
   // private LocalDate data_nascita;
    private int voto_esame;
    

    
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
  /*  public LocalDate getData_nascita() {
        return data_nascita;
    }
    public void setData_nascita(LocalDate data_nascita) {
        this.data_nascita = data_nascita;
    }
*/ 
    public int getVoto_esame() {
        return voto_esame;
    }
    public void setVoto_esame(int voto_esame) {
        this.voto_esame = voto_esame;
    }

    public Studente(String cognome, String nome, int voto_esame) {
        this.cognome = cognome;
        this.nome = nome;
        this.voto_esame = voto_esame;
    }

    public Studente() {
        
    }
    


    
}
