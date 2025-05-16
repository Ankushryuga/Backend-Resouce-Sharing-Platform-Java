package com.ankush.Resource_sharing_app.model.Tasks;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Priority{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int priorityId;

    @NotNull
    private String priorityName;


    public void setPriorityId(int priorityId){
        this.priorityId=priorityId;
    }
    public int getPriorityId(){
        return priorityId;
    }
    public void setPriorityName(String priorityName){
        this.priorityName=priorityName;
    }
}

