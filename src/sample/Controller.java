package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {

    ArrayList<String> numbersArray = new ArrayList<String>();
    int resultat = 0;

    @FXML
    private TextField talDisplay;

    public void plusMetode(ActionEvent actionEvent) {
        String s = talDisplay.getText();
        numbersArray.add(s);
        talDisplay.clear();
        System.out.println(s + " er nu tilføjet. ");


    }

    public void equalsMetode(ActionEvent actionEvent) {

        // Indlæser en string fra texfeltet
        String s = talDisplay.getText();

        // Tilføjer s til arrayet
        numbersArray.add(s);

        // Visker textfeltet rent
        talDisplay.clear();

        System.out.println(s + " er nu tilføjet. ");

        // Dette er et eksempel på EXCEPTIONS i java (try-catch)
        try {
            // Lægger alle tal sammen i arrayet
            for (String number : numbersArray) {
                System.out.println(number);
                resultat += Integer.parseInt(number);
            }
        }
        // Fanger kun NumberFormatExceptions
        catch (NumberFormatException e) {
            System.out.println("Obs NumberFormatException" + e.getCause() + e.getMessage());
        }
        // Fanger alle exceptions
        catch (Exception e) {
            System.out.println("Uforudset Exception" + e.getCause() + e.getMessage() + e.getClass());
        }

        System.out.println("Det virker endnu");

        // Setter resultater i displayet
        talDisplay.setText(Integer.toString(resultat));
    }
}
