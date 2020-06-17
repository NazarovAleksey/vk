package ru.netology.domain;

public class LikesInfo {
    private boolean userLike;
    private int сount;
    private boolean canLike;
    private boolean canPublish;

    public boolean isUserLike() {
        return userLike;
    }

    public void setUserLike(boolean userLike) {
        this.userLike = userLike;
    }

    public int getCount() {
        return сount;
    }

    public void setCount(int count) {
        сount = count;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
