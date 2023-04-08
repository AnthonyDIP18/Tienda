/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

/**
 *
 * @author Anthony
 */
public class AppAuthenticationSuccesHandler extends SimpleUrlAuthenticationSuccessHandler{
    protected void handle(HttpServletRequest request, HttpServletResponse response,
    Authentication authentication) throws IOException, ServletException{
        
    }
    
}