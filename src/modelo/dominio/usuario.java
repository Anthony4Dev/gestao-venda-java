package modelo.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class usuario {

    private Long id;
    private String nome;
    private String senha;
    private String usuario;

    private Perfil perfil;

    private boolean estado;

    private LocalDateTime data_hora_criacao;
    private LocalDateTime ultimoLogin;
}
