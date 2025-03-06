package com.example.SpringSecuritydemo.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtils {

    private String secret = "your_secret_key";

    public  String generateToken(String subject){
        long currentTime=System.currentTimeMillis();
        long expirationMillis=currentTime+(60*60*24*1000);
        return Jwts.builder()
                .setSubject(subject)
                .setIssuer("Sampath")
                .signWith(SignatureAlgorithm.HS512,secret.getBytes())
                .setIssuedAt(new Date(currentTime))
                .setExpiration(new Date(expirationMillis))
                .compact();

    }

    public Claims getClaims(String token){
        return  Jwts.parser()
                .setSigningKey(secret.getBytes())
                .parseClaimsJws(token)
                .getBody();
    }

    public Date getExpDate(String token){
        return getClaims(token).getExpiration();
    }

    public  String getUsername(String token){
        return getClaims(token).getSubject();
    }

    public boolean isTokenExp(String token){
        Date expdate=getExpDate(token);
        return expdate.before(new Date(System.currentTimeMillis()));
    }

    public boolean validToken(String token ,String uname){
        String username=getUsername(token);
        return (uname.equals(username)  && !isTokenExp(token));
    }
}
