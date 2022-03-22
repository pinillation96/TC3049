public class DealBuilder {

    public Deal createPs5IphoneDeal(){
        Deal deal= new Deal();
        deal.addItem(new Iphone());
        deal.addItem(new PlayStation());
        return deal;
    }
    public Deal createNintendoSamsungDeal(){
        Deal deal= new Deal();
        deal.addItem(new GalxyS20());
        deal.addItem(new NintendoSwitch());
        return deal;
    }
}
