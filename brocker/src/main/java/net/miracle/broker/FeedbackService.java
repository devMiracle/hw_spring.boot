package net.miracle.broker;

import net.miracle.broker.entity.Feedback;
import net.miracle.broker.models.FeedbackModel;
import net.miracle.broker.repositories.FeedbackDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FeedbackService {

    private final FeedbackDao feedbackDao;

    public FeedbackService(FeedbackDao feedbackDao) {
        this.feedbackDao = feedbackDao;
    }

    public List<FeedbackModel> getFeedbacks() {
        return feedbackDao.findAll().stream().map(
                feedbackEntity -> FeedbackModel.builder()
                    .id(feedbackEntity.getId())
                    .name(feedbackEntity.getName())
                    .email(feedbackEntity.getEmail())
                    .subject(feedbackEntity.getSubject())
                    .text(feedbackEntity.getText())
                .build()
        ).collect(Collectors.toList());
    }
}
