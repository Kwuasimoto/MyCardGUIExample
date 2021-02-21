import javafx.scene.image.Image;

import java.util.ArrayList;

public class DeckOfCards {
    private Image backOfCardImage;
    private ArrayList<Card> deckOfCards = new ArrayList<>();

    public DeckOfCards() {
        setDeckOfCards(buildDeckOfCards());
    }

    private ArrayList<Card> buildDeckOfCards() {
        try{
            for(String suit: Card.validSuitNames)
                for(String faceName: Card.validFaceNames)
                    deckOfCards.add(new Card(faceName, suit));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return deckOfCards;
    }
//    public Image getBackOfCardImage() {
//        return backOfCardImage;
//    }
//
//    public void setBackOfCardImage(Image backOfCardImage) {
//        this.backOfCardImage = backOfCardImage;
//    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(ArrayList<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }
}
