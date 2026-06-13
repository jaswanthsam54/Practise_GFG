# Implement Employee and SalesEmployee classes here
# Implement Employee and SalesEmployee classes here

class Employee:
    def __init__(self, id, salary):
        # Initializes the values to respective variables
        self.id = id
        self.salary = salary

class SalesEmployee(Employee):
    def __init__(self, id, salary, sales):
        # Calls super().__init__(id, salary) to initialize id and salary
        super().__init__(id, salary)
        # Initializes the sales attribute
        self.sales = sales