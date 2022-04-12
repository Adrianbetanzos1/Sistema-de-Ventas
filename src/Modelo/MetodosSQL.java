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
               
        String []datos = new String[6];
        
        String sql = "SELECT * FROM producto WHERE nombre_producto = '" + producto.getNombre() + "'";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
            }
            return true;
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
            
            while(rs.next()){
                proveedor = proveedor;
            }
            return true;
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
            
            while(rs.next()){
                sucursal = sucursal;
            }
            return true;
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }
    }
    /*
    public boolean agregarPedido( ){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "INSERT INTO pedidos (tipoDescuento, porcentajeDescuento) VALUES  ('" + datos.getTipoDescuento() + "', '" + datos.getPorcentajeDescuento() + "')";
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        } 
    }
    */
    
}
