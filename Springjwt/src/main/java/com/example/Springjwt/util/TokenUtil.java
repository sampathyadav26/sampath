package com.example.Springjwt.util;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class TokenUtil {

    private static final Key KEY= Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public String createToken(String username){
        long currenttime=System.currentTimeMillis();
        long expiretime=currenttime+(60*60*24*1000);
        String token= Jwts.builder()
                .signWith(KEY)
                .setSubject(username)
                .setExpiration(new Date(expiretime))
                .compact();
        return token;
    }

    public String fetchUsernameByDecodingToken(String token){
        Jws<Claims> claimsHolder  =  Jwts.parserBuilder()
                .setSigningKey(KEY)
                .build()
                .parseClaimsJws(token);
        Claims claims= claimsHolder.getBody();
        String username=claims.getSubject();
        return username;
    }


}
