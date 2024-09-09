package si;


public abstract class BaseEntity {
    private String id;

    public BaseEntity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
