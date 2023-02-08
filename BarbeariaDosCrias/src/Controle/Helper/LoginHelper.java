/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.Helper;

import Model.Usuario;
import view.Login;

/**
 *
 * @author Brambati
 */
public class LoginHelper {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
       
    public Usuario obterModelo(){
      
        String nome = view.getUsuario().getText();
        String senha = view.getSenha().getText();
        Usuario modelo = new Usuario(0, nome, senha);
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
    
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        view.getUsuario().setText(nome);
        view.getSenha().setText(senha);
        
     }
     
    public void limparTela(){
    
        view.getUsuario().setText("");
        view.getSenha().setText("");
    }
    
}
