# Arxml-Sorter

This project requires you to write a program that can read and reorder containers in an ARXML file. ARXML stands for Autosar XML, which is a format used by AUTOSAR (AUTomotive Open System ARchitecture), a standardization initiative for the automotive industry.


## Task Description:

Your program should perform the following steps:

1)Read an ARXML file that contains a list of containers, each with a unique ID and a name sub-container “SHORT-NAME”.

2)Reorder the containers alphabetically by their name sub-container “SHORT-NAME”.

3)Write the reordered containers to a new ARXML file with the same name as the input file, but with “_mod.arxml” appended to it. For example, if the input file is “Rte_Ecuc.arxml”, the output file should be “Rte_Ecuc_mod.arxml”.

### Requirements:

1- The name of the arxml file shall be an argument which needs to passed through the command line.

2- If the file is not having .arxml extension then you should trigger a user defined handled exception “NotVaildAutosarFileException”.

3- If the file is empty, then you should trigger user defined unhandled exception “EmptyAutosarFileException”

4- The output file shall be named as the same of the input file concatenated with “_mod.arxml”
• e.g. if the input was named “Rte_Ecuc.arxml” then the output should be “Rte_Ecuc_mod.arxml”.

5- Assume any missing requirement.


#### Files Description:

Carol.java: This is the class where contain main.

Empty.arxml: This is an empty ARXML file for testing the empty file case.

argument.arxml: This is a normal ARXML file for testing the normal case.

argument.txt: This is a text document for testing the wrong extension case.

c.bat: This is a batch file that runs your program with different input files for testing purposes.
