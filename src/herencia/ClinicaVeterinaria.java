package herencia;

import java.util.ArrayList;
import java.util.List;

public  class ClinicaVeterinaria {
    private int ID;
    private String Description;
    private States Estado;

    public ClinicaVeterinaria(int id, States estado, String description) {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public States getEstado() {
        return Estado;
    }

    public void setEstado(States estado) {
        Estado = estado;
    }
}
