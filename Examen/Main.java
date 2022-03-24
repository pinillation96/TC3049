public class Main {

    /*Para este ejercicio usaré el patron creacional builder para construir los combos
        Con Abstarct Factory se verán el tamaño de los alimentos
        
*/
    public static void main(String[] args) {
        DealBuilder db= new DealBuilder();

        Deal deal1= db.createPs5IphoneDeal();
        Deal deal2= db.createNintendoSamsungDeal();

        deal1.showItems();
        System.out.println("-----------------");
        deal2.showItems();
    }

}
