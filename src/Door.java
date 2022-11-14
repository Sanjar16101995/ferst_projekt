

    public class Door {
        private int countOfDoor;
        private String color;

        private Door(int countOfDoor, String color) {
            this.countOfDoor = countOfDoor;
            this.color = color;
        }

        private int getCountOfDoor() {
            return countOfDoor;
        }

        public void setCountOfDoor(int countOfDoor) {
            this.countOfDoor = countOfDoor;
        }

        private String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }


        @Override
        public String toString() {
            return "Door{" +
                    "countOfDoor=" + countOfDoor + '\'' +
                    "color=" + color + '\'' +
                    '}';
        }
    }
