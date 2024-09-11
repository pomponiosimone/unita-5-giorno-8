package pomponiosimone.unita_giorno_7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pomponiosimone.unita_giorno_7.entities.BlogPost;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Integer> {
}