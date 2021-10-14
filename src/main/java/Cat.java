import java.util.Objects;

public class Cat {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return getMessage().equals(cat.getMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessage());
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
