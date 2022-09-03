package com.usuarios.Usuarios.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aspectj.lang.annotation.Before;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "usuarios")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario", unique = true, nullable = false)
    private String usuario;


    private String password;

    @Temporal(value = TemporalType.DATE)
    private Date createAt;


    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id")
    private Role role;


}
