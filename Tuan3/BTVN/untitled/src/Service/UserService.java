package Service;

import constant.Constant;
import model.User;

import java.util.ArrayList;

public class UserService {
    private ArrayList<model.User> data;
    public UserService(ArrayList<model.User> data){
        this.data = data;
    }
    public model.User getUserById(String userId){
        for(User x : data){
            if(userId.equals(x.getId())) {
                return x;
            }
        }
        System.out.println(Constant.ErrorMessage.INVALID_ID);
        return null;
    }

    public ArrayList<User> getAllUser() {
        return data;
    }
    public void addUser(User x){
        data.add(x);
    }
}
