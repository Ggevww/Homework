package homework11.task3;

/**
 * Enum representing the states of a traffic light.
 * Each state can transition to the next state in the sequence.
 */
public enum TrafficLight {
    RED{
        @Override
        public TrafficLight getNextLight() {
            return YELLOW;
        }
    },
    YELLOW{
        @Override
        public TrafficLight getNextLight() {
            return GREEN;
        }
    },
    GREEN{
        @Override
        public TrafficLight getNextLight() {
            return RED;
        }
    };

    /**
     * Returns the next traffic light state in the sequence.
     * @return the next TrafficLight state
     */
    public abstract TrafficLight getNextLight();
}
