package it.polito.tdp.alien;

import java.net.URL;
import java.util.Dictionary;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.AlienDictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	private AlienDictionary model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label txtAlien;

    @FXML
    private TextField txtParole;

    @FXML
    private Button btnTraslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnPulisci;

    @FXML
    void doReset(ActionEvent event) {
    	model.resetDizionario();
    	txtResult.clear();
    	txtParole.clear();
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String[] parole=txtParole.getText().toLowerCase().split(" ");
    	
    	if(parole.length == 2) {
    		model.addParola(parole[0], parole[1]);
    		txtResult.setText("parola aggiunta");
    	}else {
    		txtResult.setText(model.traslationWord(txtParole.getText().trim()));
    	}
    	
    }

    @FXML
    void initialize() {
        assert txtAlien != null : "fx:id=\"txtAlien\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtParole != null : "fx:id=\"txtParole\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTraslate != null : "fx:id=\"btnTraslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnPulisci != null : "fx:id=\"btnPulisci\" was not injected: check your FXML file 'Alien.fxml'.";
        
        
    }

	public void setModel(AlienDictionary model) {
		
		this.model= model;
		
	}
}
