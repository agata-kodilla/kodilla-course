package com.kodilla.testing.forum.statistics;

public class MeasureStatistics {
    private Statistics statistics;
    private int userCount;
    private int postCount;
    private int commentCount;
    private double avgPostUser;
    private double avgCommentUser;
    private double avgCommentPost;

    public double getAvgPostUser() {
        return avgPostUser;
    }

    public double getAvgCommentUser() {
        return avgCommentUser;
    }

    public double getAvgCommentPost() {
        return avgCommentPost;
    }

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
        if (statistics.postsCount() == 0) {
            return  0;
        }
        return statistics.commentsCount();
    }


    private double getAvgPostPerUser() {
        if(statistics.usersNames().size()==0) {
            return 0;
        }
        return (double) statistics.postsCount() / statistics.usersNames().size();
    }

    private double getAvgCommentPerUser() {
        if (statistics.postsCount() == 0 || statistics.usersNames().size()==0) {
            return 0;
        }
        return (double) statistics.commentsCount() / statistics.usersNames().size();
    }

    private double getAvgCommentPerPost() {
        if(statistics.postsCount()==0){
            return 0;
        }
        return (double) statistics.commentsCount() / statistics.postsCount();
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
                "userCount=" + userCount +
                ", postCount=" + postCount +
                ", commentCount=" + commentCount +
                ", avgPostUser=" + avgPostUser +
                ", avgCommentUser=" + avgCommentUser +
                ", avgCommentPost=" + avgCommentPost +
                '}');
    }
}
