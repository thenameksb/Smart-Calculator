package calculator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calculator extends Application{
		
		public void start(Stage meineStage) throws Exception {
			//eine Instanz von FXMLLoader erzeugen
			FXMLLoader meinLoader = new FXMLLoader(getClass().getResource("calculator.fxml"));
			//die Datei laden
			Parent root = meinLoader.load();
			//den Controller beschaffen
			FXMLController meinController = meinLoader.getController();
			//und die Bühne übergeben
			meinController.setMeineStage(meineStage);
			//die Szene erzeugen
			//an den Konstruktor werden der oberste Knoten und die Größe übergeben
			Scene meineScene = new Scene(root, 310, 435);
			//den Titel über stage setzen
			meineStage.setTitle("\t \t CalcuNerd \t \t      v.1337");
			//die Szene setzen
			meineStage.setScene(meineScene);
			//und anzeigen
			meineStage.show();
	
		}

		public static void main(String[] args) {
			//der Start
			launch(args);
		}
	}
