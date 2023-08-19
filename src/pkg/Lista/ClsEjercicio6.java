package pkg.Lista;

public class ClsEjercicio6 {

    private String nombre;
    private double sueldo_base;
    private double descuentos;
    private double sueldo_luquido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getSueldo_luquido() {
        return sueldo_luquido;
    }


    public void ejercicio(){
        ClsEjercicio6 ej=new ClsEjercicio6();
        ej.setNombre("Juan");
        ej.setSueldo_base(3500);
        ej.setDescuentos(500);
    }


    }
}
