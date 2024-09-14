package sliding.window.maxsub;

public class MaxTemperatureChange {

    public float findMaximumTemperatureChange(float[] dailyTemperatureChanges) {

        // Corner case: If the array is empty, return 0 (or handle as per requirements)
        if (dailyTemperatureChanges.length == 0) {
            return 0.0f;
        }

        // If the array has only one element, return that element (as it is the only subarray possible)
        if (dailyTemperatureChanges.length == 1) {
            return dailyTemperatureChanges[0];
        }

        // Initialize the current max and global max to the first element of the array
        float maxCurrent = dailyTemperatureChanges[0];
        float maxGlobal = dailyTemperatureChanges[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < dailyTemperatureChanges.length; i++) {
            // Calculate maxCurrent by deciding whether to start a new subarray at dailyTemperatureChanges[i]
            // or continue the current subarray by adding dailyTemperatureChanges[i]
            maxCurrent = Math.max(dailyTemperatureChanges[i], maxCurrent + dailyTemperatureChanges[i]);

            // Update maxGlobal if maxCurrent is greater
            maxGlobal = Math.max(maxGlobal, maxCurrent);
        }

        // Round the result to two decimal places for precision issues
        return Math.round(maxGlobal * 100.0f) / 100.0f;
    }


}
