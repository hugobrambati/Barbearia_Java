/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Agendamento;
import Model.Cliente;

import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Brambati
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        //String nome= "Hugo";
        //System.out.println(nome);
        
        Servico barba = new Servico(1, "barba", 30);
        
        System.out.println(barba.getDescricao());
        System.out.println(barba.getValor());
        
        
        Cliente cliente = new Cliente(1, "Ana", "Rua x", "22230001");
        
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "Paula", "admin");
        
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(1, cliente, barba, 30, "26/02/2023 09:15");
        
        System.out.println(agendamento.getCliente().getNome());
        
    }
    
}
