# TicTacToe Game
### This code was created for educational purposes (OOP Application)
The Tic Tac Toe game is a simple two-player game that is played on a 3x3 grid. Players take turns placing their marks (either 'x' or 'o') on the grid, with the goal of getting three marks in a row horizontally, vertically, or diagonally.

This implementation of the Tic Tac Toe game consists of three classes: main, Spieler, and TicTacToe.

## main class
The main class is the entry point for the Tic Tac Toe game. It creates two instances of the Spieler class, initializes them with names and symbols, and then creates a TicTacToe object with those players.

## Spieler class
The Spieler class represents a player in the Tic Tac Toe game. Each player has a name and a mark ('x' or 'o'), as well as three game pieces of different sizes that they can use to play the game.

## TicTacToe class
The TicTacToe class represents the game board in the Tic Tac Toe game. It contains a 2D array to store the game board, two instances of the Spieler class to represent the players, and a current player.

The TicTacToe class has several methods:

### initialize()
This method initializes the game board by setting all spaces to empty.

### printBoard()
This method prints the game board to the console.

### placePiece()
This method allows a player to place one of their game pieces on the game board. It takes four parameters: the player who is placing the game piece, the x and y coordinates of the game piece on the board, and the number of the game piece the player wants to place. It returns true if the game piece is successfully placed, false otherwise.

### hasWon()
This method checks if the current player has won the game. It takes two parameters: the game board and the current player. It returns true if the current player has won, false otherwise.

### start()
This method starts the Tic Tac Toe game. It sets the current player to player 1, and then loops until the game is over (i.e., a player has won or the game is a tie). In each iteration of the loop, it prints the game board, allows the current player to place a game piece, checks if the current player has won, and then switches to the other player. If the game is over, it prints the winner (or that the game is a tie) and exits the loop.
