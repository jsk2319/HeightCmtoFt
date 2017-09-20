/**
 *@author jsk2319@email.vccs.edu
 * Author: Jude Kallista-Fitzpatrick
 * Purpose: To convert height in centimeters to inches and feet by using JOptionPane and JavaFX
 */


import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.awt.*;
import java.util.Optional;
import java.awt.Dimension;
import javax.swing.*;

public class HeightCmtoFt extends Application{

    public void start(Stage primaryStage) {

        Toolkit JFXtoolkit = Toolkit.getDefaultToolkit();
        Dimension screenDimension = JFXtoolkit.getScreenSize();
        double screenWidth = screenDimension.getWidth();
        double screenHeight = screenDimension.getHeight();

        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setTitle("Enter Height");
        inputDialog.setHeaderText("Centimeters to Feet and Inches Converter");
        inputDialog.setContentText("Enter your height in centimeters.");
        inputDialog.setX(826);
        inputDialog.setY(0);
        Optional<String> result = inputDialog.showAndWait();

        //Establishing Integers
        int screenWidth1;
        int screenHeight1;

        //Asking for and taking user input in JOptionPane
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        screenWidth1 = (int) dimension.getWidth();
        screenHeight1 = (int) dimension.getHeight();
        JOptionPane pane = new JOptionPane("Enter your height in centimeters. ");
        JDialog dialog;
        pane.setWantsInput(true);
        dialog = pane.createDialog("Centimeters to feet and inches Converter");

        //sets location of first window
        dialog.setLocation(0,450);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);


        //Convert to Inches
        double JFXheightCm = Double.parseDouble(result.get());
        double JFXheightInches = JFXheightCm*0.39;

        //Convert to Feet
        int JFXheightFeet = (int)JFXheightInches / 12;
        int JFXheightInchesInt = (int)JFXheightInches;
        int JFXheightRemainderInches = JFXheightInchesInt%12;

        //Convert String to Double
        double heightCm = Double.parseDouble((String)(pane.getInputValue()));

        //Convert Centimters to Inches
        double heightInches = heightCm * 0.39;


        //Convert Inches to Feet
        int heightFeet = (int)heightInches / 12;
        int heightInchesInt = (int)heightInches;
        int heightRemainderInches = heightInchesInt%12;


        //Displaying JFX results
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.getDialogPane().setPrefSize(350,200);
        alert.setHeight(500);
        alert.setTitle("Centimeters to Feet and Inches Converter");
        alert.setContentText("Your height in centimeters is " + JFXheightCm + "\n Your height in inches is " + JFXheightInches + " inches" + "\n Your height in feet is " + JFXheightFeet + " feet and " + JFXheightRemainderInches + " inches");
        System.out.println(alert.getWidth());
        System.out.println(alert.getHeight());
        alert.setX(826);
        alert.setY(850);
        alert.showAndWait();

        //Display height in Centimeters, Inches, and Feet
        JOptionPane resultPane = new JOptionPane("Your height in centimeters is " + (pane.getInputValue()) + "\n Your height in inches is " + heightInches + " inches" + "\n Your height in feet is " + heightFeet + " feet and " + heightRemainderInches + " inches");
        JDialog resultDialog;
        resultDialog = resultPane.createDialog("Result");
        resultDialog.setLocation(1652,450);
        resultDialog.setAlwaysOnTop(true);
        resultDialog.setVisible(true);
    }
}
