package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(01, "Iza Wilk ", 'F', 1, 1999, 11, 12));
        theForumUserList.add(new ForumUser(02 , "Ola Pacyga ", 'F', 10,
                1975 , 6 , 22));
        theForumUserList.add(new ForumUser(03, "Jan Kowalski ", 'M', 0,
                2000 , 10 , 12));
        theForumUserList.add(new ForumUser(04 , "Olaf Dyrcz ", 'M', 23,
                1970 , 12 , 24));
        theForumUserList.add(new ForumUser(05 , "Jan Dorsz ", 'M', 3,
                2012 , 8 , 14));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);

    }
}