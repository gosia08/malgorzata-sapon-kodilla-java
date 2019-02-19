package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double avarageUsersNumberOfPosts;
    double avarageUsersNumberOfComments;
    double avaragePostsNumberOfComments;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvarageUsersNumberOfPosts() {
        return avarageUsersNumberOfPosts;
    }

    public double getAvarageUsersNumberOfComments() {
        return avarageUsersNumberOfComments;
    }

    public double getAvaragePostsNumberOfComments() {
        return avaragePostsNumberOfComments;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0) {

            avarageUsersNumberOfPosts =  numberOfPosts / numberOfUsers;
            avarageUsersNumberOfComments =  numberOfComments /  numberOfUsers;
        }
        if (numberOfPosts > 0) {

            avaragePostsNumberOfComments = numberOfComments / numberOfPosts;
        }

    }
    public void showStatistics() {

        System.out.println(" ");
        System.out.println(numberOfUsers);
        System.out.println( numberOfPosts);
        System.out.println(numberOfComments);
        System.out.println(avarageUsersNumberOfComments);
        System.out.println(avaragePostsNumberOfComments);
        System.out.println(avarageUsersNumberOfPosts);
        System.out.println(" ");

    }

}