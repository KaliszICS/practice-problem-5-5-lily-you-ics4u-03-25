public class Card implements Comparable<Card>{
    private String name;
    private String suit;

    public Card(String name, String suit){
        this.name = name;
        this.suit = suit;
    }

    public String getName(){
        return this.name;
    }

    public String getSuit(){
        return this.suit;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSuit(String suit){
        this.suit = suit;
    }

    @Override
    public String toString(){
        return this.name + " of " + this.suit;
    }

    @Override
    public int compareTo(Card card){
        String[] nameOrder = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suitOrder = {"Hearts", "Clubs", "Diamonds", "Spades"};

        int suitIndex = -1;
        int otherSuitIndex = -1;
        for(int i = 0; i < suitOrder.length; i++){
            if(this.suit.equals(suitOrder[i])){
                suitIndex = i;
            }
            if((card.getSuit()).equals(suitOrder[i])){
                otherSuitIndex = i;
            }
        }
        int nameIndex = -1;
        int otherNameIndex = -1;
        for(int i = 0; i < nameOrder.length; i++){
            if(this.name.equals(nameOrder[i])){
                nameIndex = i;
            }
            if((card.getName()).equals(nameOrder[i])){
                otherNameIndex = i;
            }
        }

        int totalIndex = nameIndex + suitIndex;
        int totalOtherIndex = otherNameIndex + otherSuitIndex;
        return totalIndex - totalOtherIndex;
    }

}
