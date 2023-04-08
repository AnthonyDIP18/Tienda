package com.tienda.service;

import com.tienda.entity.Persona;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Anthony
 */
public class Userprincipal implements UserDetails{
    private Persona persona;
    
    public Userprincipal (Persona persona){
        this.persona = persona;
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        List<GrantedAuthority> authorities = new ArrayList<>();
        
        this.persona.getPermissionList().forEach(p -> {
            GrantedAuthority authority = new SimpleGrantedAuthority(p);
            authorities.add(authority);
        });
        
        this.persona.getRolesList().forEach(p -> {
            GrantedAuthority authority = new SimpleGrantedAuthority(p);
            authorities.add(authority);
        });
        return authorities;
    }
    
    @Override
    public String getPassword(){
    return this.persona.getPassword();
    }
    
    @Override
    public String getUsername(){
    return this.persona.getPassword();
    }
    
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    
    @Override
    public boolean isEnabled() {
        return this.persona.getActive() == 1;
    }
    
}
