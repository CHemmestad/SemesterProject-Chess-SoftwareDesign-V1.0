import java.util.LinkedList;

public class Piece {
    int xPosition;
    int yPosition;
    int xPositionNorm;
    int yPositionNorm;
    boolean isWhite;
    LinkedList<Piece> piece;
    String name;

    public Piece(int xPosition, int yPosition, boolean isWhite, String n, LinkedList<Piece> ps){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        xPositionNorm = xPosition*100;
        yPositionNorm = yPosition*100;
        this.isWhite = isWhite;
        this.piece = ps;
        name = n;
        ps.add(this);
    }

    public void move(int xPosition, int yPosition){
        for(Piece p: piece){
            if((p.xPosition == xPosition)&&(p.yPosition == yPosition)){
                p.kill();
            }
        }
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        xPositionNorm = xPosition*100;
        yPositionNorm = yPosition*100;
    }

    public void kill(){
        piece.remove(this);
    }
}
