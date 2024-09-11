package pomponiosimone.unita_giorno_7.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pomponiosimone.unita_giorno_7.entities.Autore;
import pomponiosimone.unita_giorno_7.exceptions.NotFoundException;
import pomponiosimone.unita_giorno_7.repositories.AutoreRepository;

import java.util.List;

@Service
public class AutoreService {

    @Autowired
    private AutoreRepository autoreRepository;

    // Restituisce tutti gli autori
    public List<Autore> findAll() {
        return autoreRepository.findAll();
    }

    // Salvataggio creazione
    public Autore saveAutore(Autore body) {
        body.setAvatar("https://ui-avatars.com/api/?name=" + body.getNome() + "+" + body.getCognome());
        return autoreRepository.save(body);
    }

    // Trova tramite id
    public Autore findById(int autoreId) {
        return autoreRepository.findById(autoreId)
                .orElseThrow(() -> new NotFoundException(autoreId));
    }

    // Trova tramite id e modifica
    public Autore findByIdAndUpdate(int autoreId, Autore updatedAutore) {
        Autore found = findById(autoreId);
        found.setNome(updatedAutore.getNome());
        found.setCognome(updatedAutore.getCognome());
        return autoreRepository.save(found);
    }

    // Trova tramite id e elimina
    public void findByIdAndDelete(int autoreId) {
        Autore found = findById(autoreId);
        autoreRepository.delete(found);
    }
}