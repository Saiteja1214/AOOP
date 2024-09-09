class ScholarshipStudent extends AbstractStudent implements SpecialStudent {
    private double scholarshipAmount;

    public ScholarshipStudent(String name, int id, StudentStatus status, double scholarshipAmount) {
        super(name, id, status);
        this.scholarshipAmount = scholarshipAmount;
    }

    @Override
    public void applyDiscount() {
        System.out.println("Applying scholarship discount for " + name);
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("Scholarship Student: " + name + ", ID: " + id + ", Status: " + status + ", Scholarship Amount: $" + scholarshipAmount);
    }
}

