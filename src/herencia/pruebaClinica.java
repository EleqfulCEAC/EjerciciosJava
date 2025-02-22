package herencia;

import java.util.List;

public class pruebaClinica implements ClinicalFunctions {

    public static void main(String[] args) {
            Pacientes Perro = new Pacientes(
                    5,
                     States.PENDIENTE,
                    "Animal domestico de 4 patas",
                    "Animal bastante sano que no presenta enfermedades",
                    "Perro",
                    true,
                    "23-02-2021");

            Perro.showInfo();


   ; }

    @Override
    public void openClinic(boolean itsOpen) {
        itsOpen = !itsOpen;
    }

    @Override
    public void addAgenda(List Agenda, Pacientes paciente) {
        Agenda.add(paciente);
    }

    @Override
    public void changeState(States estado, States NewState) {
            estado = NewState;
    }

    @Override
    public void changeService(String Service) {

    }

    @Override
    public void updateDificult(LevelOfDifficult difficult) {

    }
}
