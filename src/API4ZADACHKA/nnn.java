package API4ZADACHKA;


    class Student {
        private String name;
        private int height;

        public Student(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Student{");
            sb.append("name='").append(name).append('\'');
            sb.append(", height=").append(height);
            sb.append('}');
            return sb.toString();
        }
    }


