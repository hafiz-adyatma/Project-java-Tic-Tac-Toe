public class Board {
    static int [][] dimension;
    public static int score = 0;
    static int win;
    private int fillCount;
    //fungsinya adalah untuk ketika player/computer sudah input
    //maka fillCount akan bertambah
    //limitnya adalah size papan
    // yang harus dibuat:
    // 1. setter && getter untuk fillCount agar bisa diakses dari luar

    Board(int size){
    dimension = new int [size][size];
    }
    // public void tes(){
    //     if(dimension[terakhir][terakhir] == 'X' && dimension[terakhir-1][terakhir] == 'X' && dimension[terakhir-2][terakhir] == 'X' && dimension[terakhir-3][terakhir] == 'X'){
            
    //        //poin nambah
    //     }
    //     if(dimension[terakhir-1][terakhir+1] == 'X' && dimension[terakhir-2][terakhir+2] == 'X' && dimension[terakhir-3][terakhir+3] == 'X' && dimension[terakhir-3][terakhir] == 'X'){
            
    //        //poin nambah
    //     }
        

    // }
   public static void CalculateScore(){
    String line = "";
    Game game = new Game();
        for(int i = 0; i < dimension.length; i++){
            for(int j = 0; j < dimension.length; j++){
                if(dimension.length == 3)   //jika board 3x3
                {
                            switch (j){
                                case 0:
                                    line = (dimension[0][0]==1?"X":dimension[0][0]==2?"0":" ") + (dimension[0][1]==1?"X":dimension[0][1]==2?"O":"") + (dimension[0][2]==1?"X":dimension[0][2]==2?"O":"");
                                    break;
                                case 1:
                                    line = (dimension[0][0]==1?"X":dimension[0][0]==2?"0":" ") + (dimension[0][1]==1?"X":dimension[0][1]==2?"O":"") + (dimension[0][2]==1?"X":dimension[0][2]==2?"O":"");
                                    break;
                                case 2:
                                    line = (dimension[0][0]==1?"X":dimension[0][0]==2?"0":" ") + (dimension[0][1]==1?"X":dimension[0][1]==2?"O":"") + (dimension[0][2]==1?"X":dimension[0][2]==2?"O":"");
                                    break;
                                case 3:
                                    line = (dimension[0][0]==1?"X":dimension[0][0]==2?"0":" ") + (dimension[0][1]==1?"X":dimension[0][1]==2?"O":"") + (dimension[0][2]==1?"X":dimension[0][2]==2?"O":"");
                                    break;
                                case 4:
                                    line = (dimension[0][0]==1?"X":dimension[0][0]==2?"0":" ") + (dimension[0][1]==1?"X":dimension[0][1]==2?"O":"") + (dimension[0][2]==1?"X":dimension[0][2]==2?"O":"");
                                    break;
                                case 5:
                                    line = (dimension[0][0]==1?"X":dimension[0][0]==2?"0":" ") + (dimension[0][1]==1?"X":dimension[0][1]==2?"O":"") + (dimension[0][2]==1?"X":dimension[0][2]==2?"O":"");
                                    break;
                                case 6:
                                    line = (dimension[0][0]==1?"X":dimension[0][0]==2?"0":" ") + (dimension[0][1]==1?"X":dimension[0][1]==2?"O":"") + (dimension[0][2]==1?"X":dimension[0][2]==2?"O":"");
                                    break;
                                case 7:
                                    line = (dimension[0][0]==1?"X":dimension[0][0]==2?"0":" ") + (dimension[0][1]==1?"X":dimension[0][1]==2?"O":"") + (dimension[0][2]==1?"X":dimension[0][2]==2?"O":"");
                                    break;
                                case 8:
                                    line = (dimension[0][0]==1?"X":dimension[0][0]==2?"0":" ") + (dimension[0][1]==1?"X":dimension[0][1]==2?"O":"") + (dimension[0][2]==1?"X":dimension[0][2]==2?"O":"");
                                    break;
                            }
                            if(line.equals("XXO")){
                                score = 1;
                            }
                            else if(line.equals("XOO")){
                                score = 2;
                            } 
                    }
                }
            }
            win = game.Status(score);
   }

   public static void printBoard(){
    for(int[] i : dimension){
        for(int j : i){
            System.out.print(j == 1?"[X]":j==2?"[O]":"["+j+"]"+ " ");
        }
        System.out.println();
    }
   }
}

//System.out.print(dimension[i][j] == 1?"[X]":dimension[i][j]==2?"[O]":"["+dimension[i][j]+"]"+ " ");
