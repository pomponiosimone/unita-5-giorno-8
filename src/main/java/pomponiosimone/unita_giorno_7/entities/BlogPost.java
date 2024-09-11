package pomponiosimone.unita_giorno_7.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "BlogPost")
public class BlogPost
{
    @ManyToOne
    @JoinColumn(name = "autore_id")
    private Autore autore;
    @Id
    @GeneratedValue
    private int id;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;

    //to string
    @Override
    public String toString() {
        return "BlogPost{" +
                "categoria='" + categoria + '\'' +
                ", id=" + id +
                ", titolo='" + titolo + '\'' +
                ", cover='" + cover + '\'' +
                ", contenuto='" + contenuto + '\'' +
                ", tempoDiLettura=" + tempoDiLettura +
                '}';
    }
}
