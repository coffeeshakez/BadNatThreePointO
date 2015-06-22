package javafx;

import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public final class MessageBubble extends VBox {

	
	public static VBox createBubble(String message, String sender, ScrollPane textArea, Image image){
		
		VBox vbox = new VBox();

		Label msg = new Label(message);
		msg.getStyleClass().add("chat-bubble");
		msg.setWrapText(true);

		Label username = new Label(sender + "Sendt @ 23:42:10");
		username.getStyleClass().add("username");

		ImageView iv2 = new ImageView(image);

		iv2.setFitWidth(20);
		iv2.setPreserveRatio(true);
		iv2.setSmooth(true);
		iv2.setCache(true);

		msg.setGraphic(iv2);

		msg.setMinWidth(textArea.getWidth() - 30);
		msg.setMaxWidth(textArea.getWidth() - 30);

		vbox.getChildren().add(username);
		vbox.getChildren().add(msg);
		
		return vbox;

	}

}