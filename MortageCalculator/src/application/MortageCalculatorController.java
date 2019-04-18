package application;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class MortageCalculatorController 
{
	private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
	
	private int years = 30;
	
	private BigDecimal loanAmount;
	
	@FXML
    private Label loanAmountLabel;

    @FXML
    private Label yearLabel;

    @FXML
    private Label monthlyPaymentLabel;

    @FXML
    private TextField principalTextField;

    @FXML
    private Button calculateButton;

    @FXML
    private TextField downPaymentTextField;

    @FXML
    private Slider timeSlider;

    @FXML
    private TextField interestTextField;


    public void initialize()
	{
		currency.setRoundingMode(RoundingMode.HALF_UP);
		
		timeSlider.valueProperty().addListener
		(
			new ChangeListener<Number>()
			{
				@Override
				public void changed(ObservableValue<? extends Number> ov,Number oldValue,Number newValue)
				{
					years = newValue.intValue();
					yearLabel.setText(years+" Years");
					calculatePayments(new ActionEvent());
				}
			}
				
		);
	}
	    @FXML
	    void calculatePayments(ActionEvent event) 
	    {
	    	BigDecimal principal = new BigDecimal(0);
	    	BigDecimal downPayment = new BigDecimal(0);
	    	BigDecimal interest;
	    	try
			{
				principal = new BigDecimal(principalTextField.getText());
				if(principal.compareTo(BigDecimal.ZERO)<0)
					throw new IllegalArgumentException();
			}
			catch(Exception ex)
			{
				principalTextField.selectAll();
				principalTextField.requestFocus();
				return;
			}
	    	
	    	try
			{
				downPayment = new BigDecimal(downPaymentTextField.getText());
				if(downPayment.compareTo(BigDecimal.ZERO)<0)
					throw new IllegalArgumentException();
			}
			catch(Exception ex)
			{
				downPaymentTextField.selectAll();
				downPaymentTextField.requestFocus();
				return;
			}
	    	
	    	try
			{
				interest = new BigDecimal(interestTextField.getText());
				if(interest.compareTo(BigDecimal.ZERO)<0)
					throw new IllegalArgumentException();
			}
			catch(Exception ex)
			{
				interestTextField.selectAll();
				interestTextField.requestFocus();
				return;
			}
	    	
	    	if(downPayment.compareTo(principal)>0)
	    	{
	    		downPaymentTextField.setText(downPayment+" is larger than principal");
	    		downPaymentTextField.selectAll();
	    		downPaymentTextField.requestFocus();
	    		
				return;
	    	}
	    	
	    	loanAmount = principal.subtract(downPayment);
	    	loanAmountLabel.setText(currency.format(loanAmount));
	    	
	    	BigDecimal toDecimal = new BigDecimal(12*100);
	    	int months = years*12;
	    	BigDecimal monthlyInterest = interest.divide(toDecimal,10,RoundingMode.HALF_UP);
	    	
	    	BigDecimal numerator = (monthlyInterest.add(BigDecimal.ONE)).pow(months);
	    	numerator = numerator.multiply(monthlyInterest);
	    	numerator = numerator.multiply(loanAmount);
	    	
	    	BigDecimal denominator = (monthlyInterest.add(BigDecimal.ONE)).pow(months);
	    	denominator = denominator.subtract(BigDecimal.ONE);
	    	
	    	BigDecimal monthlyPayments = numerator.divide(denominator,10,RoundingMode.HALF_UP);
	    	monthlyPaymentLabel.setText(currency.format(monthlyPayments));
	    	
	    }
}
