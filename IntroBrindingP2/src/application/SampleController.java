package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;

public class SampleController implements Initializable{

    @FXML
    private ProgressBar Progress;

    @FXML
    private Slider Slider;

    @FXML
    private ProgressIndicator Indicator;

    private Nombre num = new Nombre();
    
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		num.setNombre(0);
		Progress.progressProperty().bind(num.nombreProperty());
		Indicator.progressProperty().bind(num.nombreProperty());
		Slider.valueProperty().bindBidirectional(num.nombreProperty());
	}
	
	@FXML
	private void ajouter()
	{
		num.setNombre(num.getNombre()+0.1);
	}
	
	@FXML
	private void diminuer()
	{
		num.setNombre(num.getNombre()-0.1);
	}

}
