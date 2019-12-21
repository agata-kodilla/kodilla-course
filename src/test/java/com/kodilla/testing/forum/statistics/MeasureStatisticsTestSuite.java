package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MeasureStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatisticsWithMock() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        userList.add("user3");
        int postCount = 34;
        int commentCount = 98;
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        MeasureStatistics measureStatistics = new MeasureStatistics(statisticsMock);
        measureStatistics.calculateAdvStatistics();
        measureStatistics.showStatistics();
    }
}
