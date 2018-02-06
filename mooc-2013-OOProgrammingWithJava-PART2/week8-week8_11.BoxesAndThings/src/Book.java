/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chipper
 */
public class Book implements ToBeStored {

    private final String writer;
    private final String title;
    private final double weight;

    public Book(String writer, String title, double weight) {
        this.writer = writer;
        this.title = title;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return writer + ": " + title;
    }

    @Override
    public double weight() {
        return weight;
    }

}
