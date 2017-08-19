/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author manager
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField tfnombre;
    @FXML
    private TextField tfapellido;
    @FXML
    private TextField tfdatos;
    @FXML
    private ChoiceBox chanio;
     @FXML
    private TextField tfemail;
      @FXML
    private TextField tftelefono;
    
    
    @FXML private void accionMostrar (ActionEvent evento){
     
        String nombre = tfnombre.getText();
        String apellido = tfapellido.getText();
        String email = tfemail.getText();
        String telefono = tftelefono.getText();
//        String anio = chanio.getValue().toString();
        tfdatos.setText("Nombre: "+nombre+"Apellido: "+apellido+"Anio Nacimiento: "/*+anio*/+"E-mail: "+email+ "Numero telefonico"+telefono);
        
    }
    
    @FXML private void accionSalir (ActionEvent evento){
       System.exit(0);
        
        
    }
     @FXML private void accionInformacion (ActionEvent evento){
         JOptionPane.showMessageDialog(null, "Univercidad Interamericana de Panama\n\n"
                 + "Autor : Ariel lopez  Diaz\n"
                 + "Carrera: Ingenieria en sistemas\n"
                 + "Cuatrimestre: mayo-agosto-2017");
    }
    
     @FXML private void accionLimpiartodo (ActionEvent evento){
         tfnombre.setText(null);
         tfapellido.setText(null);
         tfdatos.setText(null);
         tfemail.setText(null);
     }
     
      
    
     
     
     
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tfnombre.setText("Escribe tu Nombre");
         tfapellido.setText("Escribe tu Apellido");
          tfemail.setText("Escribe tu E-mail");
           tftelefono.setText("Escribe tu Telefono");
    }    

    private void limpiarCasillas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
