public class Mascota {
    private String nombre;
    private String tipo;
    private String raza;
    private String color;
    private String tamanio;

    public Mascota(String nombre, String tipo, String raza, String color, String tamanio) {
        if (nombre == null || nombre.isEmpty() || tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("Nombre y tipo no pueden ser nulos o vacíos");
        }
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public String getRaza() { return raza; }
    public String getColor() { return color; }
    public String getTamanio() { return tamanio; }

    public String getDescripcion() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return getDescripcion();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mascota mascota = (Mascota) o;
        return nombre.equals(mascota.nombre) && tipo.equals(mascota.tipo);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nombre, tipo);
    }
}