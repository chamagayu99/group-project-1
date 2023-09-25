package lk.ijse.dep11.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.security.PrivateKey;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {

    private String cutomerId;
    private String name;
    private String status;
    private String contact;
    int burgerQty;
    int fishbunQty;
    int pizzaQty;
    int sandwitchQty;

    public Order(String customerId, String status,int burgerQty, int sandwitchQty, int pizzaQty, int fishbunQty) {
        this.burgerQty = burgerQty;
        this.fishbunQty = fishbunQty;
        this.pizzaQty = pizzaQty;
        this.sandwitchQty = sandwitchQty;
        this.cutomerId=customerId;
        this.status=status;

    }

    public Order(String cutomerId, String name, String contact, String status) {
        this.cutomerId = cutomerId;
        this.name = name;
        this.status = status;
        this.contact = contact;
    }
}
