import groovyx.net.http.URIBuilder
import groovy.json.JsonSlurper
import groovy.util.CliBuilder

class Fun {
    public static void main(String[] args) {
        def uri = new URIBuilder("http://search.maven.org/solrsearch/select")
        uri.addQueryParam 'rows', 20
        uri.addQueryParam 'wt', 'json'
        uri.addQueryParam 'q', args[0]
        
        def text = uri.toURL().getText()
        
        def json = new JsonSlurper()
        
        def result = json.parseText( text )
        
        result.response.docs.each { doc ->
            println "$doc.id:$doc.latestVersion"
        }
    }
}
