class Solution:
    def calculate(self, a: int, b: int, operator: int) -> None:
        # Code here
        if operator == 1:
            print(a + b, end="")
        elif operator == 2:
            print(a - b, end="")
        elif operator == 3:
            print(a * b, end="")
        else:
            print("Invalid Input", end="")