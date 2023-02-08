/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Controle.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author Brambati
 */
public class LoginControle {
    private final Login view;
    private LoginHelper helper;

    public LoginControle(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
        
    }
    
    public void entrarNoSistema(){
        
        // pegar usuario da view
        Usuario usuario = helper.obterModelo();
        
        //Pesquisar o usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
       // Se o usuario da view tiver mesmo usuario e sunha vindo do banco direcionar para menu 
       //Senão mostrar uma mensagem ao usuario " Usuario ou senha invalidos"
          
        if (usuarioAutenticado != null){
       //navegar menu principal
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.view.dispose();
       }else{
           view.exibeMensagem("Usuario ou senha invalidos");
       }
        
      }
    
    
    public void fizTarefa(){
    
        System.out.println("Busquei Algo do bando de dados");
        
        this.view.exibeMensagem("Executei e fiz a tarefa");
        
    }
    
}
