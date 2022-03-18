package model.Customer;

public interface PanierRepository {

    Panier findPanierByUserId(String userId);
    void savePanier(Panier panier);
}
