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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class Collectmail_from_city_mailboxController implements Initializable {

    @FXML
    private TextField mailbox_no_textfield;
    @FXML
    private TextField mailbox_zone;
    @FXML
    private TextField number_of_mail_collected_textfeild;
    @FXML
    private TextField outputsectiontextarea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submit_onclick(ActionEvent event) {
   
        
                
       File f = null;
        FileOutputStream fos = null;
        //BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("collect_city_mail.bin");
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
            dos.writeUTF(mailbox_no_textfield.getText());
            dos.writeUTF( mailbox_zone.getText());
             dos.writeUTF(number_of_mail_collected_textfeild.getText());
             
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

    

        
        
        
        /* File f = null;
        FileWriter fw = null;
      
        try {
            f = new File("saveemp.txt"); 
             fw = new FileWriter(f);
            fw.write
        (
            	 mailbox_no_textfield.getText()+","
                 +mailbox_zone.getText()+","
                 +number_of_mail_collected_textfeild.getText()+","
                
               
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
    }*/
     
    

    @FXML
    private void show_onclick(ActionEvent event) {
                  outputsectiontextarea.setText("");
      // outputTextArea.setText("");
        File f = null;
        FileInputStream fis = null;
        //BufferedInputStream bis = null;
        DataInputStream dis = null;
        String str="";
        try {
            f = new File("collect_city_mail.bin");
            if(!f.exists()){
                outputsectiontextarea.setText("Oops! collect_city_mail_box.bin binary file does not exist...");
            }
            else{
                
                fis = new FileInputStream(f);
                //bis = new BufferedInputStream(fis);
                //dis = new DataInputStream(bis);
                dis = new DataInputStream(fis);
                //String str="";
                while(true){
                    str+= "mailbox no:"+dis.readUTF()+"\n"
                        +" mail zone:"+dis.readUTF()+"\n"
                        +" Number of collected main:"+dis.readUTF()+"\n";
                       
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

    @FXML
    private void back_onclick(ActionEvent event) {
        
        try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("mail_collector_and_processor.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.setTitle("Mail collector and processor 2");
            window.show();
        } catch (IOException ex) {
            System.out.print("can't load the file");
        }
    } 
        
    

    }
       /* outputsectiontextarea.clear();
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
                           
                            +"\n"                    
                    );
                }
            }
            else 
                outputsectiontextarea.setText("emp file is not found,please contact with the authority");
        } 
        catch (IOException ex) {
            System.out.print("cant load");
        } 
    }

    @FXML
    private void back_onclick(ActionEvent event) {
        
        try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("mail_collector_and_processor.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.setTitle("main collector and processor 2");
            window.show();
        } catch (IOException ex) {
            System.out.print("can't load the file");
        }
    }
    
}*/
