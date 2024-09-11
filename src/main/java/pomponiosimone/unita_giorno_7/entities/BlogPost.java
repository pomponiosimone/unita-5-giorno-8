package pomponiosimone.unita_giorno_7.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
