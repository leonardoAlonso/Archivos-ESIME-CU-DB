/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.db.model;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;

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
        return false;
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
        switch(columnIndex){
            case 0:
                a.setAlumno_id(Integer.parseInt(aValue.toString()));
                break;
            case 1:
                a.setNombre(aValue.toString());
            case 2:
                a.setPuntos(Integer.parseInt(aValue.toString()));
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