public class Player {
        private final String name;

        private int point;

        private final int playerNumber;

        public int getPlayerNumber() {
            return this.playerNumber;
        }

        public int getPoint() {
            return this.point;
        }

        public void setPoint(int point) {
            this.point = point;
        }

        public void addPoint(int point) {
            this.point += point;
        }

        public String getName() {
            return this.name;
        }

        public Player(String name, int playerNumber) {
            this.name = name;
            this.playerNumber = playerNumber;
            this.point = 1000;
        }
    }