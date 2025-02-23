package productos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AreasDao {
    private Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
public boolean agregarArea(Area area) {
        String sql = "INSERT INTO AREAS (id, nombre, ubicacion) VALUES (?, ?, ?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, area.getId());
            ps.setString(2, area.getNombre());
            ps.setString(3, area.getUbicacion());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al agregar Area: " + e.getMessage());
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
            }

        }
    }    

public boolean ModificarArea(Area area) {
        String sql = "UPDATE AREAS SET nombre = ?, ubicacion = ? WHERE id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareCall(sql);

            ps.setString(1, area.getNombre());
            ps.setString(2, area.getUbicacion());
            ps.setInt(3, area.getId());
            ps.execute();
            
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }

public boolean EliminarArea(Area area) {
        String sql = "delete from AREAS where id= ?";
        try {
            con = cn.getConnection();
            ps = con.prepareCall(sql);
            ps.setInt(1, area.getId());
            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }

public boolean ExisteID(String id) {
        boolean existe = false;

        try (Connection con = cn.getConnection()) {
            String sql = "SELECT COUNT(*) FROM AREAS WHERE id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                existe = rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al verificar ID: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.getMessage());
            }
        }

        return existe;
    }

public List ListarAreas() {
        List<Area> ListaArea = new ArrayList();
        String sql = "SELECT * FROM AREAS ";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Area add = new Area();
                add.setId(rs.getInt("id"));
                add.setNombre(rs.getString("nombre"));
                add.setUbicacion(rs.getString("ubicacion"));
                
                ListaArea.add(add);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaArea;
    }
}
