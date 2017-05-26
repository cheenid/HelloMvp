package com.example.administrator.hellomvp.model;

import java.util.List;

/**
 * Created by Administrator on 2017/5/26.
 */

interface UserDatasource {


    User queryByIdCard(String id);
    List<User> queryByAgeLessThan(int age);

    boolean save(User u);


}
