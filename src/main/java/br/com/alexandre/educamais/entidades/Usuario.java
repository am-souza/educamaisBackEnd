package br.com.alexandre.educamais.entidades;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Usuario extends Entidade {

    private static final String BCRYPT_REGEX = "^\\$2[ayb]\\$.{56}$";

    public enum Perfil {
        ADMINISTRADOR,
        TUTOR,
        ALUNO
    }

    @Enumerated
    @Column(nullable = false)
    private Perfil perfil = Perfil.ALUNO;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Column(nullable = false)
    private String nome;

    private String email;

    private Integer xp;

    private Integer cash;


    @PreUpdate
    @PrePersist
    public void preSalvar() {
        if (StringUtils.isBlank(username)) {
            throw new RuntimeException("Nome de usuário não pode ser vazio");
        }
        if (StringUtils.isBlank(password)) {
            throw new RuntimeException("Senha não pode ser vazia");
        }
        if (StringUtils.isBlank(nome)) {
            throw new RuntimeException("Nome não pode ser vazio");
        }
        if (password != null && password.length() < 60) {
            password = new BCryptPasswordEncoder().encode(password);
        }
    }

}
