package com.bridgelabz;

public class EmployeeWageProblem {

    private static final int FULL_DAY_HOUR = 10;

    private static final int HALF_DAY_HOUR = 5;

    private static final int IS_FULL_TIME = 1;

    private static final int IS_PART_TIME = 2;

    private static final int WAGE_PER_HOUR = 20;

    public static void main(String[] args)
        {
            System.out.println("Welcome to Employee Wage Computation Program on Master "
                    + "Branch  ");
                int dailyWage=0;
                int workingHours = 0;
                int empStatus = (int) (Math.random() * 10) % 3;
                System.out.println(empStatus);
            switch (empStatus) {
                case IS_FULL_TIME:
                    System.out.println("Employee worked FULL TIME");
                    //workingHours = workingHours + FULL_DAY_HOUR;
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee worked PART_TIME");
                    dailyWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            System.out.println("Daily wage:"+dailyWage);
            }

        }




