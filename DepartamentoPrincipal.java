import java.util.ArrayList;

public class DepartamentoPrincipal extends DepartamentoC{

    private ArrayList<DepartamentoI> secundarios;

    public DepartamentoPrincipal(boolean ceo, int empleados, String nombre) {

        super(ceo, empleados, nombre);
        ArrayList<DepartamentoI> secundarios = new ArrayList<>();
    }

    public void set_secundarios(ArrayList<DepartamentoI> dep) {
        this.secundarios = dep;
    }

    public ArrayList<DepartamentoI> get_secundarios() {
        return secundarios;
    }

    public void add_departamento(DepartamentoI dep) {
        secundarios.add(dep);
    }

    public void delete_departamento(DepartamentoI dep) {
        secundarios.remove(dep);
    }

    public void execute() {

        if (CEO) { // si el CEO (en este caso para departamentos secundarios es un departamento principal) ordena 

            for (DepartamentoI dep : secundarios) {// el departamento principal al mando del respectivo departamento secundario le
                // ordena al departamento secundario

                dep.execute(); // cada uno de los departamentos secundarios al mando del respectivo
                               // departamento principal responde

                // si hay otro departamento principal bajo algunos de estos departamentos secundarios entonces
                // tambien responderan y si ordena a sus departamentos secundarios responderan
                // tambien
            }

        } else {

            System.out.println("El CEO no ha ordenado acciones");
        }
    }
}