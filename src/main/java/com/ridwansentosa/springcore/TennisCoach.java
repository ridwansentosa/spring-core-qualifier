package com.ridwansentosa.springcore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class TennisCoach implements Coach{
    @Override
    public List<String> getDailyWorkout() {

        List<String> mutable = new ArrayList<>();

        mutable.add("Push-ups (10-15 reps)");
        mutable.add("Triceps push-up (10 reps)");
        mutable.add("Plank (30 seconds - 1 minute)");
        mutable.add("Fast feet (30 seconds - 1 minute, building on speed)");
        mutable.add("High knees (30 seconds - 1 minute)");

        List<String> immutable = Collections.unmodifiableList(mutable);

        return immutable;
    }
}
