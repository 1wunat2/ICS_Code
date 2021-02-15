class Student:
    # Constructor
    def __init__(self):
        # Default
        self.__init__("", "", -1)

    def __init__(self, first_name, last_name, grade):
        self.first_name = first_name
        self.last_name = last_name
        self.grade = grade

    # getters
    def get_first_name(self):
        return self.first_name

    def get_last_name(self):
        return self.last_name

    def get_grade(self):
        return self.grade

    # setters
    def set_fist_name(self, first_name):
        self.first_name = first_name

    def set_last_name(self, last_name):
        self.last_name = last_name

    def set_grade(self, grade):
        if grade > 0:
            self.grade = grade

    def __str__(self):
        return self.first_name + " " + self.last_name + " in grade " + self.grade