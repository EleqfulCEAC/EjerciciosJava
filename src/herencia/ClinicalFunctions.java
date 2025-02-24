package herencia;

import java.util.List;

public interface ClinicalFunctions {

    public void openClinic(boolean itsOpen);
    public void addAgenda(Pacientes paciente);
    public void changeState (Pacientes paciente, States NewState);
    public void changeService (String Service);
    public void updateDificult (LevelOfDifficult difficult);


}
