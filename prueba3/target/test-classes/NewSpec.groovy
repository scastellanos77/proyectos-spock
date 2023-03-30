import spock.lang.Specification
import org.example.*

class NewSpec extends Specification {

    def "setupSpec"() {
        println " in setupSpec"
    }

    def "setup"() {
        println " in setup!!"
    }
    def "cleanup"() {
        println " in cleanup!"
    }

    def "MiPrueba"() {
        println " En Mi Prueba"
    }

    def "should be a simple assertion"() {
        expect:
        1 == 1
    }


    def "should demonstrate given-when-then"() {
        given:
        def polygon = new Polygon(3)
        println " Prueba given con Mayor o Igual a 3"

        when:
        int sides = polygon.numberOfSides
        println " Prueba when"
        then:
        sides == 4
        println " Prueba then"
    }

    def "should expect Exceptions"() {
        when:
        new Polygon(0)

        then:
        //thrown(TooFewSidesException)
        def exception = thrown(TooFewSidesException)
        exception.numberOfSides == 0
    }


}
