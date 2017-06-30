package de.htw.su;

public enum EmployeeCategory {	
	TRAINEE,
	JUNIOR,
	SENIOR;

  public double calculateSalary(EmployeeCategory category, double basicSalary){
    double currentSalary = 0;

    switch (category) {
      case TRAINEE:
        currentSalary = basicSalary;
        break;
      case JUNIOR:
        currentSalary = basicSalary * 2;
        break;
      case SENIOR:
        currentSalary = basicSalary * 5;
        break;
    }

    return currentSalary;
  }
}
