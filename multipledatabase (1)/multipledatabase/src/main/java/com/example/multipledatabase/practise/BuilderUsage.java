package com.example.multipledatabase.practise;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
class HolidayPlanner {
    private String lunchTime;
    private String dinnerTime;

    private String firstName;
//    private BusType busType;
    private String startDate;
    private String endDate;
    private HolidayPlanner(){}

    public String getLunchTime() {
        return lunchTime;
    }

    public String getDinnerTime() {
        return dinnerTime;
    }

//    public BusType getBusType() {
//        return busType;
//    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public  static class  HolidayPlannerBuilder {

        private HolidayPlanner planner;
        public HolidayPlannerBuilder(){
            this.planner=new HolidayPlanner();
        }

        public HolidayPlannerBuilder setStartDate(String startDate){
            planner.startDate=startDate;
            return this;
        }

        public HolidayPlannerBuilder setEndDate(String endDate){
            planner.endDate=endDate;
            return this;
        }

        public HolidayPlannerBuilder setLunchTime(String lunchTime){
            planner.lunchTime=lunchTime;
            return this;
        }

        public HolidayPlannerBuilder setFirstName(String firstName){
            planner.firstName=firstName;
            return this;
        }
//        public HolidayPlannerBuilder setBusType(BusType busType){
//            planner.busType=busType;
//            return this;
//        }

        public HolidayPlanner build(){
            return planner;
        }


    }
}
public class BuilderUsage {
    public static void main(String[] args) {
        HolidayPlanner.HolidayPlannerBuilder builder = new HolidayPlanner.HolidayPlannerBuilder();
        HolidayPlanner planner=builder.setLunchTime("12:30pm")
                .setStartDate("1-nov-23")
                .setEndDate("10-nov-23")
//                .setBusType(BusType.DELUXE)
                .build();
        System.out.println("OUTPUT:"+planner);

//        System.out.println("planner constructed="+planner.getStartDate()+"-"+planner.getEndDate());

    }
}
