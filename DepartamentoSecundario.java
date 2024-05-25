import java.util.ArrayList;

public class DepartamentoSecundario extends DepartamentoC {

    public DepartamentoSecundario(boolean ceo, int empleados, String nombre) { // el ceo para departamentos secundarios
                                                                               // sera un departamento principal
        super(ceo, empleados, nombre);
    }

    public void execute() { // si el CEO (en este caso para departamentos secundarios es un departamento principal) ordena 
        if (CEO) { // el ceo ordena al departamento secundario

            System.out.println(
                    "Ejecutando operacion de departamento secundario " + super.get_nombre() + " por mandato del CEO"); // el
                                                                                                                      // departamento
                                                                                                                      // secundario
                                                                                                                      // responde

        } else {

            System.out.println("El CEO no ha solicitado acciones");
        }

    }
}