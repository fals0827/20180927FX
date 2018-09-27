package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

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
    }

}
