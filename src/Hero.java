//Hero, HeroType, District, HeroApp17, HeroAppMarinaMRun
public class Hero extends Person {
    //private String name;
    //private String surname;
    private String nickname;
    private int heroID;
    //private HeroType heroType;
    private int deedTime;

    public Hero() {
    }

    public Hero(String name, String surname) {
        super(name, surname);
    }

    public Hero(String nickname, int heroID, int deedTime) {
        this.nickname = nickname;
        this.heroID = heroID;
        this.deedTime = deedTime;
    }

    public Hero(String name, String surname, String nickname, int heroID, int deedTime) {
        super(name, surname);
        this.nickname = nickname;
        this.heroID = heroID;
        this.deedTime = deedTime;
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
                "nickname='" + nickname + '\'' +
                ", heroID=" + heroID +
                ", deedTime=" + deedTime +
                '}';
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


    public int getDeedTime() {
        return deedTime;
    }

    public void setDeedTime(int deedTime) {
        this.deedTime = deedTime;
    }
}
