package org.krsdota.practise.towerofhanoi;

public class TowerofHanoi {

    final int numberOfDisks;
    final int numberOfTowers;

    public TowerofHanoi(int numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
        numberOfTowers = 3;
    }

    public int calculateMinimumNumberOfMoves() {
        return numberOfDisks;
    }
}
