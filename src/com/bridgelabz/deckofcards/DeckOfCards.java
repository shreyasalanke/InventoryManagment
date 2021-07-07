package com.bridgelabz.deckofcards;

	public class DeckOfCards {
		String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };

		    String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		    int n = SUITS.length * RANKS.length;
		    String[] deck = new String[n];
		    // initialize deck
		    void deck() 
		    {
			    for (int i = 0; i < RANKS.length; i++) {
			        for (int j = 0; j < SUITS.length; j++) 
			        {
			            deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
			        }
			    }
		    }
		    // shuffle
		    void shuffle()
		    {
			    for (int i = 0; i < n; i++) 
			    {
			        int r = i + (int) (Math.random() * (n-i));
			        String temp = deck[r];
			        deck[r] = deck[i];
			        deck[i] = temp;
			    }
		    }
		    
		    void shuffleDeckForPlayers()
		    {
			    for (int i = 0; i < 4; i++) {
			        System.out.println("\n Person " + (i + 1));
			        for (int j = 0; j < 4; j++) {
			            System.out.println(deck[i + j * 4]);
			        }
			    }
		    }
		    public static void main(String[] args)
			{
				DeckOfCards deckOfCards = new DeckOfCards();
				deckOfCards.deck();
				deckOfCards.shuffle();
				deckOfCards.shuffleDeckForPlayers();
			}
		}
