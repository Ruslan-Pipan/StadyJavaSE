package tasks.XMLParser.DOM;

public class AddresaOrder {
    private String type = null;
    private String name = null;
    private String streat = null;
    private String sity = null;
    private String statel = null;
    private int zipe = 0;
    private String country = null;

    public AddresaOrder(String type, String name, String streat, String sity, String statel, int zipe, String country) {
        this.type = type;
        this.name = name;
        this.streat = streat;
        this.sity = sity;
        this.statel = statel;
        this.zipe = zipe;
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreat() {
        return streat;
    }

    public void setStreat(String streat) {
        this.streat = streat;
    }

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }

    public String getStatel() {
        return statel;
    }

    public void setStatel(String statel) {
        this.statel = statel;
    }

    public int getZipe() {
        return zipe;
    }

    public void setZipe(int zipe) {
        this.zipe = zipe;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "AddresaOrder{" + "\n"+
                "\t\t\t type='" + type + "\n" +
                "\t\t\t name='" + name + "\n" +
                "\t\t\t streat='" + streat + "\n" +
                "\t\t\t sity='" + sity + "\n" +
                "\t\t\t statel='" + statel + "\n"+
                "\t\t\t zipe=" + zipe +"\n" +
                "\t\t\t country='" + country + "\n" +
                '}';
    }
}
