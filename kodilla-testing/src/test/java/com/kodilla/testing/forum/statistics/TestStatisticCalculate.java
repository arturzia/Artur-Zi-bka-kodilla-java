package com.kodilla.testing.forum.statistics;


import org.junit.*;


import java.util.*;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestStatisticCalculate {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testStatistic() {

        //Given
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> userName = new ArrayList<>();
        userName.add("Jan");
        userName.add("Anna");
        userName.add("Tadek");
        userName.add("Daria");
        userName.add("Artur");
        when(statisticMock.usersNames()).thenReturn(userName);

        int postsCount = 0;
        when(statisticMock.postsCount()).thenReturn(postsCount);

        int commentsCount = 0;
        when(statisticMock.commentsCount()).thenReturn(commentsCount);

        StatisticCalculate statisticCalculate = new StatisticCalculate(statisticMock);


        //When
        statisticCalculate.calculateAdvStatistics();

        //Then
        Assert.assertEquals(5, statisticCalculate.getNumberOfUsers());
        Assert.assertEquals(0, statisticCalculate.getNumberOfPosts());
        Assert.assertEquals(0, statisticCalculate.getNumberOfComments());
        Assert.assertEquals(0, statisticCalculate.getAverageNumberOfPostsPerUser(), 0.1);
        Assert.assertEquals(0, statisticCalculate.getAverageNumberOfCommentsPerUser(), 0.1);
        Assert.assertEquals(Double.NaN, statisticCalculate.getAverageNumberOfCommentsPerPost(), 0.1);
    }

    @Test
    public void testStatistic1000Posts() {

        //Given
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> userName = new ArrayList<>();
        userName.add("Jan");
        userName.add("Anna");
        userName.add("Tadek");
        userName.add("Daria");
        userName.add("Artur");
        when(statisticMock.usersNames()).thenReturn(userName);

        int postsCount = 1000;
        when(statisticMock.postsCount()).thenReturn(postsCount);

        int commentsCount = 0;
        when(statisticMock.commentsCount()).thenReturn(commentsCount);

        StatisticCalculate statisticCalculate = new StatisticCalculate(statisticMock);


        //When
        statisticCalculate.calculateAdvStatistics();

        //Then
        Assert.assertEquals(5, statisticCalculate.getNumberOfUsers());
        Assert.assertEquals(1000, statisticCalculate.getNumberOfPosts());
        Assert.assertEquals(0, statisticCalculate.getNumberOfComments());
        Assert.assertEquals(200, statisticCalculate.getAverageNumberOfPostsPerUser(), 0.1);
        Assert.assertEquals(0, statisticCalculate.getAverageNumberOfCommentsPerUser(), 0.1);
        Assert.assertEquals(0, statisticCalculate.getAverageNumberOfCommentsPerPost(), 0.1);
    }

    @Test
    public void testStatisticCommentsMoreThenPosts() {

        //Given
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> userName = new ArrayList<>();
        userName.add("Jan");
        userName.add("Anna");
        userName.add("Tadek");
        userName.add("Daria");
        userName.add("Artur");
        when(statisticMock.usersNames()).thenReturn(userName);

        int postsCount = 100;
        when(statisticMock.postsCount()).thenReturn(postsCount);

        int commentsCount = 200;
        when(statisticMock.commentsCount()).thenReturn(commentsCount);

        StatisticCalculate statisticCalculate = new StatisticCalculate(statisticMock);


        //When
        statisticCalculate.calculateAdvStatistics();

        //Then
        Assert.assertEquals(5, statisticCalculate.getNumberOfUsers());
        Assert.assertEquals(100, statisticCalculate.getNumberOfPosts());
        Assert.assertEquals(200, statisticCalculate.getNumberOfComments());
        Assert.assertEquals(20, statisticCalculate.getAverageNumberOfPostsPerUser(), 0.1);
        Assert.assertEquals(40, statisticCalculate.getAverageNumberOfCommentsPerUser(), 0.1);
        Assert.assertEquals(2, statisticCalculate.getAverageNumberOfCommentsPerPost(), 0.1);
    }

    @Test
    public void testStatisticZeroUser() {

        //Given
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> userName = new ArrayList<>();

        when(statisticMock.usersNames()).thenReturn(userName);

        int postsCount = 0;
        when(statisticMock.postsCount()).thenReturn(postsCount);

        int commentsCount = 0;
        when(statisticMock.commentsCount()).thenReturn(commentsCount);

        StatisticCalculate statisticCalculate = new StatisticCalculate(statisticMock);


        //When
        statisticCalculate.calculateAdvStatistics();

        //Then
        Assert.assertEquals(0, statisticCalculate.getNumberOfUsers());
        Assert.assertEquals(0, statisticCalculate.getNumberOfPosts());
        Assert.assertEquals(0, statisticCalculate.getNumberOfComments());
        Assert.assertEquals(Double.NaN, statisticCalculate.getAverageNumberOfPostsPerUser(), 0.1);
        Assert.assertEquals(Double.NaN, statisticCalculate.getAverageNumberOfCommentsPerUser(), 0.1);
        Assert.assertEquals(Double.NaN, statisticCalculate.getAverageNumberOfCommentsPerPost(), 0.1);
    }



    @Test
    public void testStatistic100Users() {

        //Given
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> userName = new ArrayList<>();
        for(int n = 1; n <= 100; n++){
            String theUserName = new String("UserNames " + n);
            userName.add(theUserName);
        }
        when(statisticMock.usersNames()).thenReturn(userName);

        int postsCount = 200;
        when(statisticMock.postsCount()).thenReturn(postsCount);

        int commentsCount = 200;
        when(statisticMock.commentsCount()).thenReturn(commentsCount);

        StatisticCalculate statisticCalculate = new StatisticCalculate(statisticMock);


        //When
        statisticCalculate.calculateAdvStatistics();

        //Then
        Assert.assertEquals(100, statisticCalculate.getNumberOfUsers());
        Assert.assertEquals(200, statisticCalculate.getNumberOfPosts());
        Assert.assertEquals(200, statisticCalculate.getNumberOfComments());
        Assert.assertEquals(2, statisticCalculate.getAverageNumberOfPostsPerUser(), 0.1);
        Assert.assertEquals(2, statisticCalculate.getAverageNumberOfCommentsPerUser(), 0.1);
        Assert.assertEquals(1, statisticCalculate.getAverageNumberOfCommentsPerPost(), 0.1);
    }
}
