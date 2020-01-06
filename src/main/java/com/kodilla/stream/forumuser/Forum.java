package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    List<ForumUser> getUserList(){
        forumUserList.add(new ForumUser(1,"Michael",UserSex.M, LocalDate.of(2000, Month.MAY, 15),34));
        forumUserList.add(new ForumUser(2,"John",UserSex.M, LocalDate.of(1980, Month.JANUARY, 8),123));
        forumUserList.add(new ForumUser(3,"Ann",UserSex.F, LocalDate.of(1988, Month.DECEMBER, 18),2));
        forumUserList.add(new ForumUser(4,"Agnes",UserSex.F, LocalDate.of(1978, Month.AUGUST, 30),0));
        forumUserList.add(new ForumUser(5,"Tom",UserSex.M, LocalDate.of(1999, Month.FEBRUARY, 22),0));
        forumUserList.add(new ForumUser(6,"Peter",UserSex.M, LocalDate.of(2001, Month.APRIL, 3),55));
        forumUserList.add(new ForumUser(7,"Patricia",UserSex.F, LocalDate.of(2001, Month.MARCH, 29),456));
        return new ArrayList<>(forumUserList);
    }
}
