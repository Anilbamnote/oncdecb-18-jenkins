# oncdecb-18-jenkins
jenkis-projects
Pipeline
Automation of the JOBs

4 Jobs - Pipeline PULL -> BUILD -> TEST -> DEPLOYMENT (CICD) Plugins (Pipeline)

Pipeline -> Groovy Language (DSL)Domain-Specific Language, which is a scripting language used to define and manage Jenkins jobs.

 Scripted Pipeline .groovy | node Declarative Pipeline .groovy/.jdp
  | More easy to Use | pipeline

build stage
a. code integration
b. code validation
c. code compilation
d. code package

build tool:- (select devlopers, before start  project and development)
-apache maven(pom.xml),gradel(gradlew),ant

repo create--maven--project


## Maven

1.basic of maven
2. installation of maven
3. how to create a project
4. read the pom.xml file


maven phsases
maven lifecycle(bunch of phases)---maven phases---maven goles

combine multiple gols like war:war----and create lifecycle


1.default = 8 phases
2. clean
3. site

java version switch
------------------
```bash
update-alternatives --config java
```

```bash
There are 3 choices for the alternative java (providing /usr/bin/java).

  Selection    Path                                            Priority   Status
------------------------------------------------------------
*  1           /usr/lib/jvm/java-11-openjdk-amd64/bin/java       1111      auto mode
   2           /usr/lib/jvm/java-17-openjdk-amd64/bin/java       1112      manual mode
   3           /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java      1110      manual mode

Press <enter> to keep the current choice[*], or type selection number: 2
```