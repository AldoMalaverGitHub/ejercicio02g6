package sunat.gob.pe.ejercicio02g6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
    	/*HBox fila = new HBox();
    	Button btnActual = new Button("Actual");
    	Button btnProyectado = new Button("Proyectado");
    	fila.getChildren().addAll(btnActual, btnProyectado);*/
    	
    	Button btnActual = new Button("Actual");
    	btnActual.setPrefSize(100, 25);
    	Button btnProyectado = new Button("Proyectado");
    	btnProyectado.setPrefSize(100, 25);
    	Button btnEsperado = new Button("Esperado");
    	btnEsperado.setPrefSize(100, 25);
    	HBox fila = new HBox(btnActual, btnProyectado, btnEsperado);
    	fila.setSpacing(10);
   
    	Insets sangria = new Insets(10, 0, 0, 10);
    	fila.setPadding(sangria); 
    	
    	Label lblData = new Label("Data");
    	lblData.setStyle("-fx-font-weight:bold"); //CSS
    	
    	Insets sangriaVertical = new Insets(0, 0, 0, 15);
    	
    	Label lblVentas = new Label("Ventas");
    	lblVentas.setPadding(sangriaVertical);
    	Label lblMarketing = new Label("Marketing");
    	lblMarketing.setPadding(sangriaVertical);
    	Label lblDistribucion = new Label("Distribucion");
    	lblDistribucion.setPadding(sangriaVertical);
    	Label lblCostos = new Label("Costos");
    	lblCostos.setPadding(sangriaVertical);
    	
    	VBox columna = new VBox(lblData, lblVentas, lblMarketing, lblDistribucion, lblCostos);
    	Insets sangriaColumna = new Insets(15, 0, 0, 15);
    	columna.setPadding(sangriaColumna);
    	
    	var scene = new Scene(columna, 640, 480);
        stage.setScene(scene);
        stage.setTitle("Mi primer formulario");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}