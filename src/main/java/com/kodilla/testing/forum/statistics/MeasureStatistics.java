package com.kodilla.testing.forum.statistics;

public class MeasureStatistics {
    private Statistics statistics;
    private int userCount;
    private int postCount;
    private int commentCount;
    private double avgPostUser;
    private double avgCommentUser;
    private double avgCommentPost;

    public MeasureStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    private int getUserCount() {
        return statistics.usersNames().size();
    }

    private int getPostCount() {
        return statistics.postsCount();
    }

    private int getCommentCount() {
        return statistics.commentsCount();
    }

    private double getAvgPostPerUser() {
        return (double) statistics.postsCount() / statistics.usersNames().size();
    }

    private double getAvgCommentPerUser() {
        return (double)statistics.commentsCount() / statistics.usersNames().size();
    }

    private double getAvgCommentPerPost() {
        return (double)statistics.commentsCount() / statistics.postsCount();
    }

    public void calculateAdvStatistics() {
        userCount = getUserCount();
        postCount = getPostCount();
        commentCount = getCommentCount();
        avgPostUser = getAvgPostPerUser();
        avgCommentUser = getAvgCommentPerUser();
        avgCommentPost = getAvgCommentPerPost();
    }

    public void showStatistics() {
        System.out.println("MeasureStatistics{" +
                "statistics=" + statistics +
                ", userCount=" + userCount +
                ", postCount=" + postCount +
                ", commentCount=" + commentCount +
                ", avgPostUser=" + avgPostUser +
                ", avgCommentUser=" + avgCommentUser +
                ", avgCommentPost=" + avgCommentPost +
                '}');
    }
}
