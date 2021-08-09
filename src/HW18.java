import java.util.ArrayList;

public class HW18 {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Joe", "Black", "Tall", 111, 10);
        Hero hero2 = new Hero("John", "Leibovsky", "Fat", 222, 10);
        Hero hero3 = new Hero("Bob", "Kaplan", "Nice", 333,  100);
        Hero hero4 = new Hero("Dany", "Cooper", "Angry", 444,  30);
        Hero hero5 = new Hero("Ben", "Button", "Smiley", 555,  30);
        Hero hero6 = new Hero("Peter", "Parker", "Clever", 666, 30);
        Hero hero7 = new Hero("Harry", "Potter", "GoodBoy", 777, 30);



        Villian villian1 = new Villian("Peter" , "Moger", "Husband", 313, 50);
        Villian villian2 = new Villian("Benjamin", "Moger", "Son", 2019, 100);
        Villian villian3 = new Villian("Eran", "Moger", "Son", 2011, 150);

        District district1 = new District();
        District district2 = new District();

        district1.setTitle("Southern district");
        district1.setCity("Riga");
        district1.setDistrictID(121212);

        district2.setTitle("Northern district");
        district2.setCity("Riga");
        district2.setDistrictID(343434);

        district1.getHeroesInTheDistrict().add(hero1);
        district1.getHeroesInTheDistrict().add(hero2);
        district1.getHeroesInTheDistrict().add(hero3);

        district2.getHeroesInTheDistrict().add(hero4);
        district2.getHeroesInTheDistrict().add(hero5);
        district2.getHeroesInTheDistrict().add(hero6);
        district2.getHeroesInTheDistrict().add(hero7);

        System.out.println(district1);
        System.out.println();
        System.out.println(district2);

        System.out.println(villian1);
        System.out.println(villian2);
        System.out.println(villian3);

         ArrayList<Villian> villianArrayList = new ArrayList<Villian>();
         villianArrayList.add(villian1);
         villianArrayList.add(villian2);
         villianArrayList.add(villian3);

         //total crime
        int totalCrimeTime =0;
        int maxCrimeTime = 0;
         for(Villian villian: villianArrayList){
             totalCrimeTime += villian.getCrimeTime();
             if(villian.getCrimeTime() > maxCrimeTime){
                 maxCrimeTime = villian.getCrimeTime();
             }
         }
         System.out.println("Total crime time of all villians is: " + totalCrimeTime);
         for (Villian villian : villianArrayList){
             if (villian.getCrimeTime() == maxCrimeTime){
                 System.out.println("This villian spent much time for crime : " + villian.getName());
             }
         }


    }
}
