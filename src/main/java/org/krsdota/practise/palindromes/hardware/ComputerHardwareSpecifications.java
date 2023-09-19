package org.krsdota.practise.palindromes.hardware;

public class ComputerHardwareSpecifications {

    private int cpuCores;

    private int cpuFrequency;

    private int hardDiskSpace;

    private int ramGB;

    private int ramFrequency;

    public ComputerHardwareSpecifications(
        int cpuCores,
        int cpuFrequencyGhz,
        int hardDiskSpace,
        int ramGB,
        int ramFrequencyMhz
    ) {
        this.cpuCores = cpuCores;
        this.hardDiskSpace = hardDiskSpace;
        this.ramGB = ramGB;
        this.cpuFrequency = cpuFrequencyGhz;
        this.ramFrequency = ramFrequencyMhz;
    }

    public PowerRating getPowerRating() {
        if(this.cpuCores > 8) {
            return PowerRating.AMAZING;
        }

        if(this.cpuCores > 2 && this.cpuCores < 8 ) {
            return PowerRating.OK;
        }

        return PowerRating.TRASH;
    }
}
