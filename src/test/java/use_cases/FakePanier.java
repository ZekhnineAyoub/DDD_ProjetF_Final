package use_cases;

import model.Customer.Billet;
import model.Customer.Panier;
import model.Customer.PanierRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakePanier implements PanierRepository{

     public  Panier panier;
     private List<Billet> billets;
     private Map<String,Panier> paniers;

     public  FakePanier(){
         /*Billet OPEN = new Billet();
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
  */     billets  = new ArrayList<>();
         paniers = new HashMap<>();
         panier = new Panier("1L",billets);
         paniers.put(panier.getUserId(), panier);

     }


    @Override
    public Panier findPanierByUserId(String userId) {
        return null;
    }

    @Override
    public void savePanier(Panier panier) {
         paniers.put(panier.getUserId(),panier);

    }
}
