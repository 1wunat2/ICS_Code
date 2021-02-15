# SPLASH SCREEN
print("Acid Rain\n")
print("----------\n")
print("Ph is a scale from 0 to 14 used to determine the acidity\n"
      + "of a substance whether it is acidic,  basic, or neutral.\n"
      + "This program will determine if fish will survive if there\n"
      + "is acid rain based off of it's ph\n")
# get input
ph = float(input("What is the ph level of the acid rain? "))

# check for ph on scale
if ph < 0 or ph > 14:
    print("Invalid pH value. pH must be between 0-14")
elif ph < 6.5:
    print("It is too acidic, the fish's will not survive.")
elif ph > 7.5:
    print("It is too alkaline, the fish's will not survive.")
else:
    print("It is neutral, the fish's will survive.")