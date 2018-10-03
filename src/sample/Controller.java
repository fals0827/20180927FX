package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    public Button bt00;
    public Button bt01;
    public Button bt02;
    public Button bt10;
    public Button bt11;
    public Button bt12;
    public Button bt20;
    public Button bt21;
    public Button bt22;
    public Button btRE;
    public Label victor;
    boolean a = true;

    public void Ev00 (ActionEvent event){
        if (a){
            bt00.setText("O");
            a = !a;
        }else {
            bt00.setText("X");
            a = !a;
        }
        bt00.setDisable(true);
        scan();
    }
    public void Ev01 (ActionEvent event){
        if (a){
            bt01.setText("O");
            a = !a;
        }else {
            bt01.setText("X");
            a = !a;
        }
        bt01.setDisable(true);
        scan();
    }
    public void Ev02 (ActionEvent event){
        if (a){
            bt02.setText("O");
            a = !a;
        }else {
            bt02.setText("X");
            a = !a;
        }
        bt02.setDisable(true);
        scan();
    }
    public void Ev10 (ActionEvent event){
        if (a){
            bt10.setText("O");
            a = !a;
        }else {
            bt10.setText("X");
            a = !a;
        }
        bt10.setDisable(true);
        scan();
    }
    public void Ev11 (ActionEvent event){
        if (a){
            bt11.setText("O");
            a = !a;
        }else {
            bt11.setText("X");
            a = !a;
        }
        bt11.setDisable(true);
        scan();
    }
    public void Ev12 (ActionEvent event){
        if (a){
            bt12.setText("O");
            a = !a;
        }else {
            bt12.setText("X");
            a = !a;
        }
        bt12.setDisable(true);
        scan();
    }
    public void Ev20 (ActionEvent event){
        if (a){
            bt20.setText("O");
            a = !a;
        }else {
            bt20.setText("X");
            a = !a;
        }
        bt20.setDisable(true);
        scan();
    }
    public void Ev21 (ActionEvent event){
        if (a){
            bt21.setText("O");
            a = !a;
        }else {
            bt21.setText("X");
            a = !a;
        }
        bt21.setDisable(true);
        scan();
    }
    public void Ev22 (ActionEvent event){
        if (a){
            bt22.setText("O");
            a = !a;
        }else {
            bt22.setText("X");
            a = !a;
        }
        bt22.setDisable(true);
        scan();
    }
    public void scan (){
        if (bt00.getText() == bt01.getText() && bt00.getText() ==bt02.getText() && bt00.getText() != null){
            victor.setText(bt00.getText() + " Win!");
        }else if (bt10.getText() == bt11.getText() && bt10.getText() ==bt12.getText() && bt10.getText() != null){
            victor.setText(bt10.getText() + " Win!");
        }else if (bt20.getText() == bt21.getText() && bt20.getText() ==bt22.getText() && bt20.getText() != null){
            victor.setText(bt20.getText() + " Win!");
        }else if (bt00.getText() == bt10.getText() && bt00.getText() ==bt20.getText() && bt00.getText() != null){
            victor.setText(bt00.getText() + " Win!");
        }else if (bt01.getText() == bt11.getText() && bt01.getText() ==bt21.getText() && bt01.getText() != null){
            victor.setText(bt01.getText() + " Win!");
        }else if (bt02.getText() == bt12.getText() && bt02.getText() ==bt22.getText() && bt02.getText() != null){
            victor.setText(bt02.getText() + " Win!");
        }else if (bt00.getText() == bt11.getText() && bt00.getText() ==bt22.getText() && bt00.getText() != null){
            victor.setText(bt00.getText() + " Win!");
        }else if (bt02.getText() == bt11.getText() && bt02.getText() ==bt20.getText() && bt02.getText() != null){
            victor.setText(bt02.getText() + " Win!");
        }
    }
    public void EvReset (ActionEvent event){
        bt00.setDisable(false);
        bt01.setDisable(false);
        bt02.setDisable(false);
        bt10.setDisable(false);
        bt11.setDisable(false);
        bt12.setDisable(false);
        bt20.setDisable(false);
        bt21.setDisable(false);
        bt22.setDisable(false);
        victor.setText(null);
        bt00.setText(null);
        bt01.setText(null);
        bt02.setText(null);
        bt10.setText(null);
        bt11.setText(null);
        bt12.setText(null);
        bt20.setText(null);
        bt21.setText(null);
        bt22.setText(null);
    }
}
