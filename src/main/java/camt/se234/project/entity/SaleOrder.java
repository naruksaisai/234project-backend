package camt.se234.project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    public SaleOrder(String saleOrderId, List<SaleTransaction> transactions) {
        this.saleOrderId = saleOrderId;
        this.transactions = transactions;
    }
    public SaleOrder(String saleOrderId){
        this.saleOrderId = saleOrderId;
    }

    public SaleOrder (List<SaleTransaction> transactions){
        this.transactions = transactions;
    }

    public String getSaleOrderId() {
        return saleOrderId;
    }

    public void setSaleOrderId(String saleOrderId) {
        this.saleOrderId = saleOrderId;
    }

    public List<SaleTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<SaleTransaction> transactions) {
        this.transactions = transactions;
    }

    String saleOrderId;
    @Builder.Default
    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<SaleTransaction> transactions = new ArrayList<>();
    public double getTotalPrice(){
        double totalPrice = 0;
        for (SaleTransaction transaction :
                transactions) {
            totalPrice += transaction.getAmount() * transaction.getProduct().getPrice();
        }
        return totalPrice;
    }
}
