package pomponiosimone.unita_giorno_7.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pomponiosimone.unita_giorno_7.entities.BlogPost;
import pomponiosimone.unita_giorno_7.exceptions.NotFoundException;
import pomponiosimone.unita_giorno_7.repositories.BlogPostRepository;

import java.util.List;

@Service
public class BlogPostService {

    @Autowired
    private BlogPostRepository blogPostRepository;

    // Restituisce tutti i blog
    public List<BlogPost> findAll() {
        return blogPostRepository.findAll();
    }

    // Salvataggio creazione
    public BlogPost saveBlog(BlogPost body) {
        return blogPostRepository.save(body);
    }

    // Trova tramite id
    public BlogPost findById(int blogId) {
        return blogPostRepository.findById(blogId)
                .orElseThrow(() -> new NotFoundException(blogId));
    }

    // Trova tramite id e modifica
    public BlogPost findByIdAndUpdate(int blogId, BlogPost updatedBlog) {
        BlogPost found = findById(blogId);
        found.setCategoria(updatedBlog.getCategoria());
        found.setTitolo(updatedBlog.getTitolo());
        return blogPostRepository.save(found);
    }

    // Trova tramite id e elimina
    public void findByIdAndDelete(int blogId) {
        BlogPost found = findById(blogId);
        blogPostRepository.delete(found);
    }
}