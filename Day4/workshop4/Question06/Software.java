package workshop4.Question06;

public class Software extends Product{
    private String version;

    public Software() {
        super();
        version = "";
        count++;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return super.toString() + "Version: " + version + "\n";

    }
}
