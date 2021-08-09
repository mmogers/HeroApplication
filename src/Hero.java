//Hero, HeroType, District, HeroApp17, HeroAppMarinaMRun
public class Hero {
    private String name;
    private String surname;
    private String nickname;
    private int heroID;
    private HeroType heroType;
    private int deedTime;


    public Hero(String inputName, String inputSurname, String inputNickname, int inputHeroID, HeroType inputHeroType, int inputDeedTime) {
        this.name = inputName;
        this.surname = inputSurname;
        this.nickname = inputNickname;
        this.heroID = inputHeroID;
        this.heroType = inputHeroType;
        this.deedTime = inputDeedTime;
    }

    public Hero() {
    }


    public int calculatedLevel(){
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

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", heroID=" + heroID +
                ", heroType='" + heroType + '\'' +
                ", deedTime=" + deedTime +
                '}' + '\n';
    }

    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHeroID() {
        return heroID;
    }

    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }

    public HeroType getHeroType() {
        return heroType;
    }

    public void setHeroType(HeroType heroType) {
        this.heroType = heroType;
    }

    public int getDeedTime() {
        return deedTime;
    }

    public void setDeedTime(int deedTime) {
        this.deedTime = deedTime;
    }
}
