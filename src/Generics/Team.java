package Generics;

import java.util.ArrayList;

public class Team<T extends Player> {

    private String name;
    int played = 0;
    int won = 0;
    int lost =  0;
    int tried = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T newPlayer){
        if(members.contains(newPlayer)){
            System.out.println( (newPlayer).getName()+" Already exist.");
            return false;
        }else{
            members.add(newPlayer);
            System.out.println( (newPlayer).getName()+" piked for them "+ this.name);
            return  true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }
    public void matchResult(Team opponent, int outScore, int theirScore){
        if (outScore >theirScore){
            won++;
        }else if (outScore == theirScore){
            tried++;
        }else {
            lost++;
        }
        if (opponent != null){
            opponent.matchResult(null,theirScore,outScore);
        }
    }

    public  int raking(){
        return  (won*2)+tried;
    }



}
