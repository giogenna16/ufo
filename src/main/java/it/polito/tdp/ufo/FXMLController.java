package it.polito.tdp.ufo;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.ufo.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class FXMLController {
    
	private Model model;
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> boxForma;

    @FXML
    private Button btnConta;

    @FXML
    private TextArea txtResult;
    
    @FXML
    void handleConta(ActionEvent event) {
    	String forma= boxForma.getValue();
    	int count= this.model.getCountByForma(forma);
    	
    	this.txtResult.setText("Gli UFO di forma "+forma+" sono: "+ count);
    	

    }
    
    public void setModel(Model model) {
		this.model=model;
		this.boxForma.getItems().addAll(this.model.getFormeUFO());
		
	}    

    @FXML
    void initialize() {
        assert boxForma != null : "fx:id=\"boxForma\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnConta != null : "fx:id=\"btnConta\" was not injected: check your FXML file 'Scene.fxml'.";

    }
	
}
