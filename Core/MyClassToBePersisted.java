package Core;
import java.io.Serializable;

public class MyClassToBePersisted implements Serializable {
    private String profile;
    private String group;

    public MyClassToBePersisted(String profile, String group) {
        this.profile = profile;
        this.group = group;
    }

    public String getProfile() {
        return profile;
    }

    public String getGroup() {
        return group;
    }
}