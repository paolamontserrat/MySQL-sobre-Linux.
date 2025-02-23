package productos;

public class Agrega {

    private int ID;
    private String Nombre;
    private String Serie;
    private String color;
    private String Observacion;
    private String Descripcion;
    private String Tipo;
    private String Area;
    private String Fecha;

    public Agrega(int ID, String Nombre, String Serie, String color, String Opservacion, String Descripcion, String Tipo, String Area, String Fecha) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Serie = Serie;
        this.color = color;
        this.Observacion = Opservacion;
        this.Descripcion = Descripcion;
        this.Tipo = Tipo;
        this.Area = Area;
        this.Fecha = Fecha;
    }

    public Agrega() {
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setObservacion(String Opservacion) {
        this.Observacion = Opservacion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getSerie() {
        return Serie;
    }

    public String getColor() {
        return color;
    }

    public String getObservacion() {
        return Observacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getArea() {
        return Area;
    }

    public String getFecha() {
        return Fecha;
    }

}
