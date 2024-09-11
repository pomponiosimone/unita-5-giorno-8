package pomponiosimone.unita_giorno_7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pomponiosimone.unita_giorno_7.entities.Autore;
@Repository
public interface AutoreRepository extends JpaRepository <Autore, Integer> {
}
