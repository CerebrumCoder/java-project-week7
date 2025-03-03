

public class UseBMIClass {
    public static void main(String[] args) {
        BMI bmi = new BMI("Neal", 18, 65, 176);

        // Iya, betul banget! 💡 Kalau kamu mau mengakses class dari file lain di Java, 
        // langkah awalnya memang harus dikompile dulu supaya menghasilkan file .class
        System.out.println(bmi.getBMI());
        System.out.println(bmi.getAge());
        
    }
}
