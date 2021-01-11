package empleadoED_29203578h;

import java.util.*;

/**
 * Ejercicio práctico examen EVAL 1 ED
 *
 * @author SERGIO GARCÍA ÁLVAREZ
 * @version 1.0
 */
public class EmpleadoED_29203578H {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;

    /**
     * Constructor con tres parámetros
     *
     * @param nombreCompleto nombre completo en mayúsculas
     * @param dni documento nacional de identidad con letra y sin espacios
     */
    public EmpleadoED_29203578H(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    /**
     * Calcula el salario bruto mensual en función del salario base por hora y
     * las horas extras El preio por hora de la hora extra se determina con la
     * constante FACTOR_HORA_EXTRA
     *
     * @param horasExtra número de horas extra dedicadas redondeado a la baja
     * (entero)
     *
     * @return devuelve el salario bruto mensual en euros con dos decimales
     */
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora
                * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    // Este método no lo comentaremos con JavaDoc
    public static void main(String[] args) {
        // !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE LÍNEA
        EmpleadoED_29203578H emp = new EmpleadoED_29203578H("SERGIO GARCÍA ÁLVAREZ", "29203578H");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra) + " euros, al hacer " + horasExtra + " horas extra.");
    }
}
