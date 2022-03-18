package model.Customer;

public class Utilisateur {

    private String idUser;
    private String name;
    private int age;
    private String adresse;

    public Utilisateur(String idUser, String name, int age, String adresse) {
        this.idUser = idUser;
        this.name = name;
        this.age = age;
        this.adresse = adresse;
    }

    public String getIdUser() {
        return idUser;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }




    @Override
    public String toString() {
        return "Utilisateur{" +
                "idUser='" + idUser + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
