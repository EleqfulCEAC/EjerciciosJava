package herencia;

import java.util.ArrayList;
import java.util.List;

public class Services extends ClinicaVeterinaria implements ClinicalFunctions{
    private List<Pacientes> Agenda;
    private LevelOfDifficult difficult;
    private int Duration;
    private boolean itsOpen;
    private String clinicServices;

    public Services(int id, States state, String description, LevelOfDifficult difficult, int duration, boolean itsOpen, String clinicServices) {
        super(id, state, description);
        this.Agenda = new ArrayList<Pacientes>();
        this.difficult = difficult;
        Duration = duration;
        this.itsOpen = itsOpen;

        this.clinicServices = clinicServices;
    }

    public List<Pacientes> getAgenda() {
        return Agenda;
    }

    public void setAgenda(List<Pacientes> agenda) {
        Agenda = agenda;
    }

    @Override
    public void openClinic(boolean itsOpen) {

    }

    @Override
    public void addAgenda(Pacientes paciente) {
        this.Agenda.add(paciente);
    }

    @Override
    public void changeState(Pacientes Paciente, States NewState) {
               Paciente.setEstado(NewState);
    }

    @Override
    public void changeService(String Service) {

    }

    @Override
    public void updateDificult(LevelOfDifficult difficult) {

    }
}
