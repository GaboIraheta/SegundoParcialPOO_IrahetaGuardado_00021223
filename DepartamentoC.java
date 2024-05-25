public abstract class DepartamentoC implements DepartamentoI {

    protected boolean CEO; //este atributo solo es para indicar si el ceo ha ordenado alguna accion al departamento o no
    private int numero_empleados;
    private String nombre;

    public void set_CEO(boolean ceo) {
        this.CEO = ceo;
    }

    public boolean get_CEO() {
        return CEO;
    }

    public void set_empleados(int numero) {
        this.numero_empleados = numero;
    }

    public int get_empleados() {
        return numero_empleados;
    }

    public void set_nombre(String nombre) {
        this.nombre = nombre;
    }

    public String get_nombre() {
        return nombre;
    }

    public DepartamentoC(boolean ceo, int empleados, String nombre) {
        this.CEO = ceo;
        this.numero_empleados = empleados;
        this.nombre = nombre;
    }

    public abstract void execute();
}
