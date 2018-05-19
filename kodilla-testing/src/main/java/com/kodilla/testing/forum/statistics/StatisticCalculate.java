package com.kodilla.testing.forum.statistics;

public class StatisticCalculate {

    Statistics statistics;

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private Double averageNumberOfPostsPerUser;
    private Double averageNumberOfCommentsPerUser;
    private Double averageNumberOfCommentsPerPost;


    public StatisticCalculate(Statistics statistics) {
        this.statistics = statistics;
    }


    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }



    public void calculateAdvStatistics() {

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averageNumberOfPostsPerUser = (double)numberOfPosts/numberOfUsers;
        averageNumberOfCommentsPerUser = (double)numberOfComments/numberOfUsers;
        averageNumberOfCommentsPerPost = (double)numberOfComments/numberOfPosts;

    }


    public void showStatistics() {
    }
}