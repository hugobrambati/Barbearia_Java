/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Controle.Helper.AgendaHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import java.util.ArrayList;
import view.Agenda;

/**
 *
 * @author Brambati
 */
public class AgendaControle {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaControle(Agenda view) {
        this.view = view;
        this.helper =new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
    
        //Buscar uma lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //Exibir essa lista na View
        helper.preencherTabela(agendamentos);
        
    
    }

   
    
}
