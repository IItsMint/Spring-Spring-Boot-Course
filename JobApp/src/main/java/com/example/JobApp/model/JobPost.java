package com.example.JobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

//since we imported lombok, we don't need to use getters, setters and toString.
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component //since we are using spring that line needed.
public class JobPost
{
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;
}
