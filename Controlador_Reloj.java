import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Controlador_Reloj {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAvanzarHora;

    @FXML
    private Button btnAvanzarMinutos;

    @FXML
    private Button btnAvanzarSegundos;

    @FXML
    private Button btnRetrocederHoras;

    @FXML
    private Button btnRetrocederMinutos;

    @FXML
    private Button btnRetrocederSegundos;

    @FXML
    private ImageView imgAdorno;

    @FXML
    private Label lblHora;

    @FXML
    private Label lblHorario;

    @FXML
    private Label lblMinutero;

    @FXML
    private Label lblMinuto;

    @FXML
    private Label lblSegundero;

    @FXML
    private Label lblSegundo;

    @FXML
    private Label lblTitulo;

    @FXML
    private TextField txtHora;

    @FXML
    private TextField txtMinutos;

    @FXML
    private TextField txtSegundos;
    
    private Reloj reloj;
    
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    
    
    @FXML
    void inAvanzarHorario(ActionEvent event) {
        System.out.println("Evento boton avanzar horario");
        hour = (hour + 1 + 13) % 13;
        actualizarGUI();

    }

    @FXML
    void inAvanzarMinutero(ActionEvent event) {
        System.out.println("Evento boton avanzar minutero");
        minute = (minute + 5 + 60) % 60;
        actualizarGUI();

    }

    @FXML
    void inAvanzarSegundero(ActionEvent event) {
        System.out.println("Evento boton avanzar segundero");
        second = (second + 5 + 60) % 60;
        actualizarGUI();
    }

    @FXML
    void inRetrocederHorario(ActionEvent event) {
        System.out.println("Evento Retroceder Horario");
        hour = (hour - 1 + 13) % 13;
        actualizarGUI();
    }

    @FXML
    void inRetrocederMinutero(ActionEvent event) {
        System.out.println("Evento Retroceder minutero");
        minute = (minute - 5 + 60) % 60;
        actualizarGUI();
    }

    @FXML
    void inRetrocederSegundero(ActionEvent event) {
        System.out.println("Evento Retroceder segundero");
        second = (second - 5 + 60) % 60;
        actualizarGUI();
    }
    
    private void actualizarGUI(){
        // String horas = String.valueOf(reloj.getHoras());
        // String minutos = String.valueOf(reloj.getMinutos());
        // String segundos = String.valueOf(reloj.getSegundos());
        
        txtHora.setText(String.format("%02d", hour));
        txtMinutos.setText(String.format("%02d", minute));
        txtSegundos.setText(String.format("%02d", second));
        
    }

    @FXML
    void initialize() {
        assert btnAvanzarHora != null : "fx:id=\"btnAvanzarHora\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert btnAvanzarMinutos != null : "fx:id=\"btnAvanzarMinutos\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert btnAvanzarSegundos != null : "fx:id=\"btnAvanzarSegundos\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert btnRetrocederHoras != null : "fx:id=\"btnRetrocederHoras\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert btnRetrocederMinutos != null : "fx:id=\"btnRetrocederMinutos\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert btnRetrocederSegundos != null : "fx:id=\"btnRetrocederSegundos\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert imgAdorno != null : "fx:id=\"imgAdorno\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert lblHora != null : "fx:id=\"lblHora\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert lblHorario != null : "fx:id=\"lblHorario\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert lblMinutero != null : "fx:id=\"lblMinutero\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert lblMinuto != null : "fx:id=\"lblMinuto\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert lblSegundero != null : "fx:id=\"lblSegundero\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert lblSegundo != null : "fx:id=\"lblSegundo\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert txtHora != null : "fx:id=\"txtHora\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert txtMinutos != null : "fx:id=\"txtMinutos\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        assert txtSegundos != null : "fx:id=\"txtSegundos\" was not injected: check your FXML file 'RelojElonMusk.fxml'.";
        
        reloj = new Reloj();
        actualizarGUI();
    }

}
