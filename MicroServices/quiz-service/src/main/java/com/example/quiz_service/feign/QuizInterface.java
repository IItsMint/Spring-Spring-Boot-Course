package com.example.quiz_service.feign;

import com.example.quiz_service.model.QuestionWrapper;
import com.example.quiz_service.model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//This annotation makes feign important point is, our file must be interface.
//Also, it also balances the instance. Basically, it made sure to interact with lower loaded instance and switches between.
@FeignClient("QUESTION-SERVICE")//in parentheses, we need to specify which one you want to connect. We looked up from eureka server.
public interface QuizInterface
{
    //we copied these from quest,on-service's, QuestionController
    //since it is interface we don't define methods. !!!!
    //So we modify them to only declare them.
    @GetMapping("question/generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String categoryName, @RequestParam Integer numQuestions);
//    {
//        return questionService.getQuestionsForQuiz(categoryName, numQuestions);
//    }

    @PostMapping("question/getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds);
//    {
//        return questionService.getQuestionsFromId(questionIds);
//    }

    @PostMapping("question/getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses);
//    {
//        return questionService.getScore(responses);
//    }



}
