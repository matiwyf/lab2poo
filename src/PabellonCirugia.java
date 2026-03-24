import java.util.Objects;

public class PabellonCirugia {
    private int numero;
    private String especialidad;
    private Estado  estado;
    public PabellonCirugia(int numero,  String especialidad) {
        this.numero = numero;
        this.especialidad = especialidad;
    }

    public int getNumero() {
        return numero;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "PabellonCirugia{" +
                "numero=" + numero +
                ", especialidad='" + especialidad + '\'' +
                ", estado=" + estado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PabellonCirugia that = (PabellonCirugia) o;
        return numero == that.numero && Objects.equals(especialidad, that.especialidad) && estado == that.estado;
    }

    public void setOcupado(boolean b) {
        this.estado = estado;
    }
}
