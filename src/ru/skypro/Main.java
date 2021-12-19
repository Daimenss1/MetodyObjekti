package ru.skypro;

public class Main {
    public static void main (String [] args) {
        System.out.println(" Authors ");
        Author Tolstoy = new Author(" Lev ", " Tolstoy ");
        Author Tolstoy2 = new Author(" Lev ", " Tolstoy ");
        Author Block = new Author(" Alexandr ", " Block ");
        System.out.println(" Author copies equal: = " + Tolstoy.equals(Tolstoy2));
        System.out.println(" Author copies equal by hashCode: " + (Tolstoy.hashCode()==Tolstoy2.hashCode()));
        System.out.println(" Authors equal: " + Tolstoy.equals(Block));
        System.out.println(" Authors equal by hashCode: " + (Tolstoy.hashCode()==Block.hashCode()));

        System.out.println(Tolstoy);
        System.out.println(Block);

        System.out.println(" ======================================= ");

        System.out.println(" Books:");
        Book warAndPiece = new Book(Tolstoy , " Война и мир ", 1869);
        Book grayMorning = new Book(Block, " Седое утро ", 1920);
        Book grayMorning2 = new Book(Block, " Седое утро ", 1920);
        System.out.println(" Book copies equal: " + grayMorning.equals(grayMorning2));
        System.out.println(" Book copies equal by hashCode: " + (grayMorning.hashCode()== grayMorning2.hashCode()));
        System.out.println(" Books equal: " + grayMorning.equals(warAndPiece));
        System.out.println(" Books equal by hashCode: " + (grayMorning.hashCode()==warAndPiece.hashCode()));
        System.out.println(" Gray Morning ");
        System.out.println(" War And Piece ");

        System.out.println(" ========================================= ");
    }
}
