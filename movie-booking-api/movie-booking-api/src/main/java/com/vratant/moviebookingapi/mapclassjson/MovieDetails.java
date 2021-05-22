package com.vratant.moviebookingapi.mapclassjson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDetails {

   int id;
   String name;
   long date;
   long time;
   long duration;

    public MovieDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "movieDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", duration=" + duration +
                '}';
    }
}
