package productos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class productosDao {

    private Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean agregarProducto(Agrega producto) {
        String sql = "INSERT INTO inventario (id, nombreCorto, descripcion, serie, color, fechaAdquisicion, TipoAdquisicion, observaciones, AREAS_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, producto.getID());
            ps.setString(2, producto.getNombre());
            ps.setString(3, producto.getDescripcion());
            ps.setString(4, producto.getSerie());
            ps.setString(5, producto.getColor());
            ps.setString(6, producto.getFecha());
            ps.setString(7, producto.getTipo());
            ps.setString(8, producto.getObservacion());
            ps.setInt(9, Integer.parseInt(producto.getArea()));

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al agregar el libro: " + e.getMessage());
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

    public boolean ModificarProducto(Agrega product) {
        String sql = "UPDATE inventario SET nombreCorto = ?, descripcion = ?, serie = ?, color = ?, fechaAdquisicion = ?, TipoAdquisicion = ?, observaciones = ?, AREAS_id = ? WHERE id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareCall(sql);

            ps.setString(1, product.getNombre());
            ps.setString(2, product.getDescripcion());
            ps.setString(3, product.getSerie());
            ps.setString(4, product.getColor());
            ps.setString(5, product.getFecha());
            ps.setString(6, product.getTipo());
            ps.setString(7, product.getObservacion());
            ps.setString(8, product.getArea());
            ps.setInt(9, product.getID());
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

    public boolean eliminarproducto(Agrega product) {
        String sql = "delete from inventario where id= ?";
        try {
            con = cn.getConnection();
            ps = con.prepareCall(sql);
            ps.setInt(1, product.getID());
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

    public void cargarBoxAreas(JComboBox<String> comboBox) {
        try {
            con = conexion.getConnection();
            String sql = "SELECT ID, Nombre FROM AREAS";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            comboBox.removeAllItems();

            while (rs.next()) {
                int id = rs.getInt("id"); 
                String nombre = rs.getString("Nombre"); 
                comboBox.addItem(id + ". " + nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
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
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean ExisteID(String id) {
        boolean existe = false;

        try (Connection con = cn.getConnection()) {
            String sql = "SELECT COUNT(*) FROM inventario WHERE id = ?";
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

    public List ListarProductos() {
        List<Agrega> Listaproducts = new ArrayList();
        String sql = "SELECT * FROM inventario ";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Agrega add = new Agrega();
                add.setID(rs.getInt("id"));
                add.setNombre(rs.getString("nombreCorto"));
                add.setDescripcion(rs.getString("descripcion"));
                add.setSerie(rs.getString("serie"));
                add.setColor(rs.getString("color"));
                add.setFecha(rs.getString("fechaAdquisicion"));
                add.setTipo(rs.getString("TipoAdquisicion"));
                add.setObservacion(rs.getString("observaciones"));
                add.setArea(rs.getString("Areas_id"));
                Listaproducts.add(add);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listaproducts;
    }
}
