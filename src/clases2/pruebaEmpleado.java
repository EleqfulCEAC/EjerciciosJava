package clases2;

public class pruebaEmpleado {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado(25, "Kirito", "Manager", 50.000); 
		emp1.ShowInfo();
		emp1.UpgradeCategory("CEO");
		emp1.UpgradeSalary(200);
		emp1.ShowInfo();

	}

}
