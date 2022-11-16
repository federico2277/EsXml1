package com.example;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
//import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception 
    {
        
        System.out.println("------------");
        ArrayList <Studente> arrayStudente = new ArrayList<>();
        Studente s1 = new Studente("borrometi", "federico", 70);
        Studente s2 = new Studente("tossani", "alessandro", 80);
        Studente s3 = new Studente("ciavarella", "lorenzo", 50);
        Studente s4 = new Studente("vasquez", "giacomino", 80);
        
        arrayStudente.add(s1);
        arrayStudente.add(s2);
        arrayStudente.add(s3);
        arrayStudente.add(s4);
        Studenti scuola = new Studenti(arrayStudente);
        XmlMapper xmlMapper = new XmlMapper();
        
        // Serializzazione        
        xmlMapper.writeValue(new File("test.xml"), scuola);
        String myXml = xmlMapper.writeValueAsString(scuola);
        System.out.println("Oggetto serializzato:" + myXml);
        
        // Deserializzazione
        
        Studenti c2 = xmlMapper.readValue(myXml, Studenti.class);
        System.out.println("Oggetto deserializzato da file" );

        Studenti c3 = xmlMapper.readValue(new File("test.xml"), Studenti.class);
        System.out.println("Oggetto deserializzato da file ");
        
        
    }


}
