package com.codeclan.example.topdogs;

/**
 * Created by Louise on 24/05/2017.
 */

class Dog {

    private int ranking;
    private String breed;
    private String status;

    public Dog(Integer ranking, String breed, String status) {
        this.ranking = ranking;
        this.breed = breed;
        this.status = status;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getBreed() {
        return breed;
    }

    public String getStatus() {
        return status;
    }
}
