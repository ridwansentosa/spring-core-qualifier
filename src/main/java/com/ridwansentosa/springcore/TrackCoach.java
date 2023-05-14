package com.ridwansentosa.springcore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class TrackCoach implements Coach{
    @Override
    public List<String> getDailyWorkout() {
        List<String> mutable = new ArrayList<>();

        mutable.add("Warm up: 1 mile in and outs (100M sprint; 100M walk) each lap faster; last lap 200M sprint");
        mutable.add("STRETCHES");
        mutable.add("Drills");
        mutable.add("2 X 300 Meter: 70% on 200M; 80% last 100M/ rest 15'");
        mutable.add("2 X 100 Meter: 75%; rest 30”");
        mutable.add("4 X 40 Meter: Quick; rest 20”");

        List<String> immutable = Collections.unmodifiableList(mutable);

        return immutable;
    }
}
