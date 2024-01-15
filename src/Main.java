//
// Crea un programa para gestionar las agendas de un centro de saludo por pacientes y días. Utiliza un HashMap, una clase paciente y una enumeración para los días de la semana
public class Main {
    public static void main(String[] args) {

        Agenda fisio = new Agenda();

        Paciente paciente1 = new Paciente("Pepito", "Grillo", 34);
        Paciente paciente2 = new Paciente("Blanca", "Nieves", 22);
        Paciente paciente3 = new Paciente("Julio", "Julián", 4);
        Paciente paciente4 = new Paciente("Mar", "Costa", 56);

        fisio.ponCita(paciente1, DiasSemana.MARTES);
        fisio.ponCita(paciente2, DiasSemana.JUEVES);
        fisio.ponCita(paciente3, DiasSemana.MARTES);
        fisio.ponCita(paciente4, DiasSemana.VIERNES);
        fisio.ponCita(paciente1, DiasSemana.MIÉRCOLES);

fisio.muestraCitas();

    }
}