package use_cases;

import model.Customer.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import use_cases.Customer.CustomerStory;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CustomerStoryTest implements PanierRepository{

   private BilletRepository billetRepository;
   private PanierRepository panierRepository;
   private UserRepository userRepository;

   public Panier panier ;


   private final CustomerStory customerStory;

   private int C;

    public CustomerStoryTest(CustomerStory customerStory) {
        this.customerStory = customerStory;
    }


    @BeforeEach
   public void init(){
        C=5;
        userRepository = new FakeUser();
        billetRepository = new FakeBillet();
        panierRepository = new FakePanier();

        panier = customerStory.create("b6366f6e-3879-47bc-8d06-b1745314a15b","1L");
        //billetRepository = new FakeBillet();
   }

    @Test
    public void checkIfPanierISNotEmpty() {
        assertEquals(1,panier.getBillets().size());

    }

    @Override
    public Panier findPanierByUserId(String userId) {
        return null;
    }

    @Override
    public void savePanier(Panier panier) {

    }
}
