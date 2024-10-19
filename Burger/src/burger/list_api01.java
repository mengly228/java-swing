package burger;
import java.util.ArrayList;
public class list_api01 {
    private String email;
    private String password;
    public list_api01(){}
    public list_api01(String email,String password){
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    static ArrayList<list_api01> list_api02 = new ArrayList<>();
}

