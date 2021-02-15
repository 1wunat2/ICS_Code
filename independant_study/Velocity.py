# imports
import math

# splash screen
def splashScreen():
    print("Speed")
    print("---------")
    print("This program will "
          "calculate your velocity in m/s using your imputed distance at time. "
          "The movement is on a plane, there is only fwd, positive distance and "
          "bwd, negative distance")


# get user input
def data():
    d = float(input("What is your distance in meters: "))
    t = float(input("What if your time in seconds: "))
    return d, t


# calculate
def calculate_velocity(d, t):
    return d * t

# determine direction
def get_direction(v):
    if v < 0:
        return "bwd"
    elif v > 0:
        return "fwd"
    return ""

splashScreen()
(distance, time) = (4, 2)
# calculate speed
speed = calculate_velocity(distance, time)
# determine direction and add it as a string to speed
velocity = str(math.fabs(speed)) + " " + get_direction(speed)
# print results
print(velocity)
