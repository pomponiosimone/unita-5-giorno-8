package pomponiosimone.unita_giorno_7.services;

import org.springframework.stereotype.Service;

import pomponiosimone.unita_giorno_7.entities.BlogPost;
import pomponiosimone.unita_giorno_7.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Service
public class BlogPostService {


        public List<BlogPost> blogList = new ArrayList<>();

        // tutti gli autori
        public List<BlogPost> findAll() {
            return this.blogList;
        }

        //Salvataggio creazione
        public BlogPost saveBlog(BlogPost body) {
            Random rndm = new Random();
            body.setId(rndm.nextInt(1, 100));
            this.blogList.add(body);
            return body;
        }

        // Trova tramite id
        public BlogPost findById(int blogId) {
            BlogPost found = null;
            for (BlogPost blog : this.blogList) {
                if (blog.getId() == blogId) found = blog;
            }
            if (found == null) throw new NotFoundException(blogId);
            return found;
        }

//trova tramite id e modifica

        public BlogPost findByIdAndUpdate(int blogId, BlogPost updatedBlog) {
            BlogPost found = this.findById(blogId);
            found.setCategoria(updatedBlog.getCategoria());
            found.setTitolo(updatedBlog.getTitolo());
            return found;
        }


        //trova tramite id e elimina

        public void findByIdAndDelete(int blogId) {
            BlogPost found = null;
            for (BlogPost blog : this.blogList) {
                if (blog.getId() == blogId) found = blog;
            }
            if (found == null) throw new NotFoundException(blogId);
            this.blogList.remove(found);}}






