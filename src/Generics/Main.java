package Generics;

public class Main {

    public static void main(String args[]){
        System.out.println("Generics");


        FotballPlayer joe = new FotballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer mihai = new SoccerPlayer("Mihai");

        Team<FotballPlayer>  team1 = new Team<>("Team nr 1");
        team1.addPlayer(joe);
        
        System.out.println(team1.numPlayers() + "players fro team nr 1");

        Team<BaseballPlayer>  team2 = new Team<>(" Team nr 2 ");
        team2.addPlayer(pat);


        Team<SoccerPlayer> team3 = new Team<>("Team nr 3");
        team3.addPlayer(mihai);


    }
}
