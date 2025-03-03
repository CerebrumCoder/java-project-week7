public class Exercise10_02 {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("John Doe", 18, 145, 5, 10);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Peter King", 215, 5, 10);
        System.out.println("The BMI for " + bmi2.getName() + " is "+ bmi2.getBMI() + " " + bmi2.getStatus());

        BMI bmi3 = new BMI("Neal", 18, 145, 5, 11);
        System.out.println("The BMI for " + bmi3.getName() + " is "+ bmi3.getBMI() + " " + bmi3.getStatus());
    }
    
    /* The reason why you don't see public before static class BMI 
    is likely because the class is declared inside another class and 
    isn't meant to be accessed globally. */
    static class BMI {
        private String name;
        private int age;
        private double weight;
        private double height;
        public final double KILOGRAMS_PER_ROUND = 0.45359237; 
        public final double METERS_PER_INCH = 0.0254;

        /*
        * Construct a BMI with the specified name, age, weight, 
        * feet and inches
        */
        // Constructor Overloading
        public BMI(String name, int age, double weight, double feet, double inches) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = feet * 12 + inches;
        }

        // Constructor Overloading
        public BMI(String name, int age, double weight, double height) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public BMI(String name, double weight, double height) {
            this(name, 20, weight, height);
        }

        public double getBMI() {
            double bmi = weight * KILOGRAMS_PER_ROUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
            return Math.round(bmi * 100) / 100.0;
        }

        public String getStatus() {
            double bmi = getBMI();
            if (bmi < 16)
                return "Seriously underweight";
            else if (bmi < 18)
                return "Underweight";
            else if (bmi < 24)
                return "Normal weight";
            else if (bmi < 29)
                return "Overweight";
            else if (bmi < 35)
                return "Seriously overweight";
            else
                return "Gravely overweight";            
        }

        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public double getWeight() {
            return weight;
        }
        public double getHeight() {
            return height;
        }
    }
}
