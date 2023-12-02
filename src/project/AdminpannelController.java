/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class AdminpannelController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

        
    

    @FXML
    private void addemployeeonclick(ActionEvent event) { 
        
        try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("Add employee.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.setTitle("Admin pannel l");
            window.show();
        } catch (IOException ex) {
            System.out.print("can't load the file");
        }
    }
    


    @FXML
    private void deleteemployeeonclick(ActionEvent event) {
        
        try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("Delete_employee.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.setTitle("Admin pannel 3");
            window.show();
        } catch (IOException ex) {
            System.out.print("can't load the file");
        }
        
        
        
        
    }

    @FXML
    private void reguest_maintenance_break_onclick(ActionEvent event) {
        try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("Request_maintanence_break.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.setTitle("Admin pannel 2");
            window.show();
        } catch (IOException ex) {
            System.out.print("can't load the file");
        }
        
        
    }

    @FXML
    private void logout_button_onclick(ActionEvent event) {
        
        Alert alert=new Alert(Alert.AlertType.WARNING);
        alert.setContentText("Are you sure to log out ");
        alert.showAndWait();
        
        try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.show();
        } catch (IOException ex) {
            System.out.print("can't load the file");
        }
    } 
        
    }

    
    
    
    

