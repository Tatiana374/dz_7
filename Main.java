public class Main {
    public static void main(String[] args) {
    }
    enum SolarSystem {

        MERCURY (),
        VENUS(),
        EARTH (),
        MARS (),
        JUPITER (),
        SATURN (),
        URANUS (),
        NEPTUNE ()
        ;
        private int serialNumber;
        private int distanceFromPreviousPlanet;
        private int radius;
        private String previousPlanet;
        private String nextPlanet;
        private int distanceFromSun;



        SolarSystem (int serialNumber, int distanceFromPreviousPlanet, int radius, String previousPlanet, String nextPlanet, int distanceFromSun)
        {
            this.serialNumber = serialNumber;
            this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
            this.radius = radius;
            this.previousPlanet = previousPlanet;
            this.nextPlanet = nextPlanet;
            this.distanceFromSun = getDistanceFromPreviousPlanet() + distanceFromPreviousPlanet ;


        }
        public int getDistanceFromPreviousPlanet() {
            return distanceFromPreviousPlanet;
        }
        public int setDistanceFromSun() {
            return distanceFromSun;

    }

    }
