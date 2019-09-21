package lab05;

import java.util.Scanner;

public class Pubg {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int no = obj.nextInt();
        obj.nextLine().trim();
        Player[] playerArray = new Player[no];
        if (no > 0 && no <= 100) {
            for (int i = 0; i < no; i++) {
                String name = obj.nextLine().trim();
                String uname = obj.nextLine().trim();
                String level = obj.nextLine().trim();
                int score = obj.nextInt();
                obj.nextLine().trim();
                playerArray[i] = new Player(name, uname, level, score);
            }
            System.out.println("PlayerName\tUserName\tLevel\tScore");
            for (Player player : playerArray) {
                System.out.println(player);
            }
        }
    }
}

class Player {
    private String name;
    private String uname;
    private String level;
    private int score;

    public Player(String name, String uname, String level, int score) {
        this.name = name;
        this.uname = uname;
        this.level = level;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore() {
        this.score = score;
    }

    @Override
    public String toString() {
        return getName() + "\t" + getUname() + "\t" + getLevel() + "\t" + getScore();
    }
}


