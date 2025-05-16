package com.ankush.Resource_sharing_app.model.favourite;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;


@Entity
public class Favourite{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int favouriteId;

    @NotNull
    private int userId;

    private int contentId;

    private int courseId;
    
    public int getFavouriteId(){
        return this.favouriteId;
    }
    public void setFavouriteId(int favouriteId){
        this.favouriteId=favouriteId;
    }

    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId=userId;
    }

    public int getContentId(){
        return contentId;
    }

    public void setContentId(int contentId){
        this.contentId=contentId;
    }

    public int getCourseId(){
        return courseId;
    }

    public void setCourseId(int courseId){
        this.courseId=courseId;
    }
}