package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import lk.ijse.dep11.tm.Order;

public class MainOrderController {

    public Button btnNew;
    public TextField txtId;
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
    private TableView<Order> tvOrders;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtName;

    public void initialize(){

        tvOrders.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("orderId"));
        tvOrders.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tvOrders.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("status"));


    }
    @FXML
    void btnPlaceOnAction(ActionEvent event) {
        String name=txtName.getText();
        String contact=txtContact.getText();
        //int burgerQty=qtyBurger.get
    }

    public void btnNewOnAction(ActionEvent actionEvent) {
    }
}