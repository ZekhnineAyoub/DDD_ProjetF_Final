package use_cases;

import model.Customer.Panier;
import model.Customer.UserRepository;
import model.Customer.Utilisateur;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakeUser implements UserRepository {

   public Utilisateur utilisateur;
    private Map<String, Utilisateur> utilisateurs;


    public  FakeUser() {
        utilisateur = new Utilisateur("1L","Karim",22,"43 rue de boulet");
        utilisateurs = new HashMap<>();
        utilisateurs.put(utilisateur.getIdUser(), utilisateur);
    }

    @Override
    public List<String> getAll() {
        return null;
    }

    @Override
    public Utilisateur findById(String userId) {
        return utilisateurs.get(userId);
    }
}
