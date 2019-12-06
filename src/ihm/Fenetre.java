package ihm;
import java.io.File;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
/*public class Fenetre extends Application{
	
	public void start(final Stage primaryStage) {
		final File file = new File("VID_20191206_010554.mp4"); 
	    final String MEDIA_URL = file.toURI().toString(); 
		Button play = new Button();
		Button video = new Button();
		Button quit = new Button();
		Media pick = new Media(MEDIA_URL);
	
	
        play.setText("Jouer");
        video.setText("Video");
        quit.setText("Quitter");
        StackPane root = new StackPane();
        root.widthProperty();
        root.heightProperty();
        MediaPlayer media = new MediaPlayer(pick);
        final MediaView mediaView = new MediaView(media);
		 
        
        VBox vbox = new VBox();
        vbox.setPrefWidth(100);
        vbox.getChildren().add(play);
        vbox.getChildren().add(video);
        vbox.getChildren().add(quit);
        play.setMinWidth(vbox.getPrefWidth());
		video.setMinWidth(vbox.getPrefWidth());
		quit.setMinWidth(vbox.getPrefWidth());
        vbox.setAlignment(Pos.CENTER);
        root.getChildren().add(vbox);
        
        Scene scene = new Scene(root, 450, 250);

        primaryStage.setTitle("Leroy Merlin, THE GAME");
        primaryStage.setScene(scene);
        primaryStage.show();
        quit.setOnAction(e -> Platform.exit());
        play.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent event) {
            	
            }
        });
        
        video.setOnAction(new EventHandler<ActionEvent>() {
       	 
            @Override
            public void handle(ActionEvent event) {
            	StackPane secondaryLayout = new StackPane();
                secondaryLayout.getChildren().setAll(mediaView); 
 
                Scene secondScene = new Scene(secondaryLayout, 500, 300);
            	mediaView.fitWidthProperty().bind(root.widthProperty()); 
                mediaView.fitHeightProperty().bind(root.heightProperty()); 
                Stage newWindow = new Stage();
                newWindow.setTitle("Aide");
                newWindow.setScene(secondScene);
                newWindow.setX(primaryStage.getX() + 300);
                newWindow.setY(primaryStage.getY() + 200);
 
                newWindow.show();
            	media.play();
            }
        });


        
        
	}
 
	public static void main(String[] args) {
	    launch(args);
	}
}
*/
