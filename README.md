@Service kinda = @Component

##

# The IMPORTANT NOTE FROM MY STICKY NOTE

***mvnw [options] [<goal(s)>] [<phase(s)>]***

./mvnw clean compile

*clean - Removed temporary directories and files
default - Where the most useful goals live
site - Where documentation is generated*

mvnw [default]
=> phase -> life cycle -> in order below

*compile - Compiles your code into bytecode
test - Runs unit tests
package - Creates a jar or war file
verify - Runs checks & integration tests*

```
to test the project:
cd target (to move to target directory)
ls (list the files => there would be a .jar file for example: quickstart-0.0.1-SNAPSHOT.jar)
java -jar quickstart-0.0.1-SNAPSHOT.jar (to run test the project but remember to run "./mvnw package" first)
```
### other way to run the project (via maven plugin)
./mvnw spring-boot:run


## NOTE:
***3 layers spring boot architecture***
 + **Presentation Layer** -> Controllers (@RestController)
 + **Service Layer** -> Business logic (@Serv ice)
 + **Persistence Layer**-> Entities (@Entity) + Repositories (@Repository)


@Service: is also a bean => able to inject this and to have dependencies injected into this class || in the services layer 
