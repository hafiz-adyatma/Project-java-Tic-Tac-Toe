import java.text.SimpleDateFormat;
import java.util.*;  

public class Game {
     
     public void play(){
        int Choose;
        int size;
        int enemy;
        int upperbound = 4;
        Scanner input = new Scanner(System.in);
        Random rand =  new Random();
        HumanPlayer player1 = new HumanPlayer();
        HumanPlayer player2= new HumanPlayer();
        ComputerPlayer computer = new ComputerPlayer();
        Board board = new Board(0);
        do
        {
            System.out.println("===== Tic Tac Toe =====");
            System.out.println("1.Join Game\n2.View History\n3.Exit");
            System.out.println("Choose : ");
            Choose = input.nextInt();
            if(Choose == 1)
            {
                System.out.println("Enter Your name : ");
                player1.name = input.next();
                System.out.println("Determine the size of the board : ");
                size = input.nextInt();
                board = new Board(size);
                board.printBoard();
                System.out.println("Choose Your enemy : \n1.Computer\n2.Human");
                enemy = input.nextInt();
                if(enemy == 1)
                {
                    
                    computer.name = "Computer";
                    computer.shape = "O";
                    computer.playerId = "[CMPTR]"+rand.nextInt(upperbound)+1;
                    player1.shape = "X";
                    player1.playerId = "[HMN1]"+rand.nextInt(upperbound)+1;
                    while(board.score == 0)
                    {
                        //saran-----
                        // cetak board seperti ini
                        //     0   1   2
                        //  0 [1] [2] [3]
                        //  1 [4] [5] [6]
                        //  2 [7] [8] [9]
                        // input = 5
                        // int kanan = 5/size board adalah jumlah gerakan ke bawah
                        // int bawah = 5%size board adalah jumlah gerakan ke kanan
                        // board.dimension[kanan][bawah] = 1;
                        do{
                            System.out.println("Player 1 ["+player1.name+"] Turn : " ); 
                            player1.playerMove = input.nextInt(); 
                            player1.playerMove -=1;
                        }while(player1.playerMove>size-1 && player1.playerMove<0);
                        int kanan = player1.playerMove/size;
                        int bawah = player1.playerMove%size;
                        board.dimension[kanan][bawah] = 1;
                        System.out.println(kanan + "" + bawah);
                        board.printBoard();
                        board.CalculateScore();
                        if(board.score == 1)
                        {
                            break;
                        }
                        else{
                            do{
                                System.out.println("Player 2 ["+computer.name+"] Turn : " );
                                computer.playerMove = computer.generateRandomMove(size);
                            }while(computer.playerMove > size - 1 && computer.playerMove < 0);
                            board.dimension[kanan][computer.playerMove] =2;
                            System.out.println("halo halo");
                            board.printBoard();
                            board.CalculateScore();
                        }
                    }
                }
                else if(enemy == 2)
                {
                    System.out.println("Enter Your name : ");
                    player2.name = input.next();
                    player2.shape = "O";
                    player1.shape = "X";
                    player1.playerId = "[HMN1]"+rand.nextInt(upperbound)+1;
                    player2.playerId = "[HMN2]"+rand.nextInt((upperbound)+1)*5;
                    while(board.score == 0)
                    {
                        do{
                            System.out.println("Player 1 ["+player1.name+"] Turn : " ); 
                            player1.playerMove = input.nextInt(); 
                            player1.playerMove -=1;
                        }while(player1.playerMove>size-1 && player1.playerMove<0);
                        int kanan = player1.playerMove/size;
                        int bawah = player1.playerMove%size;
                        board.dimension[kanan][bawah] = 1;
                        board.printBoard();
                        board.CalculateScore();
                        if(board.score == 1)
                        {
                            break;
                        }
                        do{
                            System.out.println("Player 2 ["+player2.name+"] Turn : " ); 
                            player2.playerMove = input.nextInt(); 
                            player2.playerMove -=1;
                        }while(player2.playerMove>size-1 && player2.playerMove<0);
                        kanan = player2.playerMove/size;
                        bawah = player2.playerMove%size;
                        board.dimension[kanan][bawah] = 2;
                        board.printBoard(); 
                        board.CalculateScore();
                    }
                }
            }
            if(Choose == 2)
            {
                System.out.println();
                System.out.println("====== HISTORY GAME ======");  
                System.out.println("Players Name : ");
                if(player2.name == null)
                {
                    System.out.println(player1.name+player1.playerId + " & " + computer.name+computer.playerId);
                    
                    if(board.win == 1)
                    {
                        System.out.println("Result : The Winner is "+player1.name);
                    }
                    else if(board.win == 2)
                    {
                        System.out.println("Result : The Winner is "+computer.name);
                    }
                    else
                    {
                        System.out.println("No Winner");
                    }
                    System.out.print("Date of Play : ");
                    getDate();
                }
                else
                {
                    System.out.println(player1.name+player1.playerId + " & " + player2.name+player2.playerId);
                    if(board.win == 1)
                    {
                        System.out.println("Result : The Winner is "+player1.name);
                    }
                    else if(board.win == 2)
                    {
                        System.out.println("Result : The Winner is "+player2.name);
                    }
                    else
                    {
                        System.out.println("No Winner");
                    }
                    System.out.print("Date of play : ");
                    getDate();
                }
            }
        }while(Choose != 3);
        input.close();
    }

    //untuk mengambil tanggal
    public static void getDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = new Date();  
        System.out.println(formatter.format(date)); 
    }

    //untuk mengatur bentuk
    public static void setShape(){
        

    }

    //untuk menentukan status
    public static int Status(int score){
        if(score == 1)
        {
            System.out.println("Player 1 Win");
        }
        else if(score == 2)
        {
            System.out.println("Player 2 Win");
        }
        return score;
    }

    //untuk menampilkan langkah
    public static void printMove(){

    }

    //untuk menampilkan Hasil
    public static void printResult(){

    }

}
