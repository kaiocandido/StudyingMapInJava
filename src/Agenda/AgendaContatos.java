package Agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    public Map<String, Integer>  agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adcContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer buscarPorNome(String nome){
        Integer numeroTelefone = null;
        if (!agendaContatoMap.isEmpty()){
            numeroTelefone = agendaContatoMap.get(nome);
        }
        return numeroTelefone;
    }
}
