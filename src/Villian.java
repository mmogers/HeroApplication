import java.util.ArrayList;

public class Villian extends Person{
    private String nickname;
    private int villianID;
    //private HeroType heroType;
    private int crimeTime;


    public Villian(String nickname, int villianID, int crimeTime) {
        this.nickname = nickname;
        this.villianID = villianID;
        this.crimeTime = crimeTime;
    }

    public Villian(String name, String surname, String nickname, int villianID, int crimeTime) {
        super(name, surname);
        this.nickname = nickname;
        this.villianID = villianID;
        this.crimeTime = crimeTime;
    }

    public Villian() {
    }

    public Villian(String name, String surname) {
        super(name, surname);
    }


    @Override
    public String toString() {
        return "Villian{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", nickname='" + nickname + '\'' +
                ", villianID=" + villianID +
                ", crimeTime=" + crimeTime +
                '}';
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getVillianID() {
        return villianID;
    }

    public void setVillianID(int villianID) {
        this.villianID = villianID;
    }

    public int getCrimeTime() {
        return crimeTime;
    }

    public void setCrimeTime(int crimeTime) {
        this.crimeTime = crimeTime;
    }


}
