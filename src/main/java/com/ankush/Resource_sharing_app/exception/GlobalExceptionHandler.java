package com.ankush.Resource_sharing_app.exception;

import com.ankush.Resource_sharing_app.exception.SprintExceptions.SprintAlreadyExists;
import com.ankush.Resource_sharing_app.exception.TaskExceptions.TaskNameAlreadyExistsInSprint;
import com.ankush.Resource_sharing_app.exception.UsersExceptions.UserExistsByEmail;
import com.ankush.Resource_sharing_app.exception.UsersExceptions.UserExistsByName;
import com.ankush.Resource_sharing_app.exception.UsersExceptions.UserNotFound;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log= LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationException(MethodArgumentNotValidException ex){
        Map<String, String> errors=new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error->errors.put(error.getField(), error.getDefaultMessage()));
        return ResponseEntity.badRequest().body(errors);
    }

    //users specific exceptions:
    @ExceptionHandler(UserExistsByName.class)
    public ResponseEntity<String> handleUserExistsByName(UserExistsByName ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(UserExistsByEmail.class)
    public ResponseEntity<String> handleExistsByEmail(UserExistsByEmail ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    //user not found exception.
    @ExceptionHandler(UserNotFound.class)
    public ResponseEntity<String> handleUserNotFound(UserNotFound ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }


    //Sprint exceptions:
    @ExceptionHandler(SprintAlreadyExists.class)
    public ResponseEntity<String> handleSprintsAlreadyExists(SprintAlreadyExists ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(TaskNameAlreadyExistsInSprint.class)
    public ResponseEntity<String> handleTaskAlreadyExists(TaskNameAlreadyExistsInSprint ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }


    //GENERIC FALLBACK EXCEPTION
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleOtherExceptions(Exception ex){
        return new ResponseEntity<>("An error occured: "+ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
