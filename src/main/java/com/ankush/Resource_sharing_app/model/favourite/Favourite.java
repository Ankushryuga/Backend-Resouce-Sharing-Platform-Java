package com.ankush.Resource_sharing_app.model.favourite;

import com.ankush.Resource_sharing_app.model.workStreams.WorkStreams;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;

@Entity
public class Favourite{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int favouriteId;

    @NotNull
    private int userId;


    @ManyToOne
    @JoinColumn(name="workstream_id")
    private WorkStreams workStreams;

    private int courseId;

    public int getFavouriteId() {
        return favouriteId;
    }

    public void setFavouriteId(int favouriteId) {
        this.favouriteId = favouriteId;
    }

    @NotNull
    public int getUserId() {
        return userId;
    }

    public void setUserId(@NotNull int userId) {
        this.userId = userId;
    }

    public WorkStreams getWorkStreams() {
        return workStreams;
    }

    public void setWorkStreams(WorkStreams workStreams) {
        this.workStreams = workStreams;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}