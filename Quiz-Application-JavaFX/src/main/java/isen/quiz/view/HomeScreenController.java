package isen.quiz.view;

import isen.quiz.App;

import java.io.IOException;

public class HomeScreenController {
    public void handleButtonLaunch() throws IOException {
        App.setRoot("/isen/quiz/view/QuizOverview");
    }
}
