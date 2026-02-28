# ----- Connect Four - 2 Players Game -----


# Description
This is a 2-player Connect Four game implemented in Java. Players take turns dropping their discs (‘X’ or ‘O’) into a 7-column, 6-row board. The game checks for four consecutive matching discs horizontally, vertically, or diagonally to determine a winner. If a player wins, the game announces the winner; otherwise, turns continue until the board is full.


# Objective
The objective of Connect Four is to be the first player to connect four of your own discs in a row, either horizontally, vertically, or diagonally.


# Game Setup
- The game is played on a vertical grid with 6 rows and 7 columns.
- Players take turns dropping their discs into one of the columns.
- The discs will occupy the lowest available space in the chosen column.


# Players
- There are two players in the game:
- Player 1 uses the disc marked as 'X'.
- Player 2 uses the disc marked as 'O'.


# How to Play
- Starting the Game: Player 1 goes first.
- Taking Turns: Players alternate turns, choosing a column (0-6) to drop their disc.
- Dropping a Disc: When a player chooses a column, the disc will fall to the lowest available row in   that column.
- Winning the Game: After each turn, the game checks for a win condition:
- Horizontal Win: Four discs in a row horizontally.
- Vertical Win: Four discs in a row vertically.
- Diagonal Win: Four discs in a row diagonally (both directions).
- Ending the Game: The game ends when one player connects four discs in a row. The winning player is announced.


# Rules
- Players must choose a valid column (0-6). If a column is full, the player must choose another column.
- The game continues until a player wins or all spaces are filled (resulting in a draw).
- If the board is full and no player has connected four discs, the game is a draw.


# Tips for Winning
- Try to create multiple opportunities to connect four discs while blocking your opponent from doing the same.
- Pay attention to your opponent's moves and anticipate their strategy.
- Use diagonal connections to surprise your opponent.


# Example of a Game
- 1 Player 1 (X) chooses column 3
- 2 Player 2 (O) chooses column 2
- 3 Player 1 (X) chooses column 3
- 4 Player 2 (O) chooses column 4
- 5 Player 1 (X) chooses column 3
- 6 Player 2 (O) chooses column 5
- 7 Player 1 (X) chooses column 3

In this example, Player 1 has connected four discs vertically in column 3 and wins the game.


----- Enjoy the Game!
----- Have fun playing Connect Four!
