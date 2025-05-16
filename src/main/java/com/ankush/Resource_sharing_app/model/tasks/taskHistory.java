package com.ankush.Resource_sharing_app.model.Tasks;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Entity
public class TasksHistory{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int historyId;

    private int taskId;

    private String taskName;

    private String changedTaskName;

    private String taskDescription;

    private String changedTaskDescription;

    private String attachments;

    @Convert(converter=AttachmentConverter.class)
    @Column(name="attachments", columnDefinition="TEXT")
    private List<Attachment> attachments;

    @Convert(converter=AttachmentConverter.class)
    @Column(name="changedAttachments", columnDefinition="TEXT")
    private List<Attachment> changedAttachments;

    private String type;

    private String changedType;

    private int priorityId;

    private int changedPriorityId;

    private int status;
    
    
}