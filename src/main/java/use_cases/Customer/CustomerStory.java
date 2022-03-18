package use_cases.Customer;

import model.Customer.*;

public class CustomerStory implements CustomerStoyManagement {

    private  BilletRepository billets; //stock
    private UserRepository users; //stock
    private PanierRepository paniers; //stock

    public CustomerStory(BilletRepository billets, UserRepository users, PanierRepository paniers) {
        this.billets = billets;
        this.users = users;
        this.paniers = paniers;
    }


    @Override
    public Panier create(String billetId, String userId) {
            // récuperer tous les billets
            ///  List<String> billetsIds = billets.getAll();
            // on cherche notre billet dans la liste des billets
            Billet billet = billets.findById(billetId);
            Utilisateur user = users.findById(userId);
            Panier panier = paniers.findPanierByUserId(userId);

            // on check le statut du billet : si verouillé on leve une exception sinon on le verouille
            if(billet.getStatuts()== "Deverouiller") {
                billet.updateStatus();

                // on rajoute le billet dans le panier
                panier.addBilletAction(billet);

                paniers.savePanier(panier);
                // on valide le panier()
            /*if (billet.date_add_in_panier > "today" ) {
                panier.validateAction();
                panier.payPanier();
                panier.generateBill();
                panier.emptyPanier();
            }*/
            }
            return panier;
    }
}
