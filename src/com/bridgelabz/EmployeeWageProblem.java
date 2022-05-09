package com.bridgelabz;

public class EmployeeWageProblem {

    private static final int FULL_DAY_HOUR = 10;

    private static final int HALF_DAY_HOUR = 5;

    private static final int IS_FULL_TIME = 1;

    private static final int IS_PART_TIME = 2;

    private static final int WAGE_PER_HOUR = 20;

    private static final int TOTAL_WORKING_DAYS = 20;

    private static final int TOTAL_WORKING_HOURS = 100;

    public static void ComputeEmployeeWage() {
        int workingHours = 0;
        int dayCount = 1;
        int totalWage = 0;
        while (dayCount <= TOTAL_WORKING_DAYS && workingHours <= TOTAL_WORKING_HOURS) {
            int dailyWage = 0;
            int empStatus = (int) (Math.random() * 10) % 3;
            switch (empStatus) {
                case IS_FULL_TIME:
                    System.out.println("Employee worked FULL TIME");
                    workingHours = workingHours + FULL_DAY_HOUR;
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee worked PART_TIME");
                    workingHours = workingHours + HALF_DAY_HOUR;
                    dailyWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            totalWage = totalWage + dailyWage;
            System.out.println("Daily Wage for day : " + dayCount + " is " + dailyWage);
            dayCount++;
        }
        System.out.println("Total Days : " + (dayCount - 1));
        System.out.println("Total Working Hours : " + workingHours);
        System.out.println("Total wage for a month :" + totalWage);

    }


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master "
                + "Branch  ");
        ComputeEmployeeWage();
    }
}





