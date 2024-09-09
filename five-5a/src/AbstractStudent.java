class InternationalStudent extends AbstractStudent {
    private String country;

    public InternationalStudent(String name, int id, StudentStatus status, String country) {
        super(name, id, status);
        this.country = country;
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("International Student: " + name + ", ID: " + id + ", Status: " + status + ", Country: " + country);
    }
}
