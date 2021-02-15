# Splash screen
print('Soil Erosion\n')
print("Careless land management causes approximately 1.25% "
      + "of the topsoil to erode each year. It is then lost forever "
      + "since it takes nature approximately 400 years to produce "
      + "2.5cm of topsoil.  At 10cm, the topsoil is so shallow the "
      + "crops cannot grow on a large scale. If Canada has about 30cm "
      + "of topsoil, how many years will it take for the depths to "
      + "be reduced to 10cm?\n")

# VARIABLES
erodePercent = 1.25
produced = 2.5 / 400
soil = 30
year = 1

# solve for years
while soil > 10:
    erode = erodePercent * soil / 100
    soil = soil - erode + produced
    year += 1
# print results
print(year)
