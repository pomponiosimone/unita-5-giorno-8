package pomponiosimone.unita_giorno_7.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Autore")
public class Autore {
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
