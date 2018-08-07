package dot.groovy
import java.util.Date

class Base {
  static void dotHi(name){
    println "hi ${name} from Base class"
    println "date: ${new Date()}" 
  }
}
