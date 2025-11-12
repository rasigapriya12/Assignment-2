class InvalidGradeException extends Exception {
    public InvalidGradeException(String msg) {
        super(msg);
    }
}

public class GradeCheck {
    public static void main(String[] args) {
        int marks = 105;
        try {
            if (marks > 100)
                throw new InvalidGradeException("Marks cannot exceed 100!");
            System.out.println("Valid marks: " + marks);
        } catch (InvalidGradeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
