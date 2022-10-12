import java.util.Random;

abstract class Player {
    protected String shape;
    protected static int playerMove;
    protected String name,playerId;
    Random rand = new Random();
    Board board = new Board(0);
    public static void getShape(){

    }

    public static void getName(){
        
    }

    public static void getNextMove(){
    }
}
class HumanPlayer extends Player{
    
}

class ComputerPlayer extends Player{
    public int generateRandomMove(int size){
        while(board.dimension[0][playerMove] != 0 ){
            playerMove = rand.nextInt(size);
        }

        return playerMove;
    }
}
