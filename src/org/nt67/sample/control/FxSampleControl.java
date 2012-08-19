package org.nt67.sample.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FxSampleControl {
    @FXML
	private TextField txtOperatorA;

    @FXML
	private TextField txtOperatorB;

    @FXML
	private Label lblOperand;

    @FXML
	private Label lblAnswer;

    @FXML
	protected void calculation(ActionEvent e){
	Long operatorA = Long.valueOf(this.txtOperatorA.getText());
	Long operatorB = Long.valueOf(this.txtOperatorB.getText());
	Long answer = operatorA + operatorB;
	this.lblAnswer.setText(answer.toString());
    }
}