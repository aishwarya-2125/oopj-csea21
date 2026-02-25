class student {
    int rollNumber;

    void getNumber(int n) {
        rollNumber = n;
    }

    void printNumber() {
        System.out.println("Roll Number: " + rollNumber);
    }
}

class test extends student {
    float part1, part2;

    void getMarks(float a, float b) {
        part1 = a;
        part2 = b;
    }

    void putMarks() {
        System.out.println("Part 1 Marks: " + part1);
        System.out.println("Part 2 Marks: " + part2);
    }
}

interface sports {
    float sportwt = 6.0F;
    void putwt();
}

class results extends test implements sports {
    float total;

    public void putwt() {
        System.out.println("Sports Weightage: " + sportwt);
    }

    void display() {
        total = part1 + part2 + sportwt;
        System.out.println("Total Marks: " + total);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        results a = new results();
        
        a.getNumber(21);
        a.printNumber();
        a.getMarks(50.5F, 95.0F);
        a.putMarks();
        a.putwt();
        a.display();
    }
}
