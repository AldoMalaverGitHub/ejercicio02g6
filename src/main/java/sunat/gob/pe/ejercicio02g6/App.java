package sunat.gob.pe.ejercicio02g6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
    	
    	Button btnResumen = new Button("Resumen");
    	btnResumen.setPrefSize(90, 25);
    	
    	Button btnCreditos = new Button("Creditos");
    	btnCreditos.setPrefSize(90, 25);
    	
    	Button btnAhorros = new Button("Ahorros");
    	btnAhorros.setPrefSize(90, 25);
    	
    	Button btnMovimientos = new Button("Movimientos");
    	btnMovimientos.setPrefSize(90, 25);
    	
    	Button btnDeudas = new Button("Deudas");
    	btnDeudas.setPrefSize(90, 25);
    	
    	Button btnHistorial = new Button("Historial");
    	btnHistorial.setPrefSize(90, 25);
    	
    	HBox fila1 = new HBox(btnResumen, btnCreditos, btnAhorros);
    	fila1.setSpacing(10);
    	
    	HBox fila2 = new HBox(btnMovimientos, btnDeudas, btnHistorial);
    	fila2.setSpacing(10);
    	
    	VBox columna1 = new VBox(fila1, fila2);
    	columna1.setSpacing(10);
    	
    	Insets sangriaColumna1 = new Insets(30, 0, 0, 15);
    	columna1.setPadding(sangriaColumna1);
    	
    	Label lblUsuario = new Label("Usuario");
    	lblUsuario.setPrefSize(100, 20);
    	TextField txtUsuario = new TextField();
    	txtUsuario.setPromptText("<Ingrese un usuario>");
    	
    	Label lblPassword = new Label("Password");
    	PasswordField txtPassword = new PasswordField();
    	lblPassword.setPrefSize(100, 20);
    	txtPassword.setPromptText("<Ingrese un password>");
    	
    	Button btnLogin = new Button("Login");
    	btnLogin.setPrefSize(80, 25);
    	Button btnCancelar = new Button("Cancelar");
    	btnCancelar.setPrefSize(80, 25);
    	
    	HBox filaUsuario = new HBox(lblUsuario, txtUsuario);
    	HBox filaPass = new HBox(lblPassword, txtPassword);
    	HBox filaBotones = new HBox(btnLogin, btnCancelar);
    	filaBotones.setSpacing(35);
    	
    	Insets sangriaBotones = new Insets(15, 0, 0, 0);
    	filaBotones.setPadding(sangriaBotones);
    	filaBotones.setAlignment(Pos.CENTER);
    	
    	VBox columnaLogin = new VBox(filaUsuario, filaPass, filaBotones);
    	columnaLogin.setSpacing(10);
    	columnaLogin.setPadding(sangriaColumna1);	
    	
    	btnLogin.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hola");				
			}
		});
    	
    	var scene = new Scene(columnaLogin, 300, 160);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setMaximized(false);
        stage.setTitle("Mi primer formulario");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}