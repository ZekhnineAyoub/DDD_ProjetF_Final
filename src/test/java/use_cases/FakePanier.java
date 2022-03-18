package use_cases;

import model.Customer.Billet;
import model.Customer.Panier;
import model.Customer.PanierRepository;

import java.util.ArrayList;
import java.util.List;

public class FakePanier implements PanierRepository{

     public  Panier panier;
     public List<Billet> billets;
     public List<Panier> paniers;

     public  FakePanier(){
         Billet OPEN = new Billet();
         OPEN.setGenCode("LOL");
         OPEN.setName("superconcert");
         OPEN.setPrice(342L);
         OPEN.setIdBillet("b6366f6e-3879-47bc-8d06-b1745314a15b");
         OPEN.setStatuts("open");

         Billet CLOSED = new Billet();
         CLOSED.setGenCode("LMAO");
         CLOSED.setName("vieuxspectacle");
         CLOSED.setPrice(342L);
         CLOSED.setIdBillet("93610c93-c90e-4141-8ac3-b03b16eab5ea");
         CLOSED.setStatuts("verrouillé");
         billets.add(OPEN);
         billets.add(CLOSED);

         panier = new Panier("1L",billets);
         paniers.add(panier);

     }


    @Override
    public Panier findPanierByUserId(String userId) {
        return null;
    }

    @Override
    public void savePanier(Panier panier) {

    }
}
