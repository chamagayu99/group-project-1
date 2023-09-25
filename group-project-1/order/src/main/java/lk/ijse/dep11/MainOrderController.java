package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MainOrderController {

    @FXML
    private Button btnPlace;

    @FXML
    private AnchorPane qtyBurger;

    @FXML
    private Spinner<?> qtyBurgur;

    @FXML
    private Spinner<?> qtyFishBun;

    @FXML
    private Spinner<?> qtyPizza;

    @FXML
    private Spinner<?> qtySandwitch;

    @FXML
    private TableView<?> tvOrders;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtName;

    @FXML
    void btnPlaceOnAction(ActionEvent event) {

    }

}
