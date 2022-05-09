package com.bridgelabz;

public class EmployeeWageProblem {

    private static final int FULL_DAY_HOUR = 10;

    private static final int HALF_DAY_HOUR = 5;

    private static final int IS_FULL_TIME = 1;

    private static final int IS_PART_TIME = 2;

    private static final int WAGE_PER_HOUR = 20;

    private static final int TOTAL_WORKING_DAYS=20;

    public static void main(String[] args)
        {
            System.out.println("Welcome to Employee Wage Computation Program on Master "
                    + "Branch  ");
                int dailyWage=0;
                int dayCount=0;
                int totalWage=0;
                while(dayCount<TOTAL_WORKING_DAYS) {
                    int empStatus = (int) (Math.random() * 10) % 3;
                    switch (empStatus) {
                        case IS_FULL_TIME:
                            System.out.println("Employee worked FULL TIME");
                            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                            break;
                        case IS_PART_TIME:
                            System.out.println("Employee worked PART_TIME");
                            dailyWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
                            break;
                        default:
                            System.out.println("Employee is Absent");
                            dailyWage=0;
                    }
                    System.out.println("Daily Wage for day : " + dayCount + " is " + dailyWage);
                    dayCount++;
                    totalWage = totalWage + dailyWage;
                }

            System.out.println(totalWage);

            }

        }




