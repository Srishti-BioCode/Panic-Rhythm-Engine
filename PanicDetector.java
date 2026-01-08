/**
 * Project: Panic Rhythm Engine
 * Developer: Srishti (IIT Patna & LU)
 * Concept: Detecting Adrenaline-linked tremors (8-12 Hz) for Women's Safety
 */

public class PanicDetector {

    // Constant values based on physiological research
    private static final double MIN_PANIC_FREQ = 8.0;  // Minimum tremor frequency during stress
    private static final double MAX_PANIC_FREQ = 12.0; // Maximum tremor frequency during stress
    private static final double FORCE_THRESHOLD = 0.5; // G-force intensity

    /**
     * This method simulates the analysis of real-time sensor data
     * @param frequency The detected vibration frequency from accelerometer
     * @param magnitude The intensity of the movement
     */
    public void analyzeBioSignals(double frequency, double magnitude) {
        System.out.println("Scanning for Panic Rhythm Patterns...");

        if (isPanicPattern(frequency, magnitude)) {
            triggerEmergencyProtocol();
        } else {
            System.out.println("Signal Normal: User is safe.");
        }
    }

    private boolean isPanicPattern(double freq, double mag) {
        // Logic: Checks if the frequency matches the 8-12Hz human tremor range
        return (freq >= MIN_PANIC_FREQ && freq <= MAX_PANIC_FREQ) && mag > FORCE_THRESHOLD;
    }

    private void triggerEmergencyProtocol() {
        System.out.println("!!! CRITICAL ALERT !!!");
        System.out.println("Panic Rhythm detected. Adrenaline levels likely high.");
        System.out.println("Action: Sending encrypted GPS location to saved contacts.");
        System.out.println("Action: Recording surrounding audio for evidence.");
    }

    public static void main(String[] args) {
        PanicDetector engine = new PanicDetector();

        // Example: Simulating a situation where a panic tremor is detected
        // In a real app, these values would come from the phone's sensors
        engine.analyzeBioSignals(10.2, 0.8); 
    }
}
