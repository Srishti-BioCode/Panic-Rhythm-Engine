# The Panic Rhythm Algorithm

### Step 1: Signal Acquisition
Capture raw data from the 3-axis Accelerometer ($A_x, A_y, A_z$).

### Step 2: Noise Filtering
Using a **Low-Pass Filter** to remove gravity and a **High-Pass Filter** to isolate the 8-12 Hz frequency band (Human Stress Tremors).

### Step 3: Magnitude Calculation
Calculate the Vector Magnitude:
$$|A| = \sqrt{A_x^2 + A_y^2 + A_z^2}$$

### Step 4: Pattern Matching
Compare the current vibration pattern with the 'Panic Profile' (High frequency + High intensity).

### Step 5: SOS Execution
If the pattern persists for >4 seconds, initiate `triggerSOS()`.
