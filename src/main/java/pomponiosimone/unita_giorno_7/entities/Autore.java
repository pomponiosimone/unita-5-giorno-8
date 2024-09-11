package pomponiosimone.unita_giorno_7.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Autore")

public class Autore {
    @OneToMany
    @JoinColumn(name = "BlogPost_id")
    private List<BlogPost> blogPost;
    @Id
@GeneratedValue


    private int id;
    private String nome;
    private String cognome;
    private String email;
    private String dataDiNascita;
    private String avatar;

    @Override
    public String toString() {
        return "Autore{" +
                "avatar='" + avatar + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                '}';
    }
}
