package herencia;

import java.util.ArrayList;
import java.util.List;

public  class ClinicaVeterinaria {
    protected int ID;
    protected String Description;
    protected States Estado;

    public ClinicaVeterinaria(int id, States Estado, String description) {
    	this.ID= id;
    	this.Description = description;
        if(Estado == null) {
            this.Estado = States.PENDIENTE;
        } else {
            this.Estado = Estado;
        }

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
