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
    private Spinner<Integer> qtyBurgur;

    @FXML
    private Spinner<Integer> qtyFishBun;

    @FXML
    private Spinner<Integer> qtyPizza;

    @FXML
    private Spinner<Integer> qtySandwitch;

    @FXML
    private TableView<String> tvOrders;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtName;

    public void initialize(){

    }
    @FXML
    void btnPlaceOnAction(ActionEvent event) {
        String name=txtName.getText();
        String contact=txtContact.getText();
        int burgerQty=qtyBurger.get
    }

}
