/*
//17 HW
//08/09/- doesn't work :(

import java.util.ArrayList;

//Hero, HeroType, District, HeroApp17, HeroAppMarinaMRun
public class HeroAppHW {
    public static void main(String[] args) {

        //initializing 3 heroes
        Hero hero1 = new Hero("Artjoms", "Petrovs", "Aliexpressman", 12345678, HeroType.Hero, 100);
        Hero hero2 = new Hero("fh", "Black", "FastWing", 123321, HeroType.Hero, 30);
        Hero hero3 = new Hero("Waterman", "Cooper", "BabyShark", 111111, HeroType.Villian, 30);
        //hero hero3 = new Hero();
        //hero3.setHeroID(111111);
        //hero3.setName("Waterman");
        //hero3.setSurname("Cooper");
        //hero3.setNickname("BabyShark");
        //hero3.setHeroType(HeroType.Villian);
        //hero3.setDeedTime(30);
        System.out.println();
        System.out.println("Some details on some heroes: ");
        System.out.println(" The name of h1 is : " + hero1.getName());
        System.out.println(" The nickname of h2 is: " + hero2.getNickname());
        System.out.println(" The number of hours of h3 id: " + hero3.getDeedTime());
        System.out.println(" Hero h1: " + hero1.toString ());
        System.out.println(" The level of h2 is: " + hero2.calculatedLevel());

        //MAKING array metropole of 3 heroes
        Hero[] metropole = new Hero[3];
        metropole[0] = hero1;
        metropole[1] = hero2;
        metropole[2] = hero3;

        //how many heroes with level 1:
        System.out.println();
        int counter = 0;
        for (Hero hero : metropole) {
            if (hero.calculatedLevel() == 1) {
                counter++;
            }
        }
        System.out.println("The number of level 1 heroes is: " + counter);

        //more than 1 level heroes
        System.out.println();
        counter = 0;
        for (Hero hero : metropole) {
            if (hero.calculatedLevel() > 1) {
                counter++;
            }
        }
        System.out.println("The number of level more than 1 heroes is: " + counter);

        //if there is name John
        System.out.println();
        boolean isJohn = false;
        for (Hero hero : metropole) {
            if (hero.getName().matches("John")) {
                isJohn = true;
                break;
            }
        }
        if (isJohn) {
            System.out.println("There is a hero with John name");
        } else {
            System.out.println("There is no hero with the name John");
        }
        //district1 add 3 heroes
        System.out.println();
        District district1 = new District();
        district1.getHeroesInTheDistrict().add(hero1);
        district1.getHeroesInTheDistrict().add(hero2);
        district1.getHeroesInTheDistrict().add(hero3);
        System.out.println(district1.toString());
        //remove one hero from array of heroes by index
        System.out.println();
        district1.getHeroesInTheDistrict().remove(0);
        System.out.println(district1.toString());


        System.out.println("the average number of district 1 is: " + district1.calculateAvgLevelInDistrict());

//-----------------------------17 lesson
        //7 heroes
        System.out.println();
        Hero heroOne = new Hero("Joe", "Black", "Tall", 111, HeroType.Villian, 10);
        Hero heroTwo = new Hero("John", "Leibovsky", "Fat", 222, HeroType.Hero, 10);
        Hero heroThree = new Hero("Bob", "Kaplan", "Nice", 333, HeroType.Hero, 100);
        Hero heroFour = new Hero("Dany", "Cooper", "Angry", 444, HeroType.Villian, 30);
        Hero heroFive = new Hero("Ben", "Button", "Smiley", 555, HeroType.Hero, 30);
        Hero heroSix = new Hero("Peter", "Parker", "Clever", 666, HeroType.Hero, 30);
        Hero heroSeven = new Hero("Harry", "Potter", "GoodBoy", 777, HeroType.Villian, 30);
        //making 2 districts
        District districtOne = new District();
        districtOne.setTitle("Southern district");
        districtOne.setCity("Riga");
        districtOne.setDistrictID(121212);

        District districtTwo = new District();
        districtTwo.setTitle("Northern district");
        districtTwo.setCity("Riga");
        districtTwo.setDistrictID(343434);

        //add 3 heroes to the 1 district and the rest to the 2 district
        districtOne.getHeroesInTheDistrict().add(heroOne);
        districtOne.getHeroesInTheDistrict().add(heroTwo);
        districtOne.getHeroesInTheDistrict().add(heroThree);

        districtTwo.getHeroesInTheDistrict().add(heroFour);
        districtTwo.getHeroesInTheDistrict().add(heroFive);
        districtTwo.getHeroesInTheDistrict().add(heroSix);
        districtTwo.getHeroesInTheDistrict().add(heroSeven);

        //printout
        System.out.println();
        System.out.println(districtOne.toString());
        System.out.println(districtTwo.toString());

        //remove one hero from the second district
        districtTwo.removeHero(2);
        //System.out.println(districtTwo.toString());

        //calculate average level for each district
        //the calculation is not correct !!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println();
        districtOne.calculateAvgLevelInDistrict();
        System.out.println("the average level for the district 1 is: " + districtOne.calculateAvgLevelInDistrict());
        districtTwo.calculateAvgLevelInDistrict();
        System.out.println("the average level for the district 2 is: " + districtTwo.calculateAvgLevelInDistrict());

        //initializing an array of districts
        System.out.println();
        ArrayList<District> districtsInTheList = new ArrayList<District>();

        //add districts to array
        districtsInTheList.add(districtOne);
        districtsInTheList.add(districtTwo);
        //count how many districts are in the district array
        //count the number of heroes in total in all districts
        int totalHeroes = 0;
        for (District district : districtsInTheList) {
            totalHeroes += district.NumberOfHeroesInTheDistrict();
        }
        System.out.println("There are: " + totalHeroes + " heroes in total in all districts");

        //calculate the avg level in both districts- not correct!!!!!!!!!!!!!!!
        float avg = 0; //will calculate the sum of averages
        for (District district : districtsInTheList) {
            avg += district.calculateAvgLevelInDistrict() * district.NumberOfHeroesInTheDistrict();//avg*amount
        }
        float totalAvg = avg / totalHeroes;
        System.out.println(totalAvg + " : An average for all the heroes in all the districts");

        //find out which district is the best
        float theBest = 0;
        String theName = "";
        for (District district : districtsInTheList) {
            if (district.calculateAvgLevelInDistrict() > theBest) {
                theBest = district.calculateAvgLevelInDistrict();
                theName = district.getTitle();
            }
        }
        System.out.println(theName + " is the best district to live in");

        //delete the first district
        System.out.println();
        District district2 = new District();
        System.out.println(district2.toString());
    }
}*/
