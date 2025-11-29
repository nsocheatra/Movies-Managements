package co.istad.system.movies;

public class Director {
        private String name;

        public Director() {
        }

        public Director(String name) {
                this.name = name;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        @Override
        public String toString() {
                return name;
        }
}
