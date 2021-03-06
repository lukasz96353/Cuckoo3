package controllers;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import model.SQLite;

public class cpeController implements Initializable{
	
    @FXML
    private BorderPane pePane;

    @FXML
    private Button drawButton;

    @FXML
    private Button checkButton;

    @FXML
    private Button clearButton;

    @FXML
    private TextArea polishWord;

    @FXML
    private TextArea englishWord;

    @FXML
    private TextArea translate;

    @FXML
    private TextArea resoult;
    
    @FXML
    private Button startButton;

    @FXML
    private ProgressBar progressBar;
    
    int randID;
    
    public int getRandomID() {
    	return randID;
    }
    
    public void setRandomID(int randomID) {
    	randID = randomID;
    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		SQLite base = new SQLite();
		Random rand = new Random();
				
		drawButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {	
				    setRandomID(rand.nextInt(base.baseSize()));
					polishWord.setText(base.getWordA(getRandomID()));				
			}
		});
		
		checkButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				englishWord.setText(base.getWordB(getRandomID()));
				if (translate.getText().equals(englishWord.getText())) {
					resoult.setText("RIGHT !");
				} else {
					resoult.setText("FALSE !");
				}
			}
		});
		
		clearButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				englishWord.clear();
				polishWord.clear();
				translate.clear();
				resoult.clear();
				setRandomID(0);
			}
		});
		
		startButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				for(int i=0;i<20;i++) {
					
					
					
					
					
					
					
				}
				
			}
		});
		
	}

}
