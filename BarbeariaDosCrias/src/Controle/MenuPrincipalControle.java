/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import view.Agenda;
import view.MenuPrincipal;



/**
 *
 * @author Brambati
 */
public class MenuPrincipalControle {
    
    private final MenuPrincipal view;

    public MenuPrincipalControle(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaAgenda(){
    
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
        this.view.dispose();
    
    }
}
