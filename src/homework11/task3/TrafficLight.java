package homework11.task3;

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

    public abstract TrafficLight getNextLight();
}
