Total_Death = 0
Total_Cases = 0
Active_Cases = 0
Max_death_ratio = 0
Max_death_ratio_country=" "
Min_death_ratio = 100
Min_death_ratio_country=" "
Total_infected_cases = 0
Average_infected_cases = 0
Total_population = 0
Death_ratio = list()
fh = open('Covid19.txt', 'r')
fh2 = open('covidStats.txt', 'w')
for i in range(0,6,1):
    line = fh.readline()
    line = line.replace(',', '')
    line = line.split()
    Total_Cases = int(line[1])
    Total_Death = int(line[3])
    Active_Cases = int(line[2])
    Death_ratio = Total_Death/(Total_Cases-Active_Cases)
    Total_population += int(line[4])        # getting whole the population
    Total_infected_cases += Total_Cases     # getting whole the infected cases
    if Max_death_ratio < Death_ratio:       # getting max death and country name
        Max_death_ratio = Death_ratio
        Max_death_ratio_country = line[0]
    elif Min_death_ratio > Death_ratio:     # getting min death and country name
        Min_death_ratio = Death_ratio
        Min_death_ratio_country = line[0]
    fh2.write(line[0]+"\t  "+str(Death_ratio * 100)+"%\n")

Average_infected_cases = Total_infected_cases/6
fh2.write("Total infected cases = "+str(Total_infected_cases)+" and average = "+str(Average_infected_cases)+"\n")
fh2.write("Death ratio : \n")
fh2.write("Max country is ==> "+Max_death_ratio_country+"( " +str(Max_death_ratio *100 )+"% )" )
fh2.write("and min country is ==> "+Min_death_ratio_country+"( "+str(Min_death_ratio *100)+"% )")
fh.close()
fh2.close()





