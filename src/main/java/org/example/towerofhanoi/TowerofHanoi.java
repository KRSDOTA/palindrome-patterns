package org.example.towerofhanoi;

public class TowerofHanoi {

    final int numberOfDisks;
    final int numberOfTowers;

    public TowerofHanoi(int numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
        numberOfTowers = 2;
    }

    public int calculateMinimumNumberOfMoves() {
        return numberOfDisks;
    }
}
