public class Employee {

        public Employee(String name, double salary, String jobTitle) {
            this.name = name;
            this.salary = salary;
            this.jobTitle = jobTitle;
        }

        private String name;
        // Нужно добавить:
        // Зароботную плату
        private double salary;
        // Позицию на которой работает сотрудник
        private String jobTitle;

        public Employee(){

        }

        public Employee(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        @Override
        public String toString() {
            return "Работник: " +
                    "\nИмя: " + name +
                    "\nЗарплата: " + salary +
                    "\nДолжность: " + jobTitle;
        }
    }



