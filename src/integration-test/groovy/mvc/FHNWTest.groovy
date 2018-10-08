package mvc

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
class FHNWTest extends GebSpec {

    // Defines a when-then workflow
    void "Basic FHNW"() {
        when:
        go 'https://www.fhnw.ch/de/studium/informatik'
        then:
        title == "Informatik | FHNW"
    }
}
