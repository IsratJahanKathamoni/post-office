/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class AddEmployeeController implements Initializable {

    @FXML
    private TextField newemployeenametextfield;
    @FXML
    private TextField salarytextfield;
   
    @FXML
    private TextField employeeidtextfield;
    @FXML
    private TextArea outputsectiontextarea;
    @FXML
    private TextField employecontactnumbertextfeild;
    @FXML
    private TextField joining_date_textfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back_bottononclick(ActionEvent event) {
        
        try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("adminpannel.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.setTitle("Admin psnne l");
            window.show();
        } catch (IOException ex) {
            System.out.print("can't load the file");
        }
    }

    @FXML
    private void Show_onclick(ActionEvent event)
    {
        
        
        
        
        
        
                  outputsectiontextarea.setText("");
      // outputTextArea.setText("");
        File f = null;
        FileInputStream fis = null;
        //BufferedInputStream bis = null;
        DataInputStream dis = null;
        String str="";
        try {
            f = new File("addemp.bin");
            if(!f.exists()){
                outputsectiontextarea.setText("Oops! Emp.bin binary file does not exist...");
            }
            else{
                
                fis = new FileInputStream(f);
                //bis = new BufferedInputStream(fis);
                //dis = new DataInputStream(bis);
                dis = new DataInputStream(fis);
                //String str="";
                while(true){
                    str+= "Employee name :"+dis.readUTF()+"\n"
                        +" id :"+dis.readUTF()+"\n"
                        +" salary:"+dis.readUTF()+"\n"
                        +" joining date :"+dis.readUTF()+"\n"
                     +" contact number :"+dis.readUTF()+"\n";
                       
                    //outputTextArea.setText(str);
                }//while
                //outputTextArea.setText(str);
            }//else
        } catch (IOException ex) {
            outputsectiontextarea.setText(str);
           // Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException ex) {
             //   Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }

  
       /*outputsectiontextarea.clear();
        File f = null;
        
        Scanner sc; String str; String[] tokens;
        try {
            f = new File("saveemp.txt");
            sc = new Scanner(f);
            if(f.exists()){
                outputsectiontextarea.appendText("Content of emp records:\n");
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    outputsectiontextarea.appendText(
                            tokens[0]+","
                            +tokens[1]+","
                            +tokens[2]+","
                            +tokens[3]+","
                            +tokens[4]+"\n"                    
                    );
                }
            }
            else 
                outputsectiontextarea.setText("emp file is not found,please contact with the authority");
        } 
        catch (IOException ex) {
            System.out.print("cant load");
        } 
    }*/
      
       
        
       
    
    

    @FXML
    private void Submit_bottononclick(ActionEvent event) {
        
              File f = null;
        FileOutputStream fos = null;
        //BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("addemp.bin");
            if(f.exists())
            {
                fos = new FileOutputStream(f,true);
            }
            else
            {
                fos = new FileOutputStream(f);
            }
            
            //bos = new BufferedOutputStream(fos);
            //dos = new DataOutputStream(bos);
            dos = new DataOutputStream(fos);
            
            //dos.writeInt(Integer.parseInt(idTextField.getText()));
            dos.writeUTF(newemployeenametextfield.getText());
            dos.writeUTF(employeeidtextfield.getText());
             dos.writeUTF(salarytextfield.getText());
              dos.writeUTF(joining_date_textfield.getText());
               dos.writeUTF(employecontactnumbertextfeild.getText());
               // dos.writeUTF(outputsectiontextarea.getText());
           // dos.writeFloat(Float.parseFloat(salaryTextField.getText()));

        }
        catch (IOException ex)
        {
          //  Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally 
        {
            try 
            {
                if(dos != null) dos.close();
            }
            catch (IOException ex)
            {
               // Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       
    }

 
        
        
        
        
    }
        
        /*File f = null;
        FileWriter fw = null;
      
        try {
            f = new File("saveemp.txt"); 
             fw = new FileWriter(f);
            fw.write
        (
            	newemployeenametextfield.getText()+","
                 +employeeidtextfield.getText()+","
                 +salarytextfield.getText()+","
                 +employecontactnumbertextfeild.getText()+","
                 +joingdatedatepeaker.getValue()+","
               
            );           
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setContentText("Data has been saved  successfully!");
            alert.showAndWait();
        }
        catch (IOException ex)
        {
            System.out.print("cant load the file!");
        } 
        finally
        {
            try 
            {
                if(fw != null) fw.close();
            }
            catch (IOException ex)
            {
                System.out.print("can not load the file!");
            }
        }
    }
    
}*/
