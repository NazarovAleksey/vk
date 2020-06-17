package ru.netology.domain;

public class RepostInfo {
    private int сount;
    private boolean userReposted;

    public boolean isUserReposted() {
        return userReposted;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }

    public int getCount() {
        return сount;
    }

    public void setCount(int count) {
        сount = count;
    }
}
