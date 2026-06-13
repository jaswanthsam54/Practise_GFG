from abc import ABC, abstractmethod

class Shape(ABC):
    def __init__(self, c):
        # assign value of c to color attribute
        self.color = c
        
    def get_color(self):
        # returns value of color
        return self.color
        
    @abstractmethod
    def get_area(self) -> float:
        # abstract method with float return type
        pass

class Square(Shape):
    def __init__(self, c, side):
        # calls super(c) to initialize the color and assigns the value to side
        super().__init__(c)
        self.side = float(side)
        
    def get_area(self) -> float:
        # returns the area of the square (side * side)
        return self.side * self.side