package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private TextField pole1 = new TextField();
    private TextField pole2  = new TextField();
    private double pole_dane1 = 0;
    private double pole_dane2 = 0;
    private String tekst1;
    private String tekst2;
    private Label wynik = new Label();

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //
    }
}
