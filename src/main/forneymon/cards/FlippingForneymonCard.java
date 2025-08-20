package main.forneymon.cards;

import main.forneymon.species.*;

/**
 * Card-based implementation of a Forneymon that is able to be
 * flipped, with certain features visible / obscurred.
 */
public class FlippingForneymonCard extends ForneymonCard {

    /**
     * Creates a new FlippingForneymonCard with a reference to the given
     * Forneymon and whether or not it begins face-down
     * 
     * @param forneymon The Forneymon referenced by the card
     * @param f Whether or not the card begins face-down (false = face-down)
     */
    public FlippingForneymonCard (Forneymon forneymon, boolean f) {
        // TODO!
        throw new UnsupportedOperationException();
    }
    
    /**
     * Default constructs a new FlippingForneymonCard that represents a
     * face-down Burnymon with name "MissingNu"
     */
    public FlippingForneymonCard () {
        // TODO!
        throw new UnsupportedOperationException();
    }
    
    /**
     * Turns the card face-up if face-down and vice versa.
     * 
     * @return The current state of whether or not the card is face-down
     * after the flip
     */
    public boolean flip () {
        // TODO!
        throw new UnsupportedOperationException();
    }
    
    /**
     * Used to determine (by matching cardgame mechanics) whether or not
     * the given other FlippingForneymonCard is a match with the current one.
     * 
     * @param other The compared FlippingForneymonCard to this one
     * @return int code corresponding to:
     * <ol>
     *   <li>2 if either this or the other FlippingForneymonCard are face-down.</li>
     *   <li>1 if both are face-up and considered equal</li>
     *   <li>0 if both are face-up and considered unequal</li>
     * </ol>
     */
    public int match (FlippingForneymonCard other) {
        // TODO!
        throw new UnsupportedOperationException();
    }
    
    // TODO! Any requested method overrides here!
    
}
