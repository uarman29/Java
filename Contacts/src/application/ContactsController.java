package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.ListCell;
import javafx.util.Callback;
import javafx.event.ActionEvent;
import java.util.Comparator;

public class ContactsController 
{

    @FXML private TextField firstNameDisplayTextField;
    @FXML private TextField lastNameDisplayTextField;
    @FXML private TextField emailDisplayTextField;
    @FXML private TextField phoneDisplayTextField;
    
    @FXML private TextField firstNameTextField;
    @FXML private TextField lastNameTextField;
    @FXML private TextField phoneTextField;
    @FXML private TextField emailTextField;
    
    @FXML private GridPane displayPane;
    @FXML private Button addButton;
    @FXML private Button removeButton;
    @FXML private Button updateButton;
    
    @FXML private ListView<Contact> contactsListView;
    
    private ObservableList<Contact> contacts = FXCollections.observableArrayList();
    
    public void initialize()
    {
    	contacts.add(new Contact("John","Smith","johnsmith29@email.com","123456789"));
    	contacts.add(new Contact("Mary","Smith","marysmith10@email.com","123123123"));
    	contacts.add(new Contact("Jack","Daniels","jd420@email.com","646646646"));
    	contacts.add(new Contact("Winne","the Pooh","honeyMan@email.com","555555555"));
    	contacts.add(new Contact("John","Wick","dogLover99@email.com","666666666"));
    	contacts.add(new Contact("Lord","Max","whatisThis@email.com","897648039"));
    	contacts.add(new Contact("Teddy","Roosevelt","president1901@email.com","346928019"));
    	contacts.add(new Contact("Farhan","Zaman","fzel1024@email.com","347646212"));
    	contacts.add(new Contact("Maximillian","Pegasus","yugiBoy69@email.com","696969696"));
    	contacts.add(new Contact("Ash","Ketchup","catchEmAll151@email.com","767896510"));
    	contactsListView.setItems(contacts);
    	
    	displayPane.setOpacity(0);
    	
    	contactsListView.getSelectionModel().selectedItemProperty().addListener
    	(
    		new ChangeListener<Contact>()
    		{
    			@Override
    			public void changed(ObservableValue<? extends Contact> ov, Contact oldValue, Contact newValue)
    			{
    				if(!contacts.isEmpty() && newValue != null)
    				{
	    				firstNameDisplayTextField.setText(newValue.getFirstName());
	    				lastNameDisplayTextField.setText(newValue.getLastName());
	    				emailDisplayTextField.setText(newValue.getEmail());
	    				phoneDisplayTextField.setText(newValue.getPhoneNumber());
	    				displayPane.setOpacity(1);
    				}
    			}
    		}
    	);
    }
    
    public void addContact(ActionEvent e)
    {
    	if(firstNameTextField.getText().isEmpty())
    	{
    		firstNameTextField.requestFocus();
    		return;
    	}
    	
    	if(lastNameTextField.getText().isEmpty())
    	{
    		lastNameTextField.requestFocus();
    		return;
    	}
    	
    	contacts.add(new Contact(firstNameTextField.getText(),lastNameTextField.getText(),
    							 emailTextField.getText(),phoneTextField.getText()));
    	
    	contactsListView.refresh();
    }
    
    public void updateContact(ActionEvent e)
    {
    	if(firstNameDisplayTextField.getText().isEmpty())
    	{
    		firstNameDisplayTextField.requestFocus();
    		return;
    	}
    	
    	if(lastNameDisplayTextField.getText().isEmpty())
    	{
    		lastNameDisplayTextField.requestFocus();
    		return;
    	}
    	
    	int index = contactsListView.getSelectionModel().getSelectedIndex();
    	contacts.get(index).setFirstName(firstNameDisplayTextField.getText());
    	contacts.get(index).setLastName(lastNameDisplayTextField.getText());
    	contacts.get(index).setEmail(emailDisplayTextField.getText());
    	contacts.get(index).setPhoneNumber(phoneDisplayTextField.getText());
    	
    	contactsListView.refresh();
    }
    
    public void removeContact(ActionEvent e)
    {
    	if(contacts.isEmpty())
    		return;
    	
    	int index = contactsListView.getSelectionModel().getSelectedIndex();
    	if(index < 0)
    		return;
    	
    	contacts.remove(index);
    	contactsListView.refresh();
    	if(contacts.isEmpty())
    		displayPane.setOpacity(0);
    }
}
