package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

import javax.print.DocFlavor;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private TextField pole1 = new TextField();
    @FXML
    private TextField pole2  = new TextField();
    private double pole_dane1 = 0;
    private double pole_dane2 = 0;
    private String tekst1;
    private String tekst2;
    @FXML
    private Label wynik = new Label();
/*
    @FXML
    private void handleButtonAction(ActionEvent event) {
        tekst1 = pole1.getText();
        tekst2 = pole2.getText();

        try
        {
            pole_dane1 = (Double.parseDouble(tekst1));
            pole_dane2 = (Double.parseDouble(tekst2));

            if(true) {
                wynik.setText((String)(pole_dane1 + "" + pole_dane2));
            }
        }
        catch(NumberFormatException e)
        {
            wynik.setText("Błąd w jednym z pól");
        }
    }
*/
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //
    }

    public void suma() {
        tekst1 = pole1.getText();
        tekst2 = pole2.getText();

        try
        {
            pole_dane1 = (Double.parseDouble(tekst1));
            pole_dane2 = (Double.parseDouble(tekst2));

            wynik.setText(Double.toString(pole_dane1 + pole_dane2));
        }
        catch(NumberFormatException e)
        {
            wynik.setText("Błąd w jednym z pól");
        }
    }

    public void roznica() {
        tekst1 = pole1.getText();
        tekst2 = pole2.getText();

        try
        {
            pole_dane1 = (Double.parseDouble(tekst1));
            pole_dane2 = (Double.parseDouble(tekst2));

            wynik.setText(Double.toString(pole_dane1 - pole_dane2));
        }
        catch(NumberFormatException e)
        {
            wynik.setText("Błąd w jednym z pól");
        }
    }

    public void iloczyn() {
        tekst1 = pole1.getText();
        tekst2 = pole2.getText();

        try
        {
            pole_dane1 = (Double.parseDouble(tekst1));
            pole_dane2 = (Double.parseDouble(tekst2));

            wynik.setText(Double.toString(pole_dane1 - pole_dane2));
        }
        catch(NumberFormatException e)
        {
            wynik.setText("Błąd w jednym z pól");
        }
    }

    public void iloraz() {
        tekst1 = pole1.getText();
        tekst2 = pole2.getText();

        try
        {
            pole_dane1 = (Double.parseDouble(tekst1));
            pole_dane2 = (Double.parseDouble(tekst2));

            if(pole_dane2 == 0) {
                wynik.setFont(Font.font ("Comic Sans MS", 15));
                wynik.setText("Pamiętaj cholero, nie dziel przez 0!");
            }

            else
            wynik.setText(Double.toString(pole_dane1 - pole_dane2));
        }
        catch(NumberFormatException e)
        {
            wynik.setText("Błąd w jednym z pól");
        }
    }
}
