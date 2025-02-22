package herencia;

import java.util.ArrayList;
import java.util.List;

public class Services extends ClinicaVeterinaria {
    private List Agenda = new ArrayList<Pacientes>();
    private LevelOfDifficult difficult;
    private int Duration;
    private boolean itsOpen;
    private String clinicServices;

    public Services(int id, States estado, String description, List agenda, LevelOfDifficult difficult, int duration, boolean itsOpen, String clinicServices) {
        super(id, estado, description);
        Agenda = agenda;
        this.difficult = difficult;
        Duration = duration;
        this.itsOpen = itsOpen;

        this.clinicServices = clinicServices;
    }
}
