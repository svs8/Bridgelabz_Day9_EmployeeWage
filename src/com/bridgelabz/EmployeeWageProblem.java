package com.bridgelabz;

public class EmployeeWageProblem {

    private static final int FULL_DAY_HOUR = 10;

    private static final int IS_FULL_TIME = 1;

    private static final int WAGE_PER_HOUR = 20;

    public static void main(String[] args)
        {
            System.out.println("Welcome to Employee Wage Computation Program on Master "
                    + "Branch  ");
                int dailyWage=0;
                int empPresent = 1;
                int workingHours = 0;
                int totalWage = 0;
                int empStatus = (int) (Math.random() * 10) % 2;
                System.out.println(empStatus);
                if (empStatus == empPresent)
                {
                    System.out.println("Emp is Present ");
                    if(empStatus==IS_FULL_TIME) {
                        System.out.println("Emp Worked Full time");
                        dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    }
                }
                else
                {
                    System.out.println("Emp is not Present ");
                }
            System.out.println("Daily wage:"+dailyWage);
            }

        }




