 public class App {
    public static void main(String[] args)throws Exception{
     int rows = 21;
     int columns = 19;
     int tileSize = 32; // pixel 
     int boardHeight = rows * tileSize;  // 672 hög
     int boardWidth = columns * tileSize;// 608 bred

     JFrame frame = new JFrame("Pac Man");
     frame.setVisible(true);
     frame.setSize(boardWidth,boardHeight);
     frame.setLocationRelativeTo(null);
     frame.setResizable(false);

     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     
    }
}
