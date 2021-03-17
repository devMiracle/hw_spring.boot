package net.miracle.broker.controller;


import net.miracle.broker.FeedbackService;
import net.miracle.broker.models.FeedbackModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FeedbackController {

private final FeedbackService feedbackService;


    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }
@GetMapping("/feedback")
    public List<FeedbackModel> getFeedbacks () {
        return feedbackService.getFeedbacks();
    }

}
