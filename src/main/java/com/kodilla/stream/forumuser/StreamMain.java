package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        List<ForumUser> userList = forum.getUserList();

        System.out.println("--------Show only men:");
        userList.stream()
                .filter(u -> u.getSex().equals(UserSex.M))
                .forEach(System.out::println);

        System.out.println("------------Show people older than 20 years:");
        userList.stream()
                .filter(u -> u.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .forEach(System.out::println);

        System.out.println("-------Show people with more than 1 published post:");
        userList.stream()
                .filter(u -> u.getPostAmount()>=1)
                .forEach(System.out::println);

        Map<Integer, ForumUser> theResultMapOfForumUser =
                userList
                .stream()
                .collect(Collectors.toMap(ForumUser::getId, u -> u));

        System.out.println("# elements in MAP: " + theResultMapOfForumUser.size());
        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> "("+entry.getKey() + ": " + entry.getValue()+")")
                .forEach(System.out::println);

    }
}
