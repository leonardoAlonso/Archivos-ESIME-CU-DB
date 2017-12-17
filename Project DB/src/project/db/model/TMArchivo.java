/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.db.model;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;
import javax.swing.JOptionPane;
import project.db.controller.Controller;

/**
 *
 * @author Leonardo
 */
public class TMArchivo implements TableModel {
    private List<Archivo> archivo;
    public TMArchivo(List<Archivo> archivo){
        this.archivo = archivo;
    }
            
    
    @Override
    public int getRowCount() {
        return archivo.size();
    }

    @Override
    public int getColumnCount() {
       return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
       String title = null;
        switch(columnIndex){
            case 0:
                title = "id";
                break;
            case 1:
                title = "nombre";
                break;
            case 2:
                title = "puntos";
                break;   
            case 3:
                title = "descargas";
                break;
            case 4:
                title = "costo";
                break;
        }
        return title;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
       return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Archivo a = archivo.get(rowIndex);
        String valor = null;
         switch(columnIndex){
            case 0:
                valor = String.valueOf(a.getId());
                break;
            case 1:
                valor = a.getNombre();
                break;
            case 2:
                valor = String.valueOf(a.getPuntos());
                break;   
            case 3:
                valor =  String.valueOf(a.getNum_Descargas());
                break;
            case 4: 
                valor =  String.valueOf(a.getCosto());
        }
         return valor;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Archivo a = archivo.get(rowIndex); 
        Controller con  = new Controller();
        switch(columnIndex){
            case 1:
                a.setNombre(aValue.toString());
                con.update_nombre_archivo(aValue.toString(), a.getId());
                JOptionPane.showMessageDialog(null, "Datos actualizados");
                break;
            case 4:
                a.setCosto(Double.parseDouble(aValue.toString()));
                con.update_precio_archivo(Double.parseDouble(aValue.toString()), a.getId());
                JOptionPane.showMessageDialog(null, "Datos actualizados");
                break;
        }
    }
    
    @Override
    public void addTableModelListener(TableModelListener l) {   
    }
    @Override
    public void removeTableModelListener(TableModelListener l) {   
    }   
}