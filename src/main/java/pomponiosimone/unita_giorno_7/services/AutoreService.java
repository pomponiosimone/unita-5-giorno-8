package pomponiosimone.unita_giorno_7.services;

import org.springframework.stereotype.Service;
import pomponiosimone.unita_giorno_7.entities.Autore;
import pomponiosimone.unita_giorno_7.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AutoreService {


    public List<Autore> autoreList = new ArrayList<>();

    // tutti gli autori
    public List<Autore> findAll() {
        return this.autoreList;
    }

    //Salvataggio creazione
    public Autore saveAutore(Autore body) {
        Random rndm = new Random();
        body.setId(rndm.nextInt(1, 100));
        //  body.setNome("Simone");
        // body.setCognome("Rossi");
        // body.setEmail("rossi@gmail.com");
        // body.setAvatar("https://ui-avatars.com/api/?name=Mario+Rossi");
        // body.setDataDiNascita("10/10/2003");
        this.autoreList.add(body);
        return body;
    }

    // Trova tramite id
    public Autore findById(int autoreId) {
        Autore found = null;
        for (Autore autore : this.autoreList) {
            if (autore.getId() == autoreId) found = autore;
        }
        if (found == null) throw new NotFoundException(autoreId);
        return found;
    }

//trova tramite id e modifica

    public Autore findByIdAndUpdate(int autoreId, Autore updatedAutore) {
        Autore found = null;
        for (Autore autore : this.autoreList) {
            if (autore.getId() == autoreId) {
                found = autore;
                found.setNome(updatedAutore.getNome());
                found.setCognome(updatedAutore.getCognome());
            }
        }
        if (found == null) throw new NotFoundException(autoreId);
        return found;

    }
    //trova tramite id e elimina

    public void findByIdAndDelete(int autoreId) {
        Autore found = null;
        for (Autore autore : this.autoreList) {
            if (autore.getId() == autoreId) found = autore;
        }
        if (found == null) throw new NotFoundException(autoreId);
        this.autoreList.remove(found);}}





