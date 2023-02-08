/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.Helper;

import Model.Agendamento;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.Agenda;

/**
 *
 * @author Brambati
 */
public class AgendaHelper {
    
    private final Agenda view; //ter acesso a view Agenda

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        
        DefaultTableModel tableModel =  (DefaultTableModel) view.getjTable1().getModel();
        tableModel.setNumRows(0);
        //Percorrer a lista preenchedo o table model
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
            
               agendamento.getId(),
               agendamento.getCliente().getNome(),
               agendamento.getServico().getDescricao(),
               agendamento.getValor(),
               agendamento.getDataFormatada(),
               agendamento.getHoraFormatada(),
               agendamento.getObservacao()
        });
            
        }
        
    }
    
    
    
}
