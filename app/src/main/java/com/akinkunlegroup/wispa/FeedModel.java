package com.akinkunlegroup.wispa;

public class FeedModel {

    int id, likes, comments, profilePic, postPic;
    String time, status, name;

    public FeedModel(int id, int likes, int comments, int profilePic, int postPic, String time, String status, String name) {
        this.id = id;
        this.likes = likes;
        this.comments = comments;
        this.profilePic = profilePic;
        this.postPic = postPic;
        this.time = time;
        this.status = status;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }

    public int getPostPic() {
        return postPic;
    }

    public void setPostPic(int postPic) {
        this.postPic = postPic;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
