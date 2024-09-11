package pomponiosimone.unita_giorno_7.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pomponiosimone.unita_giorno_7.entities.Autore;
import pomponiosimone.unita_giorno_7.services.AutoreService;

import java.util.List;
@RestController
@RequestMapping("/autore")
public class AutoreController {
    @Autowired
    private AutoreService autoreService;

    //Ritorna lista autori
    @GetMapping()
    private List<Autore> getAll() {
        return autoreService.findAll() ;

    }

    //Creazione autore
    @PostMapping()
    public Autore CreateAutore(@RequestBody Autore body) {
        return autoreService.saveAutore(body);
    }
    //trova tramite id

        @GetMapping("/{autoreId}")
        private Autore getAutoreById(@PathVariable int autoreId){
            return autoreService.findById(autoreId);
        }

    //trova tramite id e modifica
    @PutMapping("/{autoreId}")
    private Autore findUserByIdAndUpdate(@PathVariable int autoreId, @RequestBody Autore body){
        return autoreService.findByIdAndUpdate(autoreId, body);
    }
    //elimina tramite id
    @DeleteMapping("/{autoreId}")
    private void findAutoreByIdAndDelete(@PathVariable int autoreId){
        autoreService.findByIdAndDelete(autoreId);}
    }

