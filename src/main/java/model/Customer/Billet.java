package model.Customer;

public class Billet {

    private String idBillet;
    private String statuts;
    private String genCode;
    private String name;
    private Long price;

    public Billet(String idBillet, String statuts, String genCode, String name, Long price) {
        this.idBillet = idBillet;
        this.statuts = statuts;
        this.genCode = genCode;
        this.name = name;
        this.price = price;
    }

    public Billet() {
    }

    public boolean checkStatus() {
        return false;
    }

    public void updateStatus() {

    }

    public String getStatuts() {
        return statuts;
    }

    public void setStatuts(String statuts) {
        this.statuts = statuts;
    }

    public String getGenCode() {
        return genCode;
    }

    public void setGenCode(String genCode) {
        this.genCode = genCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getIdBillet() {
        return idBillet;
    }

    public void setIdBillet(String idBillet) {
        this.idBillet = idBillet;
    }

    @Override
    public String toString() {
        return "Billet{" +
                "idBillet='" + idBillet + '\'' +
                ", statuts=" + statuts +
                ", genCode='" + genCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
