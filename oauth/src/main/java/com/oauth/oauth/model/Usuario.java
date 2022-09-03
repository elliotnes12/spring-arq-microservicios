package com.oauth.oauth.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private Long id;

    private String usuario;


    private String password;

    private Date createAt;


    private Role role;

    public Usuario getInstance(){
        return this;
    }
}
