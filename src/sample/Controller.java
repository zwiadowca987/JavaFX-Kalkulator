package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Math.cos;
import static java.lang.StrictMath.sin;
import static java.lang.StrictMath.tan;

public class Controller implements Initializable{
    @FXML
    private TextField pole1;
    @FXML
    private TextField pole2;
    private double pole_dane1 = 0;
    private double pole_dane2 = 0;
    private String tekst1;
    private String tekst2;
    @FXML
    private Label wynik;
    @FXML
    private TextField rok;
    @FXML
    private TextField miesiac;
    private int mc = 0;
    private int year = 0;
    @FXML
    private Label ilosc_dni;
    @FXML
    private TextField cyfra1;
    @FXML
    private TextField cyfra2;
    private double cyfra11;
    private double cyfra22;
    @FXML
    private Label wynik2;

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

        try {
            pole_dane1 = (Double.parseDouble(tekst1));
            pole_dane2 = (Double.parseDouble(tekst2));

            wynik.setText(Double.toString(pole_dane1 - pole_dane2));
        }
        catch(NumberFormatException e) {
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

            wynik.setText(Double.toString(pole_dane1 * pole_dane2));
        }
        catch(NumberFormatException e) {
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
                wynik.setText(Double.toString(pole_dane1 / pole_dane2));
        }
        catch(NumberFormatException e)        {
            wynik.setText("Błąd w jednym z pól");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////

    public void sprawdz() {

        try
        {
            mc = (Integer.parseInt(miesiac.getText()));
            year = (Integer.parseInt(rok.getText()));

            switch(mc) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    ilosc_dni.setText("Ten miesiąc ma 31 dni");
                    break;

                case 4: case 6: case 9: case 11:
                    ilosc_dni.setText("Ten miesiąc ma 30 dni");
                    break;

                case 2:
                    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)ilosc_dni.setText("Ten miesiąc ma 29 dni");
                    else ilosc_dni.setText("Ten miesiąc ma 28 dni");
                    break;

                default:
                    ilosc_dni.setText("Nie istnieje taki miesiąc");
            }

        }
        catch(NumberFormatException e) {
            //System.out.println(e.getCause());
            ilosc_dni.setFont(Font.font ("Comic Sans MS", 25));
            ilosc_dni.setText("Błąd w jednym z pól");
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////

    public void pobierz() {
        try {
            cyfra11 = (Double.parseDouble(cyfra1.getText()));
            cyfra22 = (Double.parseDouble(cyfra2.getText()));
        }
        catch(NumberFormatException e) {
            wynik2.setFont(Font.font ("Comic Sans MS", 25));
            wynik2.setText("Błąd w jednym z pól");
        }

    }

    public void add() {
        pobierz();
        wynik2.setText(Double.toString(cyfra11 + cyfra22));
    }

    public void sub() {
        pobierz();
        wynik2.setText(Double.toString(cyfra11 - cyfra22));
    }

    public void mult() {
        pobierz();
        wynik2.setText(Double.toString(cyfra11 * cyfra22));
    }

    public void div() {
        pobierz();
        wynik2.setText(Double.toString(cyfra11 / cyfra22));
    }

    public void pow() {
        pobierz();
        wynik2.setText(Double.toString(Math.pow(cyfra11,  cyfra22)));
    }

    public void mod() {
        pobierz();
        wynik2.setText(Double.toString(cyfra11 % cyfra22));
    }

    public void sinus() {
        pobierz();
        wynik2.setText(Double.toString(Math.toRadians(sin(cyfra11))));
    }

    public void cosinus() {
        pobierz();
        wynik2.setText(Double.toString(Math.toRadians(cos(cyfra11))));
    }

    public void tn() {
        pobierz();
        wynik2.setText(Double.toString(Math.toRadians(tan(cyfra11))));
    }
}
