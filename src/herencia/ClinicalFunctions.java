package herencia;

import java.util.List;

public interface ClinicalFunctions {

    public void openClinic(boolean itsOpen);
    public void addAgenda(List Agenda, Pacientes paciente);
    public void changeState (States estado, States NewState);
    public void changeService (String Service);
    public void updateDificult (LevelOfDifficult difficult);


}
