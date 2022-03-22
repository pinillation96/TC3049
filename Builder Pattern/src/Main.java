public class Main {

    public static void main(String[] args) {
        DealBuilder db= new DealBuilder();

        Deal deal1= db.createPs5IphoneDeal();
        Deal deal2= db.createNintendoSamsungDeal();

        deal1.showItems();
        System.out.println("-----------------");
        deal2.showItems();
    }
}
