package productos;

public class Area {
    private int id;
    private String Nombre;
    private String Ubicacion;

    public Area(int id, String Nombre, String Ubicacion) {
        this.id = id;
        this.Nombre = Nombre;
        this.Ubicacion = Ubicacion;
    }
    
    public Area(){
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }
    
    
}
