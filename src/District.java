

//Hero, HeroType, District, HeroApp17, HeroAppMarinaMRun
/*ask 1.
        Copy the Hero class in the new project. Delete the variable workingDistrict and related code parts.
        Create a new class District as shown in the diagram:
class: District
        attributes
        - title: String
        - city: String
        - districtID: int
        - heroesInTheDistrict: hero[]
 */

        import java.util.ArrayList;

public class District {
    private String title;
    private String city;
    private int districtID;
    private ArrayList<Hero> heroesInTheDistrict = new ArrayList<Hero>();// dynamic array , check it!!!!!!!!!!!

    public District() {
    }


    public District(String title, String city, int districtID, ArrayList<Hero> heroesInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        this.heroesInTheDistrict = heroesInTheDistrict;
    }

    public boolean addNewHero(Hero hero) {
        heroesInTheDistrict.add(hero);//add - an option in the array
        return heroesInTheDistrict.add(hero); //returns true if add succeeded
    }

    public Hero removeHero(int index) {
        return heroesInTheDistrict.remove(index);//returns hero
    }

    public float calculateAvgLevelInDistrict() {
        float sum = 0;
        int counter = 0;
        for (Hero hero : heroesInTheDistrict) {
            sum += hero.getDeedTime();
            counter++;
        }
        float deedTime = sum /counter;
        if (deedTime < 20) {
            return 1;
        } else if (deedTime >= 20 && deedTime < 40) {
            return 2;
        } else if (deedTime >= 40) {
            return 3;
        } else {
            return 0;
        }
    }

    //how many heroes are in the district
    public int NumberOfHeroesInTheDistrict() {
        int counter = 0;
        for (Hero hero : heroesInTheDistrict) {
            counter++;
        }
        return counter;
    }


    //TO STRING
    @Override
    public String toString() {
        return "District{" +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", districtID=" + districtID + '\n' +
                ", heroesInTheDistrict=" + heroesInTheDistrict +
                '}';
    }

    //GETTERS AND SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public ArrayList<Hero> getHeroesInTheDistrict() {
        return heroesInTheDistrict;
    }

    public void setHeroesInTheDistrict(ArrayList<Hero> heroesInTheDistrict) {
        this.heroesInTheDistrict = heroesInTheDistrict;
    }
}
