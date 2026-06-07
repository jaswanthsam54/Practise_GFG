#User function Template for python3
# Implement Employee and SalesEmployee class
# User function Template for python3


class Employee:

    def __init__(self, id: int, salary: int):
        """Initializes the id and salary attributes."""
        self.id = id
        self.salary = salary

    def get_info(self) -> str:
        """Returns a string formatted with Employee ID and Salary."""
        return f"EmployeeID:{self.id} Salary:{self.salary}"


class SalesEmployee(Employee):

    def __init__(self, id: int, salary: int, sales: int = 0):
        """Initializes inherited attributes using super() and sets the sales attribute."""
        super().__init__(id, salary)
        self.sales = sales

    def get_info(self) -> str:
        """Overrides the parent method to include the sales attribute."""
        return f"EmployeeID:{self.id} Salary:{self.salary} Sales:{self.sales}"