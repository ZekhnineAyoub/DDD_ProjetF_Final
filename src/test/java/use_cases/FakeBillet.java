package use_cases;

import model.Customer.Billet;
import model.Customer.BilletRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakeBillet implements BilletRepository {

    private Map<String,Billet> billets;
    public FakeBillet(){

        billets = new HashMap<>();

         Billet OPEN = new Billet();
         OPEN.setGenCode("LOL");
         OPEN.setName("superconcert");
         OPEN.setPrice(342L);
         OPEN.setIdBillet("b6366f6e-3879-47bc-8d06-b1745314a15b");
         OPEN.setStatuts("open");
         billets.put(OPEN.getIdBillet(),OPEN);

    }

    @Override
    public List<String> getAll() {
        return null;
    }

    @Override
    public Billet findById(String idBillet) {
        return billets.get(idBillet);
    }

    @Override
    public void save(Billet billet) {
        billets.put(billet.getIdBillet(), billet);
    }
}
