package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MeasureStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatisticsPostZeroWithMock() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        userList.add("user3");
        int postCount = 0;
        int commentCount = 1;
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        MeasureStatistics measureStatistics = new MeasureStatistics(statisticsMock);
        measureStatistics.calculateAdvStatistics();
        measureStatistics.showStatistics();

        Assert.assertEquals("avg post per user",0.0,measureStatistics.getAvgPostUser(),0);
        Assert.assertEquals("avg comment per user",0.0,measureStatistics.getAvgCommentUser(),0);
        Assert.assertEquals("comment per post",0.0,measureStatistics.getAvgCommentPost(),0);
    }

    @Test
    public void testCalculateAdvStatisticsPostThousandWithMock() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        int postCount = 1000;
        int commentCount = 2;
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        MeasureStatistics measureStatistics = new MeasureStatistics(statisticsMock);
        measureStatistics.calculateAdvStatistics();
        measureStatistics.showStatistics();

        Assert.assertEquals("avg post per user",500.0,measureStatistics.getAvgPostUser(),0);
        Assert.assertEquals("avg comment per user",1.0,measureStatistics.getAvgCommentUser(),0);
        Assert.assertEquals("comment per post",0.002,measureStatistics.getAvgCommentPost(),0);
    }

    @Test
    public void testCalculateAdvStatisticsCommentZeroWithMock() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        int postCount = 4;
        int commentCount = 0;
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        MeasureStatistics measureStatistics = new MeasureStatistics(statisticsMock);
        measureStatistics.calculateAdvStatistics();
        measureStatistics.showStatistics();

        Assert.assertEquals("avg post per user",2.0,measureStatistics.getAvgPostUser(),0);
        Assert.assertEquals("avg comment per user",0.0,measureStatistics.getAvgCommentUser(),0);
        Assert.assertEquals("comment per post",0.0,measureStatistics.getAvgCommentPost(),0);

    }

    @Test
    public void testCalculateAdvStatisticsCommentCountLessThanPostCountWithMock() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        int postCount = 16;
        int commentCount = 2;
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        MeasureStatistics measureStatistics = new MeasureStatistics(statisticsMock);
        measureStatistics.calculateAdvStatistics();
        measureStatistics.showStatistics();

        Assert.assertEquals("avg post per user",8.0,measureStatistics.getAvgPostUser(),0);
        Assert.assertEquals("avg comment per user",1.0,measureStatistics.getAvgCommentUser(),0);
        Assert.assertEquals("comment per post",0.125,measureStatistics.getAvgCommentPost(),0);

    }

    @Test
    public void testCalculateAdvStatisticsCommentCountMoreThanPostCountWithMock() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        int postCount = 50;
        int commentCount = 200;
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        MeasureStatistics measureStatistics = new MeasureStatistics(statisticsMock);
        measureStatistics.calculateAdvStatistics();
        measureStatistics.showStatistics();

        Assert.assertEquals("avg post per user",25.0,measureStatistics.getAvgPostUser(),0);
        Assert.assertEquals("avg comment per user",100.0,measureStatistics.getAvgCommentUser(),0);
        Assert.assertEquals("comment per post",4.0,measureStatistics.getAvgCommentPost(),0);

    }

    @Test
    public void testCalculateAdvStatisticsUsersZeroWithMock() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        int postCount = 15;
        int commentCount = 105;
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        MeasureStatistics measureStatistics = new MeasureStatistics(statisticsMock);
        measureStatistics.calculateAdvStatistics();
        measureStatistics.showStatistics();

        Assert.assertEquals("avg post per user",0.0,measureStatistics.getAvgPostUser(),0);
        Assert.assertEquals("avg comment per user",0.0,measureStatistics.getAvgCommentUser(),0);
        Assert.assertEquals("comment per post",7.0,measureStatistics.getAvgCommentPost(),0);
    }

    @Test
    public void testCalculateAdvStatisticsUsersThousandWithMock() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = Arrays.asList(new String[1000]);
        int postCount = 100;
        int commentCount = 2000;
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        MeasureStatistics measureStatistics = new MeasureStatistics(statisticsMock);
        measureStatistics.calculateAdvStatistics();
        measureStatistics.showStatistics();

        Assert.assertEquals("avg post per user",0.1,measureStatistics.getAvgPostUser(),0);
        Assert.assertEquals("avg comment per user",2.0,measureStatistics.getAvgCommentUser(),0);
        Assert.assertEquals("comment per post",20.0,measureStatistics.getAvgCommentPost(),0);

    }
}
