# Calculator Automation Test

This project automates the calculator app on an Android device using Appium and Selenium. The automation script performs a simple addition operation and verifies the result.

## Prerequisites

Before running the automation script, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- Appium Server
- Android Studio (for ADB)

## Connecting Your Phone

1. **Enable Developer Options**:
   - Go to `Settings` > `About phone`.
   - Tap on `Build number` seven times to enable Developer Options.

2. **Enable USB Debugging**:
   - Go to `Settings` > `Developer options`.
   - Enable `USB debugging`.

3. **Install ADB**:
   - If you have Android Studio installed, ADB is included. Otherwise, you can install it separately.
   - Ensure that the ADB path is added to your system's environment variables.

4. **Connect Your Phone**:
   - Connect your Android device to your computer using a USB cable.
   - Open a terminal or command prompt and run the following command to verify the connection:
     ```bash
     adb devices
     ```
   - You should see your device listed. If prompted on your phone, allow USB debugging.

5. **Start Appium Server**:
   - Open a terminal and run the Appium server using the command:
     ```bash
     appium
     ```
   - Ensure that the server is running and listening on the default port (4723).

## Project Structure

The project contains the following files:

- `AutomateCalc.java`: The main automation script that interacts with the calculator app.
- `pom.xml`: The Maven configuration file that manages dependencies.

## Code Overview

### `AutomateCalc.java`

This Java class contains the main method that performs the following steps:

1. **Set Desired Capabilities**:
   - Configures the desired capabilities for the Appium driver, including device name, platform name, platform version, app package, and app activity.

2. **Initialize AndroidDriver**:
   - Creates an instance of `AndroidDriver` to interact with the connected Android device.

3. **Perform Calculator Operations**:
   - Clicks on the number `8`, the plus sign, the number `2`, and the equal sign to perform the addition operation.
   - Retrieves the result displayed on the calculator.

4. **Verify Result**:
   - Compares the result with the expected value (`10` in this case) and prints "Successful" if the test passes or "Fail" if it does not.

5. **Close Session**:
   - Quits the driver and closes the session.

## Running the Test

1. Open a terminal and navigate to the project directory.
2. Run the following command to execute the test:
   ```bash
   mvn clean install
