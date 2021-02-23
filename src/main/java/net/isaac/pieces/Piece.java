package net.isaac.pieces;

public class Piece {
    private final Color color;
    private final Type type;

    private Piece(Color color, Type type) {
        this.color = color;
        this.type = type;
    }

    //Board 출력을 위한 문자 반환
    public char getRepresentation() {
        if (color == Color.BLACK) {
            return Character.toUpperCase(type.representation);
        }
        return type.representation;
    }

    public Color getColor() {
        return color;
    }

    public boolean isWhite() {
        return this.color == Color.WHITE;
    }

    public boolean isBlack() {
        return this.color == Color.BLACK;
    }

    public static Piece createPiece(Color color, Type type) {
        return new Piece(color, type);
    }

    public enum Color {
        BLACK,
        WHITE
    }

    public enum Type {
        PAWN('p'), KING('k'), QUEEN('q'), ROOK('r'), BISHOP('b'), KNIGHT('n');
        public final char representation;

        Type(char representation) {
            this.representation = representation;
        }
    }
}
