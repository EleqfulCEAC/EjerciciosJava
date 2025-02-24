package herencia;

public class Pacientes extends ClinicaVeterinaria {
    private String DateOfAlta;
    private String typeOfAnimal;
    private String medicalHistory;
    private boolean easyWorkAnimal;

    public Pacientes(int id, States Estado, String description, String dateOfAlta, String typeOfAnimal, String medicalHistory, boolean easyWorkAnimal) {
        super(id, Estado, description);
        DateOfAlta = dateOfAlta;
        this.typeOfAnimal = typeOfAnimal;
        this.medicalHistory = medicalHistory;
        this.easyWorkAnimal = easyWorkAnimal;
    }

    public void showInfo(){
        System.out.println("ID del paciente: " + getID() );
        System.out.println("Estado del paciente: " + getEstado());
        System.out.println("Tipo de Animal: " + this.typeOfAnimal);
        System.out.println("Fecha de alta: " + this.DateOfAlta);
        System.out.println("Historial medico: " + this.medicalHistory);
    }

}
