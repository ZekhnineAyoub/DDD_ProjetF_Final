package use_cases;

import model.Customer.Billet;
import model.Customer.BilletRepository;

import java.util.List;

public class FakeBillet implements BilletRepository {

    private List<Billet> billets;
    public FakeBillet(){

        Billet OPEN = new Billet();
         OPEN.setGenCode("LOL");
         OPEN.setName("superconcert");
         OPEN.setPrice(342L);
         OPEN.setIdBillet("b6366f6e-3879-47bc-8d06-b1745314a15b");
         OPEN.setStatuts("open");

         billets.add(OPEN);

    }

    @Override
    public List<String> getAll() {
        return null;
    }

    @Override
    public Billet findById(String idBillet) {
        return null;
    }
}
