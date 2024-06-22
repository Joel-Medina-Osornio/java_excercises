package com.jmo.concurrency.memory_model;

/**
 * Preface
 *
 * A couple of bored friends have two dice, so they decided to create a game,
 * here are some conditions of the game:
 *  1.- As many people as they want can play, but each person must have their own dice.
 *  2.- The die can only have values from 1 to 6
 *  3.- Everyone must agree on a target number to exceed.
 *  4.- The number must be greater than the value of the number of players multiplied by 6
 *  6.- Whoever arrives first can write their number, there is no order
 *  5.- Whoever writes down their number must add their number to the previous total.
 *  6.- The one who, by adding his number to the previous total, manages to equal or exceed
 *      the value defined at the beginning, will be the winner.
 *
 *  Example
 *
 *  2 friends with a dice each one decide a 20 as winner number, they roll the dice at
 *  the same time, player 1 gets 4, so he set as total 4, then player 2 gets 6, so player 2
 *  must sum 4 plus 6 and set as a new total the number 10, on the next try they obtain the number
 *  5 at the same time, both players make the sum at the same time but only one can write the new
 *  total, this time player 1 is faster, because of that player 1 must discard his sum and sum again
 *  with the new total value, but anyway is too late, player 2 already had won.
 *
 *  Notes
 *
 *  This example is oriented to utilize specific java memory model strategies to modify slightly
 *  the game, use volatile, synchronized, semaphore and atomics to know how you can alter the behavior
 *  just deciding a wrong choice, let the game begin ...
 *
 */
public class MainMemoryModelMechanisms {

}
