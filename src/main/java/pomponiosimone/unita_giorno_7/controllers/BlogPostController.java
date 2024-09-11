package pomponiosimone.unita_giorno_7.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pomponiosimone.unita_giorno_7.entities.Autore;
import pomponiosimone.unita_giorno_7.entities.BlogPost;
import pomponiosimone.unita_giorno_7.services.AutoreService;
import pomponiosimone.unita_giorno_7.services.BlogPostService;


import java.util.List;



@RestController
@RequestMapping("/BlogPost")
public class BlogPostController {
    @Autowired
    private BlogPostService blogService;

    //Ritorna lista autori
    @GetMapping()
    private List<BlogPost> getAlls() {
        return blogService.findAll() ;

    }

    //Creazione autore
    @PostMapping()
    public BlogPost CreateBlog(@RequestBody BlogPost body) {
        return blogService.saveBlog(body);
    }
    //trova tramite id

    @GetMapping("/{blogId}")
    private BlogPost getBlogById(@PathVariable int blogId){
        return blogService.findById(blogId);
    }

    //trova tramite id e modifica
    @PutMapping("/{blogId}")
    private BlogPost findUserByIdAndUpdate(@PathVariable int blogId, @RequestBody BlogPost body){
        return blogService.findByIdAndUpdate(blogId, body);
    }
    //elimina tramite id
    @DeleteMapping("/{blogId}")
    private void findAutoreByIdAndDelete(@PathVariable int blogId){
        blogService.findByIdAndDelete(blogId);}
}


