# Rock-Paper-Scissors Game (JavaScript)
- This is a simple **Rock-Paper-Scissors** game built using **JavaScript**. 
- You play against the computer for 3 rounds, and the winner is decided based on the classic rules of the game.


## How to Run the Game in Your Browser
1. Open **Google Chrome** (or any modern browser).
2. Right-click anywhere on the webpage and select **Inspect** *(or press `Ctrl + Shift + I`)*.
3. Click on the **Console** tab.
4. Paste the entire game code (see below) into the console.
5. Press **Enter** to run the game.
6. Follow the prompt that appears to enter your move (`rock`, `paper`, or `scissors`) in each round.


## How to Play
1. The game will ask you to enter `"rock"`, `"paper"`, or `"scissors"` via a prompt box.
2. The computer randomly selects its choice.
3. The winner of each round is announced in the console:
   - Rock beats Scissors
   - Scissors beats Paper
   - Paper beats Rock
4. After 3 rounds, the final winner is declared based on the scores.



## Game Logic Overview
- `getHumanChoice()`: Prompts the user for input.
- `getComputerChoice()`: Randomly returns `"rock"`, `"paper"`, or `"scissors"`.
- `playRound()`: Compares choices and updates the score.
- `playGame()`: Loops through 3 rounds and announces the final result.
