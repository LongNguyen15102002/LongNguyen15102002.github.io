package com.example.buoi4springboot.database;

import com.example.buoi4springboot.model.User;

import java.util.ArrayList;
import java.util.List;

public class FakeDB {
    public static List<User> users = new ArrayList<>(List.of(
            new User(1, "Bùi Hiên", "buihien01091997@gmail.com", "0344005816", "Tỉnh Thái Bình", null, "hien123"),
            new User(2, "Nguyễn Thu Hằng", "thuhangvnua@gmail.com", "0123456789", "Tỉnh Nam Định", null, "hang123"),
            new User(3, "Nguyễn Việt Long", "lavalshy2002@gmail.com", "0971167202", "TP.Hà Nội", null, "15102002")
    ));
}
