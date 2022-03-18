package use_cases;

import model.Customer.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CustomerStory implements PanierRepository{

   private BilletRepository billetRepository;
   private PanierRepository panierRepository;
   private UserRepository userRepository;

   private int A;




   @BeforeEach
   public void init(){
        A= 5;
        //userRepository = new FakeUser();
        //panierRepository = new FakePanier();

   }

    @Test
    public void CheckSizeA() {
        assertEquals(5,A);

    }

    @Override
    public Panier findPanierByUserId(String userId) {
        return null;
    }

    @Override
    public void savePanier(Panier panier) {

    }
}
