package gui;

import Clash.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class StretGUI extends Application {
	private Button vytvorBojovnikovTlacidlo = new Button("Vytvor bojovnikov");
	private Button spustStretTlacidlo = new Button("Spust stret");
	private TextField rytieri = new TextField();
	private TextField statocniRytieri = new TextField();
	private TextField zliObri = new TextField();
	private Label rytieriOzn = new Label("Rytieri");
	private Label statocniRytieriOzn = new Label("Statocni rytieri");
	private Label zliObriOzn = new Label("Zli obri");
	private TextArea vypis = new TextArea();
	private ScrollPane skrol = new ScrollPane();
	
	private EnergyRytierov energiaBojovnikov;
	
	public void start(Stage hlavneOkno) {
		hlavneOkno.setTitle("Stret");
		
		FlowPane pane = new FlowPane();
		
		Game game = new Game();
		
		pane.getChildren().add(vytvorBojovnikovTlacidlo);
		pane.getChildren().add(spustStretTlacidlo);
		pane.getChildren().add(rytieri);
		pane.getChildren().add(rytieriOzn);
		pane.getChildren().add(statocniRytieri);
		pane.getChildren().add(statocniRytieriOzn);
		pane.getChildren().add(zliObri);
		pane.getChildren().add(zliObriOzn);
		pane.getChildren().add(vypis);
		
		skrol.setContent(pane);
		
 		vytvorBojovnikovTlacidlo.setOnAction(e -> {
			game.vytvorBojovnikov(Integer.parseInt(rytieri.getText()),
					Integer.parseInt(statocniRytieri.getText()),
					Integer.parseInt(zliObri.getText()));

			vypis.appendText("Bojovnici vytvoreni.\n");
			}
		);

 		spustStretTlacidlo.setOnAction(e -> vypis.appendText(game.stret()));
 		
		energiaBojovnikov = new EnergyRytierov(game);
		game.pridajSledovatela(energiaBojovnikov);
		pane.getChildren().add(energiaBojovnikov);

		hlavneOkno.setScene(new Scene(skrol, 500, 300));
		hlavneOkno.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}







/*
import java.io.*;

public class StretGUI extends Application {
	private Button vytvorBojovnikovTlacidlo = new Button("Vytvor bojovnikov");
	private Button dalsiStretTlacidlo = new Button("Dalsi stret");
	private TextField rytieri = new TextField();
	private TextField statocniRytieri = new TextField();
	private TextField zliObri = new TextField();
	private Label rytieriOzn = new Label("Rytieri");
	private Label statocniRytieriOzn = new Label("Statocni rytieri");
	private Label zliObriOzn = new Label("Zli obri");
	private TextArea vypis = new TextArea();
	private ScrollPane skrol = new ScrollPane();

	private Button ulozTlacidlo = new Button("Uloz");
	private Button nacitajTlacidlo = new Button("Nacitaj");
	
	private EnergiaBojovnikov energiaBojovnikov;
	
	public void start(Stage hlavneOkno) {
		hlavneOkno.setTitle("Stret");
		
		FlowPane pane = new FlowPane();
		
		Stret stret = new Stret();
		
		pane.getChildren().add(vytvorBojovnikovTlacidlo);
		pane.getChildren().add(dalsiStretTlacidlo);
		pane.getChildren().add(ulozTlacidlo);
		pane.getChildren().add(nacitajTlacidlo);
		pane.getChildren().add(rytieri);
		pane.getChildren().add(rytieriOzn);
		pane.getChildren().add(statocniRytieri);
		pane.getChildren().add(statocniRytieriOzn);
		pane.getChildren().add(zliObri);
		pane.getChildren().add(zliObriOzn);
		pane.getChildren().add(vypis);
		
		skrol.setContent(pane);
		
 		vytvorBojovnikovTlacidlo.setOnAction(e -> {
			stret.vytvorBojovnikov(Integer.parseInt(rytieri.getText()),
					Integer.parseInt(statocniRytieri.getText()),
					Integer.parseInt(zliObri.getText()));

			vypis.appendText("Bojovnici vytvoreni.\n");
			}
		);

 		dalsiStretTlacidlo.setOnAction(e -> vypis.appendText(stret.stret()));

  		ulozTlacidlo.setOnAction(e -> {
			try {
				stret.uloz();
			} catch (ClassNotFoundException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
 		
 		nacitajTlacidlo.setOnAction(e -> {
			try {
				stret.nacitaj();
			} catch (ClassNotFoundException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
 		
		energiaBojovnikov = new EnergiaBojovnikov(stret);
		stret.pridajSledovatela(energiaBojovnikov);
		pane.getChildren().add(energiaBojovnikov);

		hlavneOkno.setScene(new Scene(skrol, 500, 300));
		hlavneOkno.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
*/