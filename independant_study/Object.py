class ClassName:
    def __init__(self):
        # Blank constructor
        print("Blank")

    def methodName(self):
        # Whatever you want it to do
        print("Function")
        self.__private_method()

    def __private_method(self):
        print("private")

    def __str__(self):
        return "toString"

    def __eq__(self, other):
        if self.__class__ == other.__class__:
            return True
        return False


data = ClassName()
other = ClassName();
print(data.__eq__(other))
data.methodName()