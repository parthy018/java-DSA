package com.codewithmosh;

public  class Employee {
    private int baseSalary;
    private int hourlyRate;

            public int calculateWage ( int extraHours){
                return baseSalary+(hourlyRate*extraHours);
                }

             public void setBaseSalary(int baseSalary){
                 if(baseSalary<=0)
                        throw new IllegalArgumentException("Salary cannot be negative or less");

                 this.baseSalary=baseSalary;
             }

            public void setHourlyRate(int hourlyRate) {
                if(hourlyRate<=0)
                    throw new IllegalArgumentException("hourlyrate cannot be 0 or less");
                this.hourlyRate = hourlyRate;
            }

            public int getHourlyRate() {
                return hourlyRate;
            }

            public int getBaseSalary() {
                return baseSalary;
            }
}
