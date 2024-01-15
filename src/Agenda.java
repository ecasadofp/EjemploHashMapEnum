import java.util.HashMap;
import java.util.Set;

public class Agenda {

    private HashMap<Paciente, DiasSemana> citaciones;


    public Agenda(){
        citaciones = new HashMap<>();
    }

    public  void ponCita(Paciente p, DiasSemana d){
        citaciones.put(p,d);
    }

    public void muestraCitas(){
        Set<Paciente> pacientes = citaciones.keySet();
        for(Paciente p: pacientes){
            System.out.println(p + " -> " + citaciones.get(p));
        }
    }

}
