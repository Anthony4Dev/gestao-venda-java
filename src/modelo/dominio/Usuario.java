package modelo.dominio;

import java.time.LocalDateTime;
import java.util.Objects;

public class Usuario {

    private Long id;
    private String nome;
    private String senha;
    private String usuario;
    private Perfil perfil;

    private boolean estado;

    private LocalDateTime data_hora_criacao;
    private LocalDateTime ultimoLogin;

    public Usuario(){
        this.estado = true;
    }

    public Usuario (Long id, String nome, String senha, String usuario, Perfil perfil, boolean estado, LocalDateTime data_hora_criacao, LocalDateTime ultimoLogin){
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.usuario = usuario;
        this.perfil = perfil;
        this.estado = true;
        this.data_hora_criacao = data_hora_criacao;
        this.ultimoLogin = ultimoLogin;
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

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String isUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getData_hora_criacao() {
        return data_hora_criacao;
    }

    public void setData_hora_criacao(LocalDateTime data_hora_criacao) {
        this.data_hora_criacao = data_hora_criacao;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void reset(){
        this.estado = true;
    }

    public void mudarEstado(){
        this.estado = !this.estado;
    }
}
