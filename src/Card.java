import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class Card {

    private String faceName, suit;
    public static final List<String> validFaceNames = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9","10","jack","queen","king");
    public static final List<String> validSuitNames = Arrays.asList("diamond", "spade", "ace", "club");

    public Card(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        try{
            if(validFaceNames.contains(faceName.toLowerCase()))
                this.faceName = faceName;

            else
                throw new IllegalArgumentException("Bad Argument!, valid faceNames: " + validFaceNames);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        try{
            if(validSuitNames.contains(suit.toLowerCase()))
                this.suit = suit;

            else
                throw new IllegalArgumentException("Bad Argument, valid suits: " + validSuitNames);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
