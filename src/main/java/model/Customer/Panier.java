package model.Customer;

import java.util.List;

public class Panier {

    private  String userId;

    public  List<Billet> billets;


    public Panier(String userId, List<Billet> billets) {
        this.userId = userId;
        this.billets = billets;
    }

    public void checkContent() {
    }

    public void addBilletAction(Billet billet) {
        billets.add(billet);

    }

    public void validateAction() {
    }

    public void payPanier() {
    }

    public void generateBill() {
    }

    public void emptyPanier() {
    }

    public String getUserId() {
        return userId;
    }

    public List<Billet> getBillets() {
        return billets;
    }

    public void setBillets(List<Billet> billets) {
        billets = billets;
    }

    @Override
    public String toString() {
        return "Panier{" +
                "userId='" + userId + '\'' +
                ", billets=" + billets +
                '}';
    }
}
