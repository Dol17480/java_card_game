package card_game;

import card_game.*;
import java.util.*;

public class WinChecker {

  public static void main(String[] args) {

   int player1Score = 0;
   String setHand = "";
   player1Score += dealCard();
   player1Score += dealCard();
   System.out.println("Your score is %d would you like another card ? Yes or no? ", player1Score);

   int player2Score = 0;
   String setHand = "";
   player2Score += dealCard();
   player2Score += dealCard();
   System.out.println("Your score is %d would you like another card ? Yes or no? ", player2Score);

   newCard = input.nextLine();
   if(newCard.equalsIgnoreCase("Y") {
     while (newCard.equalsIgnoreCase("Y")){
      player1Score += dealCard();
      System.out.println("Your score is %d would you like another card ? Yes or no? ", player1Score);
      newCard = input.nextLine();
    }
  }

   newCard = input.nextLine();
   if(newCard.equalsIgnoreCase("Y") {
     while (newCard.equalsIgnoreCase("Y")){
      player2Score += dealCard();
      System.out.printf("Your score is %d would you like another card ? y/n ", player2Score);
      newCard = input.nextLine();
    }
  }

   while(playerScore < 15)
  {
    playerScore += dealCard();
  }
  checkWin(player1Score, player2Score);
// }

// }