package com.ankush.Resource_sharing_app.dto.FavouriteDTO;

import com.ankush.Resource_sharing_app.model.workStreams.WorkStreams;
import jakarta.validation.constraints.NotBlank;

public class FavouriteRequestDTO {

    @NotBlank(message = "userId is required")
    private int userId;

    private int workStreamId;

    private int courseId;

    @NotBlank(message = "userId is required")
    public int getUserId() {
        return userId;
    }

    public void setUserId(@NotBlank(message = "userId is required") int userId) {
        this.userId = userId;
    }

    public int getWorkStreamId() {
        return workStreamId;
    }

    public void setWorkStreamId(int workStreamId) {
        this.workStreamId = workStreamId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
