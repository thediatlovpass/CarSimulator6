public class Car {
    private static boolean isTankNotEmpty;
    private static boolean isEngineOperational;
    private static boolean isFuelFillerFlapClosed;
    private static boolean areDoorsAndTrunkClosed;
    private static boolean isEngineWorking;

    private final static int CAR_IS_WORKING = 100;
    private final static int CAR_IS_NOT_WORKING_ENGINE_FAILURE = 200;
    private final static int CAR_IS_NOT_WORKING_LACK_OF_FUEL = 300;
    private final static int CAR_IS_WORKING_FUEL_FILLER_FLAP_OPEN = 400;
    private final static int CAR_IS_WORKING_DOORS_AND_TRUNK_OPEN = 500;

    public static int status() {
        if (isTankNotEmpty) {
            if (isEngineOperational) {
                if (isFuelFillerFlapClosed) {
                    if (areDoorsAndTrunkClosed) {
                        return CAR_IS_WORKING;
                    } else {
                        return CAR_IS_WORKING_DOORS_AND_TRUNK_OPEN;
                    }
                } else {
                    return CAR_IS_WORKING_FUEL_FILLER_FLAP_OPEN;
                }
            } else {
                return CAR_IS_NOT_WORKING_ENGINE_FAILURE;
            }
        } else {
            return CAR_IS_NOT_WORKING_LACK_OF_FUEL;
        }
    }

    public String start() {
        String status;
        if (isEngineWorking) {
            if ((isEngineOperational || isTankNotEmpty) == false) {
                isEngineWorking = false;
                status = "Silnik został wyłączony. Awaria silnika, lub brak paliwa";
                return status;
            } else
                isEngineWorking
        } else if ((isEngineOperational || isTankNotEmpty) == false) {
            return isEngineWorking = false;
        }
    }
}
