/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndtt.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class Myalert {
    private static Myalert instance;
    private final Alert alert;
    private Myalert(){
        this.alert= new Alert(Alert.AlertType.INFORMATION);
        this.alert.setTitle("Quiz App");
        this.alert.setHeaderText("Quiz App");
        this.alert.setContentText("Coming soon..");
        this.alert.showAndWait();
    }
    
    public static Myalert getInstance(){
        if (instance == null)
            instance = new Myalert();
        return instance;
    }
    
    public void showMsg(String msg){
        this.alert.setContentText(msg);
        this.alert.showAndWait();
    }
}
