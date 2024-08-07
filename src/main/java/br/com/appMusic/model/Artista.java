package br.com.appMusic.model;

import br.com.appMusic.model.enums.TipoArtista;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_artista")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nome;
    @Enumerated(EnumType.STRING)
    private TipoArtista tipoArtista;
    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Music> musicas = new ArrayList<>();

    public Artista() {
    }

    public Artista(String nome, TipoArtista tipoArtista) {
        this.nome = nome;
        this.tipoArtista = tipoArtista;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoArtista getTipoArtista() {
        return tipoArtista;
    }

    public void setTipoArtista(TipoArtista tipoArtista) {
        this.tipoArtista = tipoArtista;
    }

    public List<Music> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Music> musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return "Artista: " + nome + '\'' +
                ", TipoArtista: " + tipoArtista +
                ", Musicas: " + musicas;
    }
}
