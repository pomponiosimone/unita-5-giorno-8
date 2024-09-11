package pomponiosimone.unita_giorno_7.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("l'elemento con " + id + " non è stato trovato");
    }
}