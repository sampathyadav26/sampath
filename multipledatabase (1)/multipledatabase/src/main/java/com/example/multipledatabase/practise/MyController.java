package com.example.multipledatabase.practise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/getBuilder")
    public HolidayPlanner getHolidayPlanner(){
        HolidayPlanner.HolidayPlannerBuilder builder = new HolidayPlanner.HolidayPlannerBuilder();
        HolidayPlanner planner=builder.setLunchTime("12:30pm")
                .setStartDate("1-nov-23")
//                .setEndDate("10-nov-23")
//                .setBusType(BusType.DELUXE)
                .build();
        return planner;
    }
}
