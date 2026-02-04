class MethodOverloadingDemo {

    // Method with two float parameters
    float sum(float a, float b) {
        return a + b;
    }

    // Method with three double parameters
    double sum(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        // Calling sum() with two integer arguments
        float result1 = obj.sum(10, 20);
        System.out.println("Sum of two numbers: " + result1);

        // Calling sum() with three integer arguments
        double result2 = obj.sum(5, 15, 25);
        System.out.println("Sum of three numbers: " + result2);
    }
}
