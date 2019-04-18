package application;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;

public class ImageTextCell extends ListCell<Book>
{
	private VBox vbox = new VBox(8.0);
	private ImageView thumbImageView = new ImageView();
	private Label label = new Label();
	
	public ImageTextCell()
	{
		vbox.setAlignment(Pos.CENTER);
		
		thumbImageView.setPreserveRatio(true);
		thumbImageView.setFitHeight(100);
		vbox.getChildren().add(thumbImageView);
		
		label.setWrapText(true);
		label.setTextAlignment(TextAlignment.CENTER);
		vbox.getChildren().add(label);
		
		this.setPrefWidth(USE_PREF_SIZE);
	}
	
	@Override
	protected void updateItem(Book item, boolean empty)
	{
		super.updateItem(item, empty);
		
		if(empty || item == null)
		{
			this.setGraphic(null);
		}
		else
		{
			thumbImageView.setImage(new Image(item.getThumbImage()));
			label.setText(item.getTitle());
			this.setGraphic(vbox);
		}
	}
}
