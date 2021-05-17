package com.ricardohui.springbootjwt;

import java.io.Serializable;

public class JwtResponse implements Serializable {
    private static final long serialVersionUID = -80918790924046844L;
    private final String jwttoken;

    public JwtResponse(String jwttoken){
        this.jwttoken = jwttoken;
    }

    public String getToken(){
        return this.jwttoken;
    }

}
