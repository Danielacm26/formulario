# Formulario de Controles

Este formulario de controles es una aplicación  que muestra una variedad de controles de interfaz de usuario, como botones, casillas de verificación, enlaces, botones de alternancia, botones de radio, etiquetas, campos de texto, campos de contraseña, áreas de texto, indicadores de progreso y deslizadores.

## Controles incluidos

- **Botón:** Un botón que el usuario puede hacer clic.
- **CheckBox:** Una casilla de verificación que el usuario puede marcar o desmarcar.
- **Hipervínculo:** Un enlace de texto simulado que se puede hacer clic.
- **ToggleButton:** Un botón que se puede activar o desactivar.
- **RadioButton:** Un botón de opción que permite al usuario seleccionar una opción de una lista.
- **Etiqueta:** Un componente que muestra texto no editable.
- **TextField:** Un campo de texto de una línea que permite al usuario ingresar texto.
- **PasswordField:** Un campo de texto para ingresar contraseñas.
- **TextArea:** Un área de texto de varias líneas para ingresar texto largo.
- **ProgressIndicator:** Un indicador de progreso que indica que se está realizando una tarea, sin mostrar un valor específico.
- **ProgressBar:** Una barra de progreso que indica el progreso de una tarea.
- **Slider:** Un control deslizante que permite al usuario seleccionar un valor de un rango.

## Funcionamiento

Al ejecutar la aplicación, se abrirá una ventana que contiene todos los controles mencionados anteriormente. Cada control está etiquetado para identificar su función. Los usuarios pueden interactuar con los controles según su propósito y funcionalidad.

## Ejecución

[![Captura-de-pantalla-232.png](https://i.postimg.cc/rwZS8zRf/Captura-de-pantalla-232.png)](https://postimg.cc/TKmy0d9b)

## codigo

````phppackage formulario;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class formulario extends Application {
```

    @Override
    public void start(Stage primaryStage) {
        // Configurar el diseño principal
        GridPane root = new GridPane();
        root.setPadding(new Insets(10));
        root.setHgap(10);
        root.setVgap(10);

        // Añadir un botón
        Label buttonLabel = new Label("Button:");
        Button button = new Button("Button");
        root.add(buttonLabel, 0, 0);
        root.add(button, 1, 0);

        // Añadir un CheckBox
        Label checkBoxLabel = new Label("CheckBox:");
        CheckBox checkBox = new CheckBox("CheckBox");
        root.add(checkBoxLabel, 0, 1);
        root.add(checkBox, 1, 1);

        // Añadir un Hyperlink
        Label hyperlinkLabel = new Label("Hyperlink:");
        Hyperlink hyperlink = new Hyperlink("Hyperlink");
        root.add(hyperlinkLabel, 0, 2);
        root.add(hyperlink, 1, 2);

        // Añadir un ToggleButton
        Label toggleButtonLabel = new Label("ToggleButton:");
        ToggleButton toggleButton = new ToggleButton("ToggleButton");
        root.add(toggleButtonLabel, 0, 3);
        root.add(toggleButton, 1, 3);

        // Añadir un RadioButton
        Label radioButtonLabel = new Label("RadioButton:");
        RadioButton radioButton = new RadioButton("RadioButton");
        root.add(radioButtonLabel, 0, 4);
        root.add(radioButton, 1, 4);

        // Añadir un Label
        Label labelLabel = new Label("Label:");
        Label label = new Label("Label");
        root.add(labelLabel, 0, 5);
        root.add(label, 1, 5);

        // Añadir un TextField
        Label textFieldLabel = new Label("TextField:");
        TextField textField = new TextField("some text...");
        root.add(textFieldLabel, 0, 6);
        root.add(textField, 1, 6);

        // Añadir un PasswordField
        Label passwordFieldLabel = new Label("PasswordField:");
        PasswordField passwordField = new PasswordField();
        passwordField.setText("password");
        root.add(passwordFieldLabel, 0, 7);
        root.add(passwordField, 1, 7);

        // Añadir un TextArea
        Label textAreaLabel = new Label("TextArea:");
        TextArea textArea = new TextArea("This is very long text that will wrap to several lines.");
        root.add(textAreaLabel, 0, 8);
        root.add(textArea, 1, 8);

        // Añadir un ProgressIndicator
        Label progressIndicatorLabel = new Label("ProgressIndicator:");
        ProgressIndicator progressIndicator = new ProgressIndicator();
        root.add(progressIndicatorLabel, 0, 9);
        root.add(progressIndicator, 1, 9);

        // Añadir un ProgressBar
        Label progressBarLabel = new Label("ProgressBar:");
        ProgressBar progressBar = new ProgressBar(0.9);
        root.add(progressBarLabel, 0, 10);
        root.add(progressBar, 1, 10);

        // Añadir un Slider
        Label sliderLabel = new Label("Slider:");
        Slider slider = new Slider();
        root.add(sliderLabel, 0, 11);
        root.add(slider, 1, 11);

        // Crear la escena
        Scene scene = new Scene(root, 800, 600);

        // Configurar el escenario principal
        primaryStage.setTitle("All Controls");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```
