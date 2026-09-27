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
     PacMan pacman = new PacMan();
     frame.add(pacman);
     frame.pack(); // Gör att JFrame anpassa sig efter panelens storlek.
     // Swing ritar bilder på pixel positioner så : tile posit(x,y) »» pixelX = x*32, pixelY = y*32
     
     
    }
}
