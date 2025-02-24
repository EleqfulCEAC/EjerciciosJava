package herencia;



public class pruebaClinica {

    public static void main(String[] args) {
        Pacientes Perro = new Pacientes( 25, States.EN_PROCESO,  "Animal de cuatro patas",  "25-12-05", "Perro", "Animal sano", true);

            Perro.showInfo();

        Services Paciente25 = new Services(Perro.getID(), States.EN_PROCESO, "Servicios del paciente", LevelOfDifficult.INTERMEDIO, 60, true, "Varios" );

                Paciente25.addAgenda(Perro);
                Paciente25.changeState(Perro, States.REVISADO);

                Perro.showInfo();}


}
