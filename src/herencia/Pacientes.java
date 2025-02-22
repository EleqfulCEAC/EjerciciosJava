package herencia;

import java.util.List;

public class Pacientes extends ClinicaVeterinaria {
    private String DateOfAlta;
    private String typeOfAnimal;
    private String medicalHistory;
    private boolean easyWorkAnimal;

    public Pacientes(int ID, States estado, String description,  String medicalHistory, String typeOfAnimal, boolean easyWorkAnimal, String dateOfAlta) {
        super(ID, estado, description);
        this.medicalHistory = medicalHistory;
        this.typeOfAnimal = typeOfAnimal;
        this.easyWorkAnimal = easyWorkAnimal;
        this.DateOfAlta = dateOfAlta;
    }

    public void showInfo(){
        System.out.println("ID del paciente: " + getID() );
        System.out.println("Estado del paciente: " + getEstado());
        System.out.println("Tipo de Animal: " + this.typeOfAnimal);
        System.out.println("Fecha de alta: " + this.DateOfAlta);
        System.out.println("Historial medico: " + this.medicalHistory);
    }
}
