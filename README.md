"# SSF-DAY11" 

# Git commands
In project root folder
1. git init

Add files to staging
2. git add *

Commit files to local repo
3. git commit -m “initial commit”

Change branch name
4. git branch -m main

Link up remote repo to local repo
5. git remote add origin

Push code up from local repo to remote repo
6. git push -u origin main



# Maven Compiler Commands
In project root folder

Clear target directory files
1. mvnw.cmd clean

Package the compiled bytecode classes into JAR/WAR
2. mvnw.cmd package

Delete target, redownload dependencies, recompile to class file and package to JAR/WAR
3. mvnw.cmd clean package

Run the application in embedded localhost server 
4. mvnw.cmd sprint-boot:run
(Running the application without any arguments)




# Others
To run the JAR/WAR file
Just run the jar command