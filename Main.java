
        public class Main {
            public static void main(String[] args) {
            }
            enum SolarSystem {

                MERCURY (1, 0,  2440, null),
                VENUS(2, 108,  6054, "MERCURY"),
                EARTH (3, 1566,  6984, "VENUS"),
                MARS (4, 1345,  60, "EARTH"),
                JUPITER (5, 67942,  9874, "MARS"),
                SATURN (6, 9908,  334974, "JUPITER"),
                URANUS (7, 2234,  1114, "SATURN"),
                NEPTUNE (8, 1975,  744, "URANUS")
                ;
                private int serialNumber;
                private int distanceFromPreviousPlanet;
                private int radius;
                private String previousPlanet;
                private int distanceFromSun;



                SolarSystem (int serialNumber, int distanceFromPreviousPlanet, int radius, String previousPlanet)
                {
                    this.serialNumber = serialNumber;
                    this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
                    this.radius = radius;
                    this.previousPlanet = previousPlanet;
                    this.distanceFromSun = previousPlanet != null ? previousPlanet.distanceFromSun + distanceFromPreviousPlanet : 58 ;


                }
                public int getDistanceFromPreviousPlanet() {

                    return distanceFromPreviousPlanet;
                }

                public void setDistanceFromPreviousPlanet(int distanceFromPreviousPlanet) {
                    this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
                }

                public int getDistanceFromSun() {
                    return distanceFromSun;
                }

                public int setDistanceFromSun() {
                    return distanceFromSun;

                }

                public int getSerialNumber() {
                    return serialNumber;
                }

                public void setSerialNumber(int serialNumber) {
                    this.serialNumber = serialNumber;
                }

                public int getRadius() {
                    return radius;
                }

                public void setRadius(int radius) {
                    this.radius = radius;
                }

                public String getPreviousPlanet() {
                    return previousPlanet;
                }

                public void setPreviousPlanet(String previousPlanet) {
                    this.previousPlanet = previousPlanet;
                }

            }
            }

        }
}
