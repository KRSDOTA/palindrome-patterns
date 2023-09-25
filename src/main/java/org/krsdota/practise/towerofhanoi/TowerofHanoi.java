package org.krsdota.practise.towerofhanoi;




/**
 * The process of calculation for three towers follows something like this:
 *
 * Imagine we have two disks on tower 'A'. We need to get all disks to tower B while
 * sticking to the following rules:
 *
 * 1) We may only move one disk at a time
 * 2) No disk may ever rest on top of a smaller disk.
 *
 *
 * @return
 */
public class TowerofHanoi {

    private final static int NUMBER_OF_TOWERS = 3;

    final int numberOfDisks;
    final int numberOfTowers;

    public TowerofHanoi(int numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
        numberOfTowers = NUMBER_OF_TOWERS;
    }

    /**
     * Our base case here will be when n = 1 (number of disks on
     * tower A). This is just the number in which we know no smaller disk can lay beneath it,
     * where we can move whatever is on A over to B, with no intermediate step
     *
     * This is dead easy, in the case where we have three towers, the minimum number
     * of moves for a given number of disks (n) is given by the fibonacci sequence
     */
    public Long calculateMinimumNumberOfMoves() {
        return Math.round(Math.pow(2, numberOfDisks) - 1);
    }
}
