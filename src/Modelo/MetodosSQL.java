package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MetodosSQL {
    
    public boolean buscarProducto(Producto producto){
                     
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;
               
        String sql = "SELECT * FROM producto WHERE nombre_producto = '" + producto.getNombre() + "'";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){               
                producto.setCodigo(rs.getInt(1));   
                return true;
            }
            return false;
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }      
    }
    
    public boolean cargarTipoProductos(JComboBox comboBox){
                     
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;                       
        
        String sql = "SELECT tipoProducto FROM tipo_producto";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            comboBox.addItem("Seleccione una opción");
            
            while(rs.next()){
                comboBox.addItem(rs.getString("tipoProducto"));
            }
            return true;
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }      
    }  
    
    public boolean validarProveedor(Proveedor proveedor){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;                       
        
        String sql = "SELECT * " + " FROM proveedor WHERE nombre_proveedor = '" + proveedor.getNombre() + "'";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                proveedor = proveedor;
                proveedor.setCodigo(rs.getInt(1));
                return true;
            }
            return false;
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }
    }
    
    public boolean validarSucursal(Sucursal sucursal){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;                       
        
        String sql = "SELECT * " + " FROM sucursal WHERE nombre_sucursal = '" + sucursal.getNombre() + "'";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                sucursal = sucursal;
                return true;
            }
            return false;
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }
    }
    
    public boolean agregarPedido(Producto producto, Proveedor proveedor, Sucursal sucursal, Pedido pedido){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "INSERT INTO pedidos (id_pedido, producto, proveedor, sucursal, tipo_producto, cantidad, estado) VALUES  (NULL, " + producto.getCodigo() + ", " + proveedor.getCodigo()  + ", '" + sucursal.getNombre() + "', '" + producto.getTipo() + "', " + pedido.getCantidad() + ", 'Completado'" + ")";
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        } 
    }
    
    public boolean iniciarSesion(Acceso datos){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;                       
        
        String sql = "SELECT * " + " FROM acceso WHERE curp = '" + datos.getCurp() + "'";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                if(rs.getString(1).equals(datos.getCurp()) && rs.getString(2).equals(datos.getContraseña())){
                    return true;
                }                
            }
            return false;
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }
    }
    
    public boolean altaPersonal(Personal datos){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "INSERT INTO personal (curp, nombre, apellidoPaterno, apellidoMaterno) VALUES  (" + "'" + datos.getCurp() + "', '" + datos.getNombre()  + "', '" + datos.getApellidoPaterno() + "', '" + datos.getApellidoMaterno() + "')";
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        } 
    }
    
    public boolean registrarse(Acceso datos){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "INSERT INTO acceso (curp, contraseña) VALUES  (" + "'" + datos.getCurp() + "', '" + datos.getContraseña() + "')";
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        } 
    }
    
    public boolean validarCurp(Personal datos){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;                       
        
        String sql = "SELECT * FROM personal WHERE curp = '" + datos.getCurp() + "'";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                return true;                                
            }
            return false;
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }
    }
    
    public boolean cancelarPedido(Pedido datos){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "UPDATE pedidos SET estado = 'Cancelado' WHERE id_pedido = " + datos.getId_pedido();
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }     
    }
    
    public boolean idProducto(Producto datos){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;                       
        
        String sql = "SELECT codigo_producto FROM producto WHERE nombre_producto = '" + datos.getNombre() + "'";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                datos.setCodigo(rs.getInt(1));
                return true;                                
            }
            return false;
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }
    }
    
    public boolean idProveedor(Proveedor datos){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;                       
        
        String sql = "SELECT codigo_proveedor FROM proveedor WHERE nombre_proveedor = '" + datos.getNombre() + "'";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                datos.setCodigo(rs.getInt(1));
                return true;                                
            }
            return false;
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }
    }
    
    public boolean modificarPedido(Producto producto, Pedido pedido, Proveedor proveedor, Sucursal sucursal){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "UPDATE pedidos SET producto = " + producto.getCodigo() + ", proveedor = " + proveedor.getCodigo() + ", sucursal = '" + sucursal.getNombre() + "' , tipo_producto = '" + producto.getTipo() + "'" + ", cantidad = " + pedido.getCantidad() + ", estado = 'Completado'" +  " WHERE id_pedido = " + pedido.getId_pedido();
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }     
    }
}
